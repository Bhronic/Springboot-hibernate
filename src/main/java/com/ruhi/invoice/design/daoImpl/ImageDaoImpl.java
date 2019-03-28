package com.ruhi.invoice.design.daoImpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ruhi.invoice.design.dao.ImageDao;
import com.ruhi.invoice.design.model.Image;

import sun.net.www.content.image.gif;
@Repository
@Transactional
public class ImageDaoImpl implements ImageDao{
	@Autowired
	private SessionFactory factory;
	
	private Session getSession() {
		return factory.getCurrentSession();
	}

	@Override
	public void saveImage(Image img) {
		getSession().save(img);
	}

	@Override
	public Image getImageById(int id) {
		Image img = getSession().get(Image.class, id);
		return img;	
	}
	

}
