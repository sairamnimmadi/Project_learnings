package multithreading;


public class ExtendsThreadClass {
	
	public static void main(String[] args) {
		
		ThreadClass threadone = new ThreadClass();
		ThreadClass threadtwo = new ThreadClass();
		
		threadone.start();
		threadtwo.start();
		
	}
}
