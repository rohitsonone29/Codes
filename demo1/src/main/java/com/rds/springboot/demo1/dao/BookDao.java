package com.rds.springboot.demo1.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


import org.springframework.stereotype.Service;

import com.rds.springboot.demo1.model.Book;

@Service
public class BookDao {
	
	List<Book> bookarr;
	
	public BookDao()
	{
		bookarr = new ArrayList<Book>();
		
		bookarr.add(new Book(1,"SpringBoot Restful","abc",2));
		bookarr.add(new Book(2,"SpringBoot microservices","abc",1));
		bookarr.add(new Book(3,"SpringBoot MVC","abc",5));
	}
	
	public boolean addBook(Book b)
	{
		this.bookarr.add(b);
		return true;
	}
	
	public Book getBook(int bookid)
	{
		
		 Book book = bookarr.stream().filter((b)->{ return
				 b.getBookId()==bookid; }).findFirst().orElse(null);
		 
		 System.out.println(book);
		 return book;
		 
		 
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
	
	
	public boolean removeBook(Book b)
	{
		
		
		return this.bookarr.remove(b);
		
		
	}
	
	
	public boolean removeBook1(int bookId)
	{
		
	  return this.bookarr.removeIf(b->b.getBookId()==bookId);
		
		
	}


	public List<Book> getAllBooks()
	{
		return this.bookarr;
	}
}
