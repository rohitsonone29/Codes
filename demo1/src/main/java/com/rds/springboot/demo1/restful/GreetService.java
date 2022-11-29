package com.rds.springboot.demo1.restful;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import com.rds.springboot.demo1.model.HelloWorldBean;

@RestController
public class GreetService {
	
	@Value("${name}")
	String myname;
	
	@GetMapping("greet")
	public String greatAll() {
		System.out.println("HIIIIIII!!!!!");
		return "Hello World";
	}
	
	@GetMapping("greet1/{msg}")
    public String greetMsg(@PathVariable String msg)
    {
        System.out.println("msg="+msg+","+myname);
        return msg+","+myname;
    }

    @GetMapping("greet2")
    public String greetByName(@RequestParam String name)
    {
        System.out.println("name="+name);
        return "Hi "+name;
    }

    @GetMapping("greet3")
    public String greetByName(@RequestParam String name,@RequestParam String surname)
    {
        System.out.println(name+","+surname);
        return "Hi "+name+" "+surname;
    }
    
    @GetMapping("sayhi")
    public HelloWorldBean getMessage()
    {
        return new HelloWorldBean("Hi Folks!",5);
    }

    @PostMapping("sethellobean")
    public String setHelloBean(@RequestBody HelloWorldBean b)
    {
        System.out.println(b.getMessage());
        System.out.println(b.getNousers());

        return "you have sent message as:"+b.getMessage()+" with no of users:"+b.getNousers();
    }

}
