package com.rds.springboot.profconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.rds.springboot.profconfig.model.HelloWorld;

@Configuration
@Profile("dev")
public class SpringDevConfiguration {
	
	@Autowired
	AppConfigProp prop;
		
		@Bean("hello")
		public HelloWorld getHello()
		{
			//return new HelloWorld("Hi Everyone");
			return new HelloWorld(prop.getMessage());
		}
		
}
