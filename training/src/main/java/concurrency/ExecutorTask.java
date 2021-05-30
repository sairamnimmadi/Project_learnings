package concurrency;

public class ExecutorTask implements Runnable{

	private String threadNo;
	
	public ExecutorTask(String threadNo) {
		
		this.threadNo = threadNo;
	}

	@Override
	public void run() {
		
		System.out.println(Thread.currentThread().getName()+" start execution. Thread No = "+threadNo);
		
		try {
            Thread.sleep(5000); 
        } catch (InterruptedException e) { }  
		
		System.out.println(Thread.currentThread().getName()+" stop execution."); 
	}

}
