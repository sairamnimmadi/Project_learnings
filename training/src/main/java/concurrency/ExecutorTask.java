package concurrency;

import java.text.MessageFormat;

public class ExecutorTask implements Runnable{
	
	java.util.logging.Logger logger;
	

	private String threadNo;
	
	
	
	public ExecutorTask(String threadNo) {
		
		this.threadNo = threadNo;
	}

	@Override
	public void run() {
		
		MessageFormat.format("{0} start execution. Thread No = {1}", Thread.currentThread().getName() , threadNo);
		
		try {
            Thread.sleep(5000); 
        } catch (InterruptedException e) { 
        
        	Thread.currentThread().interrupt();
        }  
		
		MessageFormat.format("{0} stop execution.", Thread.currentThread().getName()); 
	}

}
