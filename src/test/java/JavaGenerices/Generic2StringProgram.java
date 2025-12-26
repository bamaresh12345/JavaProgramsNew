package JavaGenerices;

public class Generic2StringProgram {

    public static void main(String[] args) {

        //converting int to String 3 ways
        //int a=123;
        // String s1 = Integer.toString(a);
       // String s2 = Integer.valueOf(a) ;
       // String s3 = "" + a

  //============================================
        //converting String to int 3 ways
        //String b="123";
        // int s1 = Integer.parseInt(b);
        // String s2 = String.valueOf(c);
        // String s3 = "" + a

        String str = "test";

        str.toLowerCase();
        str.toUpperCase();
        str.toCharArray();

        str.toString();

        str.length(); // string length() or array[i].length() --> array string length

        str.contains("te"); // *** IMP
      //  str.contains('t'); // *** IMP  char will not work

        str.charAt(1);         // *** IMP

        str.equals("test");              // *** IMP
        str.equalsIgnoreCase("testt");  // *** IMP

        str.concat("   JAVA");  //test     JAVA                    // *** IMP
        str.replace('t', 'T');
        str.replace("e", "E");
        str.replaceAll("[AEIOUaeiou]", "");   // *** IMP
        str.replaceAll("[^A-Za-z0-9 ]", "");   // *** IMP

        String s2 = str.replace('t', 'T');
        System.out.println(s2);

        String s3 = str.replaceAll("[AEIOUaeiou]", "");
        System.out.println(s3);

        //Integer.parseInt(strnum)  //  converts String strnum = "123" to Integer --> 123
        String strnum="123";
        System.out.println("Integer.parseInt--> " + Integer.parseInt(strnum)); // 123  converts String to Integer

        str.indexOf('a');  // ('from char')
        str.indexOf("st");    // ("from String")
        str.indexOf("str", 5); // ("str", fromIndex)

        //str.trim() --> it trims spaces in both left and right very imp, in removing spaces
        //System.exit(0); --> exist from the method 0 is IMP

        // begining Index --> inclusive and Index Integer not inclusive cna use str.lenth() instead of str.loength()-1
        String s33 = "www.erosteam.com";

        s33.substring(0, 4); //www.
        s33.substring(s33.length() - 4, s33.length()); //.com
        s33.substring(4, s33.length() - 4); //erosteam

        str.substring(0, str.length() - 2);   // (begining Index Integer, end Index Integer)
        str.substring(3);           // (begining Index Integer)
        str.substring(1, str.length() - 1);
        str.substring(0, 1);  // frist letter
        str.substring(s3.length() - 1);  // last letter

        str.compareTo("test");


        str.startsWith("AB");
        str.endsWith("AB");

        str.replaceFirst("t1", "t2");

        String a = "hello";
        String b = "hello";

        String s1 = new String("hello");
        String s22 = new String("hello");

        System.out.println(a.equals(b)); //true
        System.out.println(a == b); //true
        System.out.println(a.equalsIgnoreCase(s1)); //ture --> both matching the values
        System.out.println(a == s1); //false --> both matching the reference not values
        System.out.println(s1 == s22); //false --> reference are difference as tehy are defined with string class

        //How do I convert a String to an int in Java? --> Integer.parseInt(i);
        String snum="123";
         int k=   Integer.parseInt(snum); //************
        System.out.println("K vlaue is : " + k);   // OUTPUT 123

        //How do I convert a int to an String in Java? --> Integer.toString(i);
        int i=123;
        String snumnew = Integer.toString(i);
        System.out.println("Integer to String using Integer.toString(i)  : " +i);   //  OUTPUT 123
        //How do I convert a int to an String in Java? 2nd METHOD --> String str12 = "" + a;
        int c=12345;
        String str12 = "" + a;
        System.out.println("Integer to String using String str12 = \"\" + a " + c);  // OUPTUT 12345

        String str13 = String.valueOf(c);
        System.out.println("Integer to String using String.valueOf(c) " + c);

        //StringBuffer  & StringBuilder are -Mutable
        StringBuffer sb = new StringBuffer("Java");
        sb.append(" Programming");
        System.out.println(sb);
        sb.reverse();
        sb.replace(0, 1, "Z");
        sb.deleteCharAt(1);
        sb.delete(1, 2);
        //sb.split  not their
        // using standard toString() method to convert from string builser to string
        System.out.println("String contains = " + sb.toString());

        // Random array of string as input
        String gfg[] = { "Are", "You", "A", "Programmer" };

        // Creating object of StringBuilder class
        StringBuilder obj2 = new StringBuilder();

        // Adding above arrays of strings to
        // Stringbuilder object
        obj2.append(gfg[0]);
        obj2.append(" " + gfg[1]);
        obj2.append(" " + gfg[2]);
        obj2.append(" " + gfg[3]);

        // Note if elements are more then one, we will be using loops to append(add)

        // Creating a single string
        String str1 = obj2.toString();

        // Print and display the above string
        // containing all strings as a single string
        // using toString() method
        System.out.println(
                "Single string generated using toString() method is --> "
                        + str1);

        System.out.println("************************************");

        StringBuffer sb2 = new StringBuffer("Test");
        sb2.append(" Automation");
        System.out.println(sb2);

        sb2.reverse();
        sb2.replace(0, 1, "Z");
        sb2.deleteCharAt(1);
        sb2.delete(1, 2);

        // create a StringBuffer object
        // with a String pass as parameter
        StringBuffer str5 = new StringBuffer("Geeks for Geeks contribute");

        // print string
        System.out.println("String contains = "+ str5.toString());

        // Creating object of StringBuilder class
        StringBuilder obj3 = new StringBuilder();

        // Adding above arrays of strings to
        // Stringbuilder object
        obj3.append(gfg[0]);
        obj3.append(" " + gfg[1]);
        obj3.append(" " + gfg[2]);
        obj3.append(" " + gfg[3]);


    }
}
