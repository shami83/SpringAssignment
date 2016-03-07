package com.example.spring.ApplicationContext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorldUsingContext {
	
	private String greet;

	public String getGreet() {
		return greet;
	}

	public void setGreet(String greet) {
		this.greet = greet;
	}
	
	
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("configFiles/context.xml");
		
		HelloWorldUsingContext bean =(HelloWorldUsingContext) ctx.getBean("helloWorld");
		System.out.println(bean.getGreet());
		
		
	}
	
	

}
