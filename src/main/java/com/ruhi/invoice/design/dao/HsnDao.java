package com.ruhi.invoice.design.dao;

import java.util.List;
import com.ruhi.invoice.design.model.HsnData;

public interface HsnDao {
	public void saveData(HsnData hsnData);
	public HsnData updateById(HsnData hsn, int id);
	public void deleteById(int id);
	public List<HsnData> getAllData();
	public HsnData getDataById(int id);
	public List<HsnData> searchHsnCodeByKey(String str);

}
