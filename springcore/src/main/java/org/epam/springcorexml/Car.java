package org.epam.springcorexml;

//import org.springframework.stereotype.Component;

public class Car implements Vehicle{

	@Override
	
	public void drive() {
		System.out.println("This is a brand new car");
	}
}
