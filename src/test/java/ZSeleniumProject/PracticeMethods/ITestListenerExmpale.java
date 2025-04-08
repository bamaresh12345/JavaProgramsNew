package ZSeleniumProject.PracticeMethods;


import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

/*   This is the most frequently used TestNG listener. ITestListener is an interface implemented in the class, and that
class overrides the ITestListener-defined methods. The ITestListener listens to the desired events and executes the methods
 accordingly.


ITestListener
    It contains the following ways:

    onStart(): invoked after test class is instantiated and before execution of any testNG method.
    onTestSuccess(): invoked on the success of a test
    onTestFailure(): invoked on the failure of a test
    onTestSkipped(): invoked when a test is skipped
    onTestFailedButWithinSuccessPercentage(): invoked whenever a method fails but within the defined success percentage
    onFinish(): invoked after all tests of a class are executedThe above-mentioned methods use the parameters ITestContext and ITestResult. The ITestContext is a class that contains information about the test run. The ITestResult is an interface that defines the result of the test.
    Now, let’s look at an example showcasing the use of this listener.

    Below is a listener class that implements ITestListener:

  */
 public class ITestListenerExmpale implements ITestListener {

     @Override
     public void onFinish(ITestContext contextFinish) {
         System.out.println("onFinish method finished");

     }

     @Override
     public void onStart(ITestContext contextStart) {
         System.out.println("onStart method started");
     }

    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("Method started"+ result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("Method passed"+ result.getName());

    }

     @Override
     public void onTestFailure(ITestResult result) {
         System.out.println("Method failed"+ result.getName());

     }

     @Override
     public void onTestSkipped(ITestResult result) {
         System.out.println("Method skipped"+ result.getName());

     }





    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        System.out.println("Method failed with certain success percentage"+ result.getName());

    }

 }

