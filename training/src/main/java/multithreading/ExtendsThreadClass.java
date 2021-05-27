package multithreading;


public class ExtendsThreadClass {
	
	public static void main(String[] args) {
		
		ThreadOne threadone = new ThreadOne();
		ThreadTwo threadtwo = new ThreadTwo();
		
		threadone.start();
		threadtwo.start();
		
	}
}
