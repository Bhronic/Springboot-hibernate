package com.ruhi.invoice.design.service;

import java.util.List;
import com.ruhi.invoice.design.model.HsnData;

public interface HsnDataServices {
	public void save(HsnData data);
	public HsnData updateById(HsnData data,int id);
	public void deleteById(int id);
	public List<HsnData> getAllData();
	public HsnData getDataById(int id);
	public List<HsnData> searchHsnCodeByKey(String str);
}
