package ZInterviewOOPSConcepts.SingletonSample;

public class Main {

    public static void main(String[] args) {

        Singleton obj1 = Singleton.getInstance();  // now new keyword and getInstatnce() method is also called

        Singleton obj2 = Singleton.getInstance();  // now new keyword and getInstatnce() method is also called

        Singleton obj3 = Singleton.getInstance();  // now new keyword and getInstatnce() method is also called

        System.out.println(obj1);  // also learnt toString
        System.out.println(obj2);  // also learnt toString
        System.out.println(obj3);  // also learnt toString
        //all 3 reference varaibles are pointing to jsut one object

    }
}
