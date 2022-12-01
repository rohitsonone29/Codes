package com.in28minutes.jpa.hibernate.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
    private int rollno;
	
	private String name;
	
	protected Student() {
	    } 

	public Student(int rollno, String name) {
		super();
		this.rollno=rollno;
		this.name = name;
	}



	public int getId() {
		return rollno;
	}

	public void setId(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + "]";
	}
	
	 

}
