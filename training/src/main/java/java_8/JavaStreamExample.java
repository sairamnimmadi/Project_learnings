package java_8;

import java.util.ArrayList;
import java.util.List;

public class JavaStreamExample {

	 public static void main(String[] args) {  
	        List<Product> productsList = new ArrayList<Product>();  
	        
	        productsList.add(new Product(1,"HP Laptop",25000f));  
	        productsList.add(new Product(2,"Dell Laptop",30000f));  
	        productsList.add(new Product(3,"Lenevo Laptop",28000f));  
	        productsList.add(new Product(4,"Sony Laptop",35000f));  
	        productsList.add(new Product(5,"Apple Laptop",90000f));  
	        
	        productsList.stream()  
	        		
	         .filter(p -> p.price > 30000)
	                                     
             .map(p->"The product is" + p.name + "and its cost is "+p.price)
	                                     
             .forEach(System.out::println);
	    } 
}
