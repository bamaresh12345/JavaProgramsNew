package TLeanringDontCheckThisFolder;

public class ReverseEachWordinString {

    public static void main(String[] args) {

        String s ="Welcome to Java"; //reverse only words
         String rev1 = "";
        //Method 1
        for (int i = 0; i < s.length(); i++) {

            rev1 = s.charAt(i) + rev1;
        }

        System.out.println(rev1);  //avaJ ot emocleW

        String[] s2 = rev1.split(" ");

        String rev2="";
        for (int i = 0; i < s2.length; i++) {

            rev2 = s2[i] + " " +rev2;
        }

        System.out.println(rev2);


        String s3 ="Welcome to Java"; //reverse only words


        //Method 1
        StringBuilder sb = new StringBuilder(String.valueOf(s3));
           sb.reverse();
        System.out.println("Stringbuilder " + sb);




  //Method 1
        String rev4 = "";
        String[] words= s3.split(" ");

        for (String word : words)
        {
            StringBuilder sb1 = new StringBuilder(word);

            rev4 = rev4 + sb1.toString() + " "; // ** IMP
        }
        System.out.println("Stringbuilder " + rev4);
    }
}
