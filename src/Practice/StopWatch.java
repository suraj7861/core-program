package practice;

import java.util.concurrent.TimeUnit;

public class StopWatch {

	public static void main(String[] args) throws InterruptedException {
	   System.out.println("Start the stop watch");
	   //get current time in millisecond
	   long startOfTask = System.currentTimeMillis();
	   //sleep for 2 second
	   TimeUnit.SECONDS.sleep(2);
	   long endOfTask = System.currentTimeMillis();
	   long elapsedTime = endOfTask - startOfTask;
	   System.out.println("total time taken to complete task: "+elapsedTime);
	}

}
