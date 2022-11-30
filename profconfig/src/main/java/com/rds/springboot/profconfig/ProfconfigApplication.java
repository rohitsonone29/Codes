package com.rds.springboot.profconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.rds.springboot.profconfig.model.Book;
import com.rds.springboot.profconfig.model.Employee;
import com.rds.springboot.profconfig.model.HelloWorld;

@SpringBootApplication
public class ProfconfigApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(ProfconfigApplication.class, args);
		
		Book b = (Book)context.getBean("book");
		System.out.println(b.getBookid());
		System.out.println(b.getBookname());
		
		/*
		Employee e = (Employee)context.getBean("emp");
		
		System.out.println(e.getEmpname());
		System.out.println(e.getEmpId());
		System.out.println(e.getSalary());
		
		HelloWorld h = (HelloWorld)context.getBean("hello");
		
		System.out.println(h.getMessage());
		*/
	}

}
