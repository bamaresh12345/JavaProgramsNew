package TLeanringDontCheckThisFolder;

import java.util.Scanner;

public class reverseNUbmerThreeWays {

    public static void main(String[] args) {

        int n=1234;

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the nubmer : ");
       //int n= sc.nextInt();

        int last = 0;
        int  rev = 0;
        int sum=0;
        int count=0;
        int temp= n;
        int evenCount=0,oddCount=0;

        while(n >0)
        {
           last = n%10;
           sum = sum + last; // SUM
           count++;          // Count
           rev = (rev*10) + last; // reverse

            if(last%2==0)
            {
                evenCount++;
            }
            else
            {
                oddCount++;
            }

           n = n/10;
        }

        System.out.println("reverse number " + rev);
        System.out.println("sum1234 number " + sum);
        System.out.println("number count " + count);
        System.out.println("Even number count " + evenCount);
        System.out.println("Odd number count " + oddCount);

        if(rev == temp)
            System.out.println("palandrome");
        else
            System.out.println("NO palandrome");

        //  Method 2
        StringBuffer sb = new StringBuffer(String.valueOf(temp));  // String.valueOf(temp) ***
        StringBuffer rev2= sb.reverse(); // ** IMP StringBuffer
        System.out.println("reverse number Method 2 " + rev2);

        //  Method 2
        StringBuilder sb1 = new StringBuilder(String.valueOf(temp));  // String.valueOf(temp) ***
        StringBuilder rev3= sb1.reverse(); // ** IMP StringBuffer
        System.out.println("reverse number Method 3 " + rev3);
    }
}
