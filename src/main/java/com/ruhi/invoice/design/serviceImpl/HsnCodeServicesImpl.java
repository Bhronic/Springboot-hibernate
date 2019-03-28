package com.ruhi.invoice.design.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ruhi.invoice.design.dao.HsnDao;
import com.ruhi.invoice.design.model.HsnData;
import com.ruhi.invoice.design.service.HsnDataServices;
@Service
@Transactional
public class HsnCodeServicesImpl implements HsnDataServices{
	@Autowired
	HsnDao dao;

	@Override
	public void save(HsnData data) {
		dao.saveData(data);
		
	}

	@Override
	public HsnData updateById(HsnData data, int id) {
		return dao.updateById(data, id);
	}

	@Override
	public void deleteById(int id) {
		dao.deleteById(id);
	}

	@Override
	public List<HsnData> getAllData() {
		return dao.getAllData();
	}

	@Override
	public HsnData getDataById(int id) {
		return dao.getDataById(id);
	}

	@Override
	public List<HsnData> searchHsnCodeByKey(String str) {
		return dao.searchHsnCodeByKey(str);
	}
}
