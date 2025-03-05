package ZInterviewOOPSConcepts.SingletonSample;

public class Singleton {

    private Singleton() {

    }

    private static Singleton instance;

    public static Singleton getInstance()
    {
        // check only 1 object is created or not
        if(instance == null)
        {
            instance = new Singleton();
        }

            return instance; // else added means agian it will ask for one more return statement

    }

    @Override
    public String toString() {
        return "DRIVER";
    }
}
