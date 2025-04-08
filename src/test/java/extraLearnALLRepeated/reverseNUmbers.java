package extraLearnALLRepeated;

import java.util.*;

public class reverseNUmbers {


    public static void main(String[] args) {

        int n=123;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter nubmer : ");
        n = sc.nextInt();

        reversNubmer(n);

        String s = "" + n;

        StringBuilder sb= new StringBuilder(s);
        sb.reverse();
        System.out.println("rev --> " +sb.toString());
        String rev="";
        for (int i = 0; i < s.length(); i++) {

            rev = s.charAt(i) + rev;
        }

        System.out.println("str rev--> " + Integer.parseInt(rev));

        StringBuffer sf= new StringBuffer(s);
        sf.reverse();
        System.out.println("rev --> " +sf.toString());
    }

    private static void reversNubmer(int n) {
        int last=0;
        int sum=0;
        int rev=0;
        int temp=n;

        int evennum=0;
        int oddnum=0;

        int count=0;

        while(n>0)
        {
            last = n % 10;
            count++;

            if(last%2==0)
            {
                System.out.println("even nubmer " +last);
                evennum++;
            }
            else
            {
                System.out.println("odd" + last);
                oddnum++;
            }
            rev = (rev*10) + last;

            sum = sum + last;

            n = n/10;

        }

        System.out.println("reversnumb " + rev);
        System.out.println("reversnumb " + sum);
        System.out.println("reversnumb " + count);
        System.out.println("even nubmer " + evennum);
        System.out.println("odd nun  " + oddnum);

        System.out.println("palandrome? " + (rev==temp));
    }
}
