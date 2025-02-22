package StringsOnlyGoodOne;

public class CalculateSumOfAllNumsPresentInString {

    public static int calculateSumOfAllNumsPresentInString(String str) {

        String temp = "0";
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isDigit(c)) {
                temp = temp + c;
            } else {
                sum = sum + Integer.parseInt(temp);
                temp = "0";
            }
        }

        sum = sum + Integer.parseInt(temp);

        return sum;

    }

    public static void main(String[] args) {
        //String str = "geeks4geeks";  //4
        // String str = "1abc23";  //24
        String str = "1abc2x30yz67"; //Output: 100;


        System.out.println(calculateSumOfAllNumsPresentInString(str));
    }
}
