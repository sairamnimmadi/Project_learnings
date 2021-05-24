package java_8;

import java.time.LocalDate;

public class DateExample {
	
	public static void main(String[] args) {  
	    LocalDate date = LocalDate.now();  
	    LocalDate yesterday = date.minusDays(1);  
	    LocalDate tomorrow = yesterday.plusDays(2);  
	    LocalDate nonleapyear = LocalDate.of(2017, 1, 13);  
	    LocalDate leapyear = LocalDate.of(2016, 9, 23); 
	    
	    System.out.println("Today date: "+date);  
	    System.out.println("Yesterday date: "+yesterday);  
	    System.out.println("Tommorow date: "+tomorrow);  
	    System.out.println(nonleapyear.isLeapYear()); 
	    System.out.println(leapyear.isLeapYear());
	  }  
}
