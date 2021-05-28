package multithreading;

public class ImplementsRunnableInterface {
	
	public static void main(String[] args) {
		
		Thread threadone = new Thread(new RunnableInterface());
		Thread threadtwo = new Thread(new RunnableInterface());
		
		threadone.start();
		threadtwo.start();
		
	}
	
}
