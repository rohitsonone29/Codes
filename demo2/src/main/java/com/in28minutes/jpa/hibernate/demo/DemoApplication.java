package com.in28minutes.jpa.hibernate.demo;
 
 
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
 

import com.in28minutes.jpa.hibernate.demo.entity.Employee;
import com.in28minutes.jpa.hibernate.demo.entity.Student;
import com.in28minutes.jpa.hibernate.demo.repository.EmployeeRepository;
import com.in28minutes.jpa.hibernate.demo.repository.StudentRepository;
 

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
 
    private Logger logger = LoggerFactory.getLogger(this.getClass());
 

    @Autowired
    private EmployeeRepository employeeRepository;
    
    @Autowired
    private StudentRepository studentrepository;
 
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
 
    @Override
    public void run(String... arg0) throws Exception {
    	
    	studentrepository.insert(new Student(12,"Rahul"));

        logger.info("Students -> {}", 
                studentrepository.retrieveStudents());
             
   
        employeeRepository.insert(new Employee("Ram"));

        logger.info("Full Time Employees -> {}", 
                employeeRepository.retrieveEmployees());
                
                
    }
}