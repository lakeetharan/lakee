package org.mvn;


import java.util.List;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runners.Suite;



	
		public class DailyTask {	
			
	@Test 
	  public  void test() {
		Result res = JUnitCore.runClasses(JunitTask.class,AdactinDailyTask.class);
		int i = res.getIgnoreCount();
		System.out.println(i);
	
   int k = res.getRunCount();
  System.out.println(k);
   
  long j = res.getRunTime();
   System.out.println(j);
   
   
   int m = res.getFailureCount();
   System.out.println(m);
   
   
   List<Failure> failures = res.getFailures();
   for (Failure f : failures) {
	   System.out.println(f);
	   
	   String msg = f.getMessage();
	   System.out.println(msg);
	   
	   
	   boolean wasSuccessful = res.wasSuccessful();
	   System.out.println(wasSuccessful);
	
}
   
		
		
	}
	
		
	}
	
	

	
	
	
	
