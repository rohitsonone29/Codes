package com.rds.springboot.demo1.webcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.rds.springboot.demo1.dao.BookDao;
import com.rds.springboot.demo1.dao.EmployeeDao;
import com.rds.springboot.demo1.model.Book;
import com.rds.springboot.demo1.model.Employee;

@Controller
public class EmployeeController {
	
	@Autowired
	EmployeeDao empdao;
	
	@GetMapping("emp1/{empid}")
	public String getEmpDetails(@PathVariable int empid,ModelMap model)
	{
		System.out.println("inside getempdetails..");
		
	    Employee b=empdao.getEmployee(empid);
		
		if(b!=null)
			model.addAttribute("emp1",b);
		else
			model.addAttribute("msg","employee with empid:"+empid+"not found");
		
		return "employee";
	}
}
