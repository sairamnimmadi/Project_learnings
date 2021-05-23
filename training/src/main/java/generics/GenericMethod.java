package generics;

public class GenericMethod {

	static <T> void displayDetails(T element) {
		System.out.println(element.getClass().getName()+" = "+ element);
	}
	
	public static void main(String[] args) {
		displayDetails(12334);
		displayDetails("sairam");
		displayDetails(3.14);
	}
}
