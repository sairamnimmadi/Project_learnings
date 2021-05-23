package generics;

public class GenericType<T, U>{
	T object1;
	U object2;
	
    GenericType(T object1, U object2) {
		this.object1 = object1;
		this.object2 = object2;
	}
	
	public void print() {
		System.out.println(object1.getClass().getName());
		System.out.println(object2.getClass().getName());
	}
}