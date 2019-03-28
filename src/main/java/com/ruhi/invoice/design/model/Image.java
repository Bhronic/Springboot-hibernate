package com.ruhi.invoice.design.model;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Blob;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
@Entity
public class Image {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String imgName;
	@Lob
	private byte[] imgData;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public byte[] getImgData() {
		return imgData;
	}
	public void setImgData(byte[] imgData) {
		this.imgData = imgData;
	}
	public String getImgName() {
		return imgName;
	}
	public void setImgName(String imgName) {
		this.imgName = imgName;
	}
	

}
