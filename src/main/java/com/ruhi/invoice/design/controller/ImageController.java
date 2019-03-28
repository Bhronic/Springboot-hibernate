package com.ruhi.invoice.design.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Blob;

import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.databind.deser.ValueInstantiators.Base;
import com.ruhi.invoice.design.model.Image;
import com.ruhi.invoice.design.service.ImageServices;

@RestController
@RequestMapping(value="/image")
public class ImageController {
	@Autowired
	ImageServices services;
	@RequestMapping(value="/page",method=RequestMethod.GET)
	public ModelAndView openPage() {
		ModelAndView page = new ModelAndView();
		page.setViewName("storeimage");
		return page;
	}
	
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public String saveImage(@RequestParam("file") MultipartFile data) throws IOException {
		byte[] bFile = new byte[(int) data.getSize()];
		bFile = data.getBytes();
		Image img = new Image();
		img.setImgName(data.getOriginalFilename());
		img.setImgData(bFile);
		services.save(img);
		return "success";
	}
	
	@RequestMapping(value="/showimage/{id}",method=RequestMethod.GET)
	public ModelAndView showImage(@PathVariable int id) throws IOException {
		Image img = services.getImageById(id);
		byte[] encoded=Base64.encodeBase64(img.getImgData());
		//System.out.println("encoded byte = "+encoded);
		String encodedString = new String(encoded);
		//System.out.println("encoded string = "+encodedString);
		ModelAndView model = new ModelAndView();
		model.setViewName("viewimage");
		model.addObject("img", img);
		model.getModelMap().put("image", encodedString);
		return model;
	}
}
