package com.ruhi.invoice.design.service;

import com.ruhi.invoice.design.model.Image;

public interface ImageServices {
	public void save(Image img);
	public Image getImageById(int id);

}
