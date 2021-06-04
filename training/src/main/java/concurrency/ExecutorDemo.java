package concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class ExecutorDemo {
	
	private static final Logger LOGGER = LogManager.getLogger(ExecutorDemo.class);
	
	public static void main(String[] args) {
		
		ExecutorService executorService = Executors.newFixedThreadPool(5);
		
		for (int j = 0; j < 5; j++) {  
       
            Runnable task = new ExecutorTask("" + j);  
             
            executorService.execute(task);  
          }  

        executorService.shutdown();  
        
        while (!executorService.isTerminated()) {  
        	
        }  
        LOGGER.info("Finished all threads");
   
	}
}
