package concurrency;

import java.util.concurrent.ForkJoinPool;

public class ForkJoinDemo {

	public static void main(String[] args) throws InterruptedException{
		
		int processors = Runtime.getRuntime().availableProcessors();
		
		System.out.println("Number of avaliable core in processor is "+ processors);
		
		ForkJoinPool pool = ForkJoinPool.commonPool();
		
		System.out.println("Number of active thread before invoking: "+ pool.getActiveThreadCount());
	              
        FrokTask task = new FrokTask(400);
          
        pool.invoke(task);
          
        System.out.println("Number of active thread after invoking: "+ pool.getActiveThreadCount());
        
        System.out.println("Common Pool Size is: " + pool.getPoolSize());
	}
}
