package com.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class service {
	@Autowired
	EmpDao dao;
	
	public void save(Employee emp) {
		dao.saveEmp(emp);
	}
	
	public List<Employee> getAllEmp() {
		List<Employee> list = dao.getEmp();
		return list;
	}

}
