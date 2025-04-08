package TLeanringDontCheckThisFolder;

public class ReverseStringThreeWays {

    public static void main(String[] args) {


        String s = "testing";
        String rev="";
        //Method1
        for (int i = 0; i < s.length(); i++) {

            rev = s.charAt(i) + rev;
        }
        System.out.println("reversed String Method1 is : " +rev);


        //Method2
        StringBuilder sb1 = new StringBuilder(String.valueOf(s));
        StringBuilder sb2 = sb1.reverse();
        System.out.println("reversed String Method2 is : " +sb2);

        //Method3
        StringBuffer sb3 = new StringBuffer(String.valueOf(s));
        StringBuffer  sb4 = sb3.reverse();

        System.out.println("reversed String Method2 is : " +sb4);


        if(s.equals(rev))
        {
            System.out.println("Palandrome");
        }
        {
            System.out.println("Not Palandrome");
        }
    }
}
