package com.ruhi.invoice.design.dao;

import com.ruhi.invoice.design.model.Image;

public interface ImageDao {
	public void saveImage(Image img);
	public Image getImageById(int id); 

}
