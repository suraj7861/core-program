package Practice;

import java.util.concurrent.TimeUnit;

public class StopWatch {

	public static void main(String[] args) throws InterruptedException {
	   System.out.println("Start the stop watch");
	   long startOfTask = System.currentTimeMillis();
	   
	   TimeUnit.SECONDS.sleep(2);
	   long endOfTask = System.currentTimeMillis();
	   long elapsedTime = endOfTask - startOfTask;
	   System.out.println("total time taken to complete task: "+elapsedTime);
	}

}
