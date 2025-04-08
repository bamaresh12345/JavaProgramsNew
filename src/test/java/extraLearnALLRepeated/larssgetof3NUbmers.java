package extraLearnALLRepeated;

public class larssgetof3NUbmers {

    public static void main(String[] args) {
        int a=2009,b=45, c=138;

        if(a>b && a> c)
        {
            System.out.println("a largets" + a);
        }

        else if(b>c && b > a)
        {
            System.out.println("blarge" + b);
        }

        else
        {
            System.out.println("c large" +c);
        }

        int largest = (a>b)? a : b;

        int finalarge = (largest>c)?  largest :c;

        System.out.println("fnallarge" +finalarge);

    }
}
