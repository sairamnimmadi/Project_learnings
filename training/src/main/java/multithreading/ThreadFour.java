package multithreading;

public class ThreadFour implements Runnable{

	@Override
	public void run() {
		
		for(int i=1;i<=5;i++) {
					
			System.out.println("This is Thread4");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
		}

	}

}
