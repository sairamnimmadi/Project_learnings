package annotations;
import java.util.ArrayList;

//  Built in annotations

// @Override ensures that Parent and child are overriding same method

// @SupressWarnings suppress warnings issued by the compiler

// @Depricated marks that this method is deprecated so compiler prints warning

// @FunctionalInterface ensures that interface should consists of only one method in it.




@FunctionalInterface
interface Demo {
	
	void method1();
//	void method2();
}


class Parent{
	
	void message() {
		System.out.println("Hi I am Parent class");
	}
	
	@Deprecated
	
	void unusedMethod() {
		System.out.println("I am unused method");
	}
}

class Child extends Parent{
	
	// @SuppressWarnings("unchecked")
	
	
	@SuppressWarnings({ "rawtypes" })
	
	// Warning issued for the generic type by the compiler is suppressed while creating ArrayList object
	
	ArrayList obj = new ArrayList();
	
	@Override
	void message() {
		
		System.out.println("Hi I am Child class");
	}
	
}



public class DefaultAnnotationDemo {
	

	public static void main(String[] args) {
		
	}
}
