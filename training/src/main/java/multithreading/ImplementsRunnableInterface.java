package multithreading;

public class ImplementsRunnableInterface {
	
	public static void main(String[] args) {
		
		Thread threadthree = new Thread(new ThreadThree());
		Thread threadfour = new Thread(new ThreadFour());
		
		threadthree.start();
		threadfour.start();
		
	}
	
}
