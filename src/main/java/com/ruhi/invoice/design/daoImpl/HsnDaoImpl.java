package com.ruhi.invoice.design.daoImpl;

import java.io.FileInputStream;
import java.util.List;
import javax.persistence.TypedQuery;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.ruhi.invoice.design.dao.HsnDao;
import com.ruhi.invoice.design.model.HsnData;

@Repository
@Transactional
public class HsnDaoImpl implements HsnDao{
	@Autowired
	private SessionFactory sessionFactory;
	
	private Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	@Override
	public List<HsnData> getAllData() {
		@SuppressWarnings("unchecked")
		List<HsnData> list =getSession().createCriteria(HsnData.class).list();
		return list;
	}

	@Override
	public HsnData getDataById(int id) {
		HsnData hsnData = getSession().get(HsnData.class, id);
		return hsnData;
	}

	@Override
	public List<HsnData> searchHsnCodeByKey(String str) {
		Query query =getSession().createQuery("from HsnData where description like :str or hsnCode like :str");
		query.setParameter("str", "%"+str+"%");
		@SuppressWarnings("unchecked")
		List<HsnData> list = query.list();
		return list;
	}

	@Override
	public HsnData updateById(HsnData val, int id) {
		HsnData hsnData = getSession().get(HsnData.class, id);
		hsnData.setHsnCode(val.getHsnCode());
		hsnData.setGstRate(val.getGstRate());
		hsnData.setCgstRate(val.getCgstRate());
		hsnData.setSgstRate(val.getSgstRate());
		hsnData.setEffectiveFrom(val.getEffectiveFrom());
		getSession().update(hsnData);
		return hsnData;
	}

	@Override
	public void saveData(HsnData data) {
		getSession().save(data);
	}

	@Override
	public void deleteById(int id) {
		HsnData hsnData = getDataById(id);
		getSession().delete(hsnData);
	}
}
