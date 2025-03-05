package ZSeleniumProject.TestNGListeners;
import org.testng.IExecutionListener;

public class MyListeneriExecutionExmaple implements IExecutionListener {
// refer --> https://www.browserstack.com/guide/testng-listeners#:~:text=Listeners%20are%20TestNG%20annotations%20that,the%20reason%20for%20its%20failure.
    @Override
    public void onExecutionFinish() {
        long endTime= System.currentTimeMillis();
        System.out.println("Inform all the suite have finished execution at"+ endTime);

    }



    @Override
    public void onExecutionStart() {
        long startTime= System.currentTimeMillis();
        System.out.println("Inform all the suite have started execution at"+ startTime);

    }

}
