package TLeanringDontCheckThisFolder;

public class FindLargestofThreeNUbmers {

    public static void main(String[] args) {
        int a=20, b=3,c=12;

        // Method 1
        if(a > b && a> c)
        {
            System.out.println("A is the gratest of 3 nubmers : " + a);
        }
        else if(b>a && b> c)
        {
            System.out.println("B is the gratest of 3 nubmers : " + b);
        } else if (c> a && c > b) {
            System.out.println("C is the gratest of 3 nubmers : " + c);
        }

        //Method 2

        int large = a>b? a : b;
        int largest = large>c? large : c;

        System.out.println("largest number : " +largest);

    }
}
