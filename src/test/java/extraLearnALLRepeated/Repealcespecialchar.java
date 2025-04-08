package extraLearnALLRepeated;

public class Repealcespecialchar {

    public static void main(String[] args) {
        String s ="this for ^%^*%;dsajf;lofr lasdjf~!@#$lad";

        s= s.replaceAll("[^A-Za-z0-9 ]", "");
        System.out.println(s);

        String s2= "This         is  for  testing ignore      it  ";

        String s3 =s2.replace(" *", "");

        System.out.println(s3);

        String[] words = s2.split(" ");
        String finastr="";
        for (int i = 0; i < words.length; i++) {
         finastr =  finastr.trim() +" " + words[i].trim();
        }

        System.out.println(finastr);


        for (int i = 0; i < words.length; i++) {

        }

    }
}
