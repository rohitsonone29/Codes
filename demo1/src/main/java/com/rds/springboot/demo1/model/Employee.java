package com.rds.springboot.demo1.model;

import java.util.Objects;

public class Employee {
	
	private String empname;
	private int empId;
	private String location;
	private int deptid;
	
	
	public Employee()
	{
		System.out.println("Employee bean created..");
	}


	public Employee(int empId, String empname, String location, int deptid) {
		super();
		this.empname = empname;
		this.empId = empId;
		this.location = location;
		this.deptid = deptid;
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


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public int getDeptid() {
		return deptid;
	}


	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}


	@Override
	public String toString() {
		return "Employee [empname=" + empname + ", empId=" + empId + ", location=" + location + ", deptid=" + deptid
				+ "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		return  this.empId == ((Employee)obj).empId;
	}

}

