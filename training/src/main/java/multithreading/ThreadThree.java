package multithreading;

public class ThreadThree implements Runnable {

	@Override
	public void run() {
		
		for(int i=1;i<=5;i++) {
					
			System.out.println("This is Thread3");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
		}

	}

}
