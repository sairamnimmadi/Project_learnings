package generics;

public class GenericDemo {
	
	public static void main(String[] args) {
		
		GenericType <Integer, String> obj = new GenericType<Integer, String>(21,"Sairam");
		
		obj.print();
	}
}

