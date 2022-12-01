package com.in28minutes.jpa.hibernate.demo.entity;
 
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
 

@Entity
public  class Employee {
 
    @Id
    @GeneratedValue
    private Long eid;
 
    @Column(nullable = false)
    private String name;
 
    protected Employee() {
    }
 
    public Employee(String name) {
        this.name = name;
    }
 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public Long getId() {
        return eid;
    }
 
    @Override
    public String toString() {
        return String.format("Employee[%s]", name);
    }
}