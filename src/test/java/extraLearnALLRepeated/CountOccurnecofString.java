package extraLearnALLRepeated;

public class CountOccurnecofString {

    public static void main(String[] args) {

        String s ="this os for tesing";
        char c= 't';
        String s1 ="" +c;

        int atuallen = s.length();
        String s3 =s.replace(s1,"");
        int initialen = s3.length();

        System.out.println(atuallen);
        System.out.println(initialen);

        int finalencount = atuallen - initialen;

        System.out.println(finalencount);



    }

}
