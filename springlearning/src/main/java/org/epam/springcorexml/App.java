package org.epam.springcorexml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
//		Vehicle object = (Vehicle)context.getBean("vehicle");
//		object.drive();
		
		Tyre tyre = (Tyre)context.getBean("tyre");
		System.out.println(tyre);
	}
	
}
