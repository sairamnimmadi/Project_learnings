package multithreading;

public class RunnableInterface implements Runnable {

	@Override
	public void run() {
		
		for(int i=1;i<=5;i++) {
					
			System.out.println("This is Thread With Id "+ Thread.currentThread().getId());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
		}

	}

}
