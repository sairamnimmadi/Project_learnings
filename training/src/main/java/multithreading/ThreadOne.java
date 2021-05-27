package multithreading;

public class ThreadOne extends Thread {
	
	@Override
	public void run() {
		
		for(int i=1;i<=5;i++) {
			
			System.out.println("This is Thread1");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
		}
	}
}
