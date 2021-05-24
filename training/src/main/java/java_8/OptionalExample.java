package java_8;

import java.util.Optional;

public class OptionalExample {

	public static void main(String[] args) {  
		
        String[] str = new String[10];  
        
        str[0] = "OPTIONAL EXAMPLE";   
        
        Optional<String> checkNull = Optional.ofNullable(str[0]);  
        
        checkNull.ifPresent(System.out::println);
       
        System.out.println(checkNull.get());     
    }  
}
