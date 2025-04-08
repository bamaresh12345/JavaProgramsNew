package TLeanringDontCheckThisFolder;

public class SwapTwoNubmers {

    public static void main(String[] args)
    {
        int a=10,b=20;

        a= a+b;
        b=a-b;
        a=a-b;

        System.out.println("a= " +a + "  b= "+ +b);

        int temp=a;
        a=b;
        b=temp;

        System.out.println("a= " +a + "  b= "+ +b);

        a = a*b;
        b = a/b;
        a = a/b;
        System.out.println("a= " +a + "  b= "+ +b);


    }
}
