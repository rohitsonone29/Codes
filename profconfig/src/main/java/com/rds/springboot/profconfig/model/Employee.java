package com.rds.springboot.profconfig.model;

import java.util.Objects;

public class Employee {
	
	private String empname;
	private int empId;
	private double salary;
	


	public Employee(int empId, String empname, Double salary) {
		super();
		this.empId = empId;
		this.empname = empname;
		this.salary = salary;
	}


	public String getEmpname() {
		return empname;
	}


	public void setEmpname(String empname) {
		this.empname = empname;
	}


	public int getEmpId() {
		return empId;
	}


	public void setEmpId(int empId) {
		this.empId = empId;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "Employee [empname=" + empname + ", empId=" + empId + ", salary=" + salary + "]";
	}

	

}

