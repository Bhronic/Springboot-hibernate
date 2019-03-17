package com.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("employee")
public class EmpController {
	@Autowired
	service service;
	
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public String saveEmp(@RequestBody Employee emp) {
		service.save(emp);
		return "success";
	}
	@RequestMapping(value="/getEmployee",method=RequestMethod.GET)
	public List<Employee> viewAllEmp() {
		List<Employee> list =service.getAllEmp();
		return list;
	}
}
