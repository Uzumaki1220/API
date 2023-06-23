package TestNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class l implements ITestListener {
	public void onTestSuccess(ITestResult result) {
	    // not implemented
		System.out.println("lstners on test success");
	  }
	
	///////////////////////viajicacjjad

	 
	public void onTestFailure(ITestResult result) {
	    // not implemented
		System.out.println("name:"+	result.getName());
	  }

	
	  public  void onTestSkipped(ITestResult result) {
	    // not implemented
	  }

	
	  public  void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	    // not implemented
	  }

	  public  void onTestFailedWithTimeout(ITestResult result) {
	    onTestFailure(result);
	  }

	 
	  public  void onStart(ITestContext context) {
	    // not implemented
	  }

	
	  public  void onFinish(ITestContext context) {
	    // not implemented
	  }

}
