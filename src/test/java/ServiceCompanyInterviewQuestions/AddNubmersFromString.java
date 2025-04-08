package ServiceCompanyInterviewQuestions;

public class AddNubmersFromString {

    public static void AddNubmers(String str) {
        String temp = "0";
        int sum = 0;
        str = str+"a";
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                temp = temp + str.charAt(i);
            } else {
                sum = sum + Integer.parseInt(temp);
                temp = "0";  // **IMP
            }
        }

        //sum = sum + Integer.parseInt(temp);
       // return sum;
        System.out.println("sum " + sum);


    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String str = "1a23af6"; // 30

        AddNubmers(str);
    }
}
