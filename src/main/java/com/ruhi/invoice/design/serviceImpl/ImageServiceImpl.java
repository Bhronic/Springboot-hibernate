package com.ruhi.invoice.design.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ruhi.invoice.design.dao.ImageDao;
import com.ruhi.invoice.design.model.Image;
import com.ruhi.invoice.design.service.ImageServices;
@Service
@Transactional
public class ImageServiceImpl implements ImageServices{
	@Autowired
	ImageDao dao;

	@Override
	public void save(Image img) {
		dao.saveImage(img);
		
	}

	@Override
	public Image getImageById(int id) {
		Image img = dao.getImageById(id);
		return img;
	}

}
