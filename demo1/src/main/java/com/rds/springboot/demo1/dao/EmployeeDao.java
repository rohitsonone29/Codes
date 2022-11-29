package com.rds.springboot.demo1.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


import org.springframework.stereotype.Service;

import com.rds.springboot.demo1.model.Employee;

@Service
public class EmployeeDao {
	
	List<Employee> emparr;
	
	public EmployeeDao()
	{
		emparr = new ArrayList<Employee>();
		
		emparr.add(new Employee(1,"Abhi","Pune",10));
		emparr.add(new Employee(2,"Kunal","Mumbai",12));
		emparr.add(new Employee(3,"Akshay","Pune",18));
	}
	
	public boolean addEmployee(Employee b)
	{
		this.emparr.add(b);
		return true;
	}
	
	public Employee getEmployee(int empid)
	{
		
		Employee emp = emparr.stream().filter((b)->{ return
				 b.getEmpId()==empid; }).findFirst().orElse(null);
		 
		 System.out.println(emp);
		 return emp;
		 
		 
		/*
		 * Optional<Book> book = bookarr.stream().filter((b)->{ return
		 * b.getBookId()==bookid; }).findFirst();
		 * 
		 * if(book.isPresent()) return book.get(); else return null;
		 */
		
		
		/*
		Iterator<Book>  itr = bookarr.iterator();
		Book b1 = null;
		while(itr.hasNext())
		{
			b1 = itr.next();
			if(b1.getBookId() == bookid)
			{
				return b1;
			}
		}
		
		return null;
		*/
		
		
		
		
		
	}
	
	
	public int removeEmployee(Employee b)
	{
		
		
		boolean status = this.emparr.remove(b);
		
		if(status)
		  return b.getEmpId();
		else
			return -1;
	}
	
	/*
	public int removeBook(int bookId)
	{
		
	  //this.bookarr.toArray();
		
		
	}
	*/

	public List<Employee> getAllEmployees()
	{
		return this.emparr;
	}
}
