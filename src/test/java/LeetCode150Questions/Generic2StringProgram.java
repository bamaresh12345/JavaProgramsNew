package LeetCode150Questions;

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

        System.out.println("************************************");

        StringBuffer sb2 = new StringBuffer("Test");
        sb2.append(" Automation");
        System.out.println(sb2);

        sb2.reverse();
        sb2.replace(0, 1, "Z");
        sb2.deleteCharAt(1);
        sb2.delete(1, 2);


    }
}
