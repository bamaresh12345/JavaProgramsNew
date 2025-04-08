package ZSeleniumProject.PracticeMethods;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class myListeners implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		
		System.out.println("This is test Senario start  onTestStart: name name **** " + result.getName());
		System.out.println("This is test Senario start onTestStart : " + result.getStatus());
		System.out.println("This is test Senario start onTestStart :NAME__> " + result.getTestName());
		System.out.println("This is test Senario start onTestStart : SeleniumAlertsandActions.MethodOverloadin " + result.getInstance());
		System.out.println("This is test Senario start onTestStart : " + result.getClass());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		System.out.println("This is test Senario start onTestSuccess :   " + result.getName());
		System.out.println("This is test Senario start onTestSuccess : " + result.getStatus());
		System.out.println("This is test Senario start onTestSuccess : " + result.getTestName());
		System.out.println("This is test Senario start onTestSuccess : " + result.getInstance());
		System.out.println("This is test Senario start  onTestSuccess : " + result.getClass());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		System.out.println("This is test Senario onTestFailure :   " + result.getName());
		System.out.println("This is test Senario onTestFailure: " + result.getStatus());
		System.out.println("This is test Senario onTestFailure : " + result.getTestName());
		System.out.println("This is test Senario onTestFailure : " + result.getInstance());
		System.out.println("This is test Senario start  onTestFailure : " + result.getClass());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		
		System.out.println("This is test Senario onStart :   " + context.getName());
		System.out.println("This is test Senario onStart : " + context.getClass());
		System.out.println("This is test Senario onStart : " + context.getEndDate());
		System.out.println("This is test Senario start  onStart : " + context.getAllTestMethods());
	}

	@Override
	public void onFinish(ITestContext context) {
		
	}

	
}
