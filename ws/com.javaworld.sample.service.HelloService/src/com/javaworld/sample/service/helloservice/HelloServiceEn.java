package com.javaworld.sample.service.helloservice;

public class HelloServiceEn implements HelloService {
	String language = "Language=English";
	
	 public String sayHello() {
		 System.out.println("Inside HelloServiceImple.sayHello()");
		 System.out.println(this.language);
		 return "Hello";
	 }
}
