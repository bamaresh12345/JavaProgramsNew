package extraLearnALLRepeated;

public class ExtractNumberFromText {

    public static void main(String[] args) {

        String s = "pran123test";

        char[] chars = s.toCharArray();
        String temp ="";
        for (int i = 0; i < chars.length; i++) {

            if(!Character.isLetter(chars[i]))
            {
                temp = temp + chars[i];
            }

        }

        System.out.println(Integer.parseInt(temp +2));
        System.out.println(Integer.parseInt(temp) + 2);

    }

}
