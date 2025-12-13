package TlearningWorkDay;

public class ReverseStringThreeWays {


    public static void main(String[] args)
    {
        String s = "Testing";
        String rev="";
        for(int i =0; i<s.length(); i++)
        {
            rev = s.charAt(i) + rev;
        }

        System.out.println("Actual rev string " + rev);


        StringBuffer  str = new StringBuffer(String.valueOf(s));

        StringBuffer revbuffer = str.reverse();
        System.out.println( "revbuffer  " + revbuffer);


        StringBuilder strb = new StringBuilder(s);
        StringBuilder rev3 = strb.reverse();

        System.out.println("StringBuilder " + rev3);
    }
}
