package JavaBasics;

public class Generic2StringProgram {

    public static void main(String[] args) {

        String s = "test";

        s.toLowerCase();
        s.toUpperCase();
        s.toCharArray();

        s.toString();

        s.length(); // string length() or array[i].length() --> array string length

        s.contains("te"); // *** IMP

        s.charAt(1);         // *** IMP

        s.equals("test");              // *** IMP
        s.equalsIgnoreCase("testt");  // *** IMP

        s.concat("tt");                       // *** IMP
        s.replace('t', 'T');
        s.replace("e", "E");
        s.replaceAll("[AEIOUaeiou]", "");   // *** IMP
        s.replaceAll("[^A-Za-z0-9 ]", "");   // *** IMP

        String s2 = s.replace('t', 'T');
        System.out.println(s2);

        String s3 = s.replaceAll("[AEIOUaeiou]", "");
        System.out.println(s3);

        s.indexOf('a');  // ('from char')
        s.indexOf("st");    // ("from String")
        s.indexOf("str", 5); // ("str", fromIndex)


        // begining Index --> inclusive and Index Integer not inclusive cna use s.lenth() instead of s.loength()-1
        String s33 = "www.erosteam.com";

        s33.substring(0, 4); //www.
        s33.substring(s33.length() - 4, s3.length()); //.com
        s33.substring(4, s33.length() - 4); //erosteam

        s.substring(0, s.length() - 2);   // (begining Index Integer, end Index Integer)
        s.substring(3);           // (begining Index Integer)
        s.substring(1, s.length() - 1);
        s.substring(0, 1);  // frist letter
        s.substring(s.length() - 1);  // last letter

        s.compareTo("test");


        s.startsWith("AB");
        s.endsWith("AB");

        s.replaceFirst("t1", "t2");

        String a = "hello";
        String b = "hello";

        String s1 = new String("hello");
        String s22 = new String("hello");

        System.out.println(a.equals(b)); //true
        System.out.println(a == b); //true
        System.out.println(a.equals(s1)); //ture --> both matching the values
        System.out.println(a == s1); //false --> both matching the reference not values
        System.out.println(s1 == s22); //false --> reference are difference as tehy are defined with string class


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
        String str = obj2.toString();

        // Print and display the above string
        // containing all strings as a single string
        // using toString() method
        System.out.println(
                "Single string generated using toString() method is --> "
                        + str);

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
