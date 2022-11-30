package com.rds.springboot.profconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.rds.springboot.profconfig.model.Book;

@Configuration
@Profile("prod")
public class SpringProdConfiguration {
	
	@Autowired
	AppConfigProp prop;
	
	@Bean("book")
	public Book getBook() {
		return new Book(prop.getBook().getBookid(),prop.getBook().getBookname());
	}

}
