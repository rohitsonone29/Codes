package com.rds.springboot.profconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.rds.springboot.profconfig.model.Employee;

@Configuration
public class SpringDefaultConfiguration {
	
	@Autowired
	AppConfigProp prop;
	
	@Bean(name="emp")
	public Employee myemp()
	{
		int id=prop.getEmp().getEmpId();
		String s=prop.getEmp().getEmpname();
		Double d=prop.getEmp().getSalary();
		
		return new Employee(id,s,d);
		//return new Employee(1,"Rahul",30000.0);
		
	}

}
