package com.ruhi.invoice.design.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
public class HsnData {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private int hsnCode;
	private double gstRate;
	private double cgstRate;
	private double sgstRate;
	private Date effectiveFrom;
	private String description;
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getHsnCode() {
		return hsnCode;
	}
	public void setHsnCode(int hsnCode) {
		this.hsnCode = hsnCode;
	}
	public double getGstRate() {
		return gstRate;
	}
	public void setGstRate(double gstRate) {
		this.gstRate = gstRate;
	}
	public double getCgstRate() {
		return cgstRate;
	}
	public void setCgstRate(double cgstRate) {
		this.cgstRate = cgstRate;
	}
	public double getSgstRate() {
		return sgstRate;
	}
	public void setSgstRate(double sgstRate) {
		this.sgstRate = sgstRate;
	}
	public Date getEffectiveFrom() {
		return effectiveFrom;
	}
	public void setEffectiveFrom(Date effectiveFrom) {
		this.effectiveFrom = effectiveFrom;
	}
	

}
