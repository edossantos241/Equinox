/**
 * 
 */
package com.javaworld.sample.service.helloservice;

/**
 * @author Kamal AARAB & Emma DOS SANTOS
 *
 */
public class HelloServiceFr implements HelloService {
	String language = "Language=French";
	
	public String sayHello() {
		 System.out.println("Inside HelloServiceImple.sayHello()");
		 System.out.println(this.language);
		 return "Bonjour";
	 }
}
