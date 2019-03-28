package com.ruhi.invoice.design.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.ruhi.invoice.design.model.HsnData;
import com.ruhi.invoice.design.service.HsnDataServices;

@RestController
@RequestMapping(value="/hsndata")
public class HsnCodeController {
	@Autowired
	HsnDataServices services;
	
	@PostMapping(value="/save")
	public String save(@RequestBody HsnData data) {
		services.save(data);
		return "success";
	}
	
	@PostMapping(value="/update")
	public String update(@RequestBody HsnData data) {
		int id = data.getId();
		services.updateById(data, id);
		return "updated success fully";
	}
	
	@PostMapping(value="/delete/{id}")
	public String delete(@PathVariable int id) {
		services.deleteById(id);
		return "deleted successfully";
	}
	@RequestMapping(value="/getalldata",method=RequestMethod.GET)
	public List<HsnData> getAllData() {
		List<HsnData> list = services.getAllData();
		return list;
	}
	
	@RequestMapping(value="/getdatabyid/{id}",method=RequestMethod.GET)
	public HsnData getDataById(@PathVariable int id) {
		HsnData data = services.getDataById(id);
		return data;
	}
	@RequestMapping(value="/searchdata/{str}",method=RequestMethod.GET)
	public List<HsnData> searchByKey(@PathVariable String str){
		List<HsnData> list = services.searchHsnCodeByKey(str);
		return list;
	}

}
