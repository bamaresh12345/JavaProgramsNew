package TLeanringDontCheckThisFolder;

public class febonniceNumbers {

    public static void main(String[] args) {

        int a=0;
        int b=1;
        int c=0;

        int n=10;

        for (int i = 0; i < n; i++) {

            a=b;
            b=c;
            c= a+b;
            System.out.print(c + " ");


        }

    }
}
