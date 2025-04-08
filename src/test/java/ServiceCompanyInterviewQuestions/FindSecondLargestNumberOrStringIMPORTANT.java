package ServiceCompanyInterviewQuestions;

public class FindSecondLargestNumberOrStringIMPORTANT {

    public static void main(String[] args) {
        int[] nums = {45, 51, 28, 75, 49, 42};

        int first =  Integer.MIN_VALUE;   //first → stores the largest number
        int second = Integer.MIN_VALUE;   //second → stores the 2nd largest number

        for (int num : nums) {

            if (num > first) {   //If num is greater than first, then:

                second = first;  //***** IMP lese it will give wrong results
                first = num;    //Update first to the current num



              //Update 2nd Largest (if not equal to first)
             //If num is not greater than first but is greater than second, and not equal to the current first, then update second.
            } else if (num > second && num != first) {
                second = num;
            }
        }

        //If second is still Integer.MIN_VALUE, it means a second largest number wasn’t found (e.g., all numbers were the same).
        if (second == Integer.MIN_VALUE) {
            System.out.println("No second largest number found.");
        } else {
            System.out.println("Second largest number is: " + second);
        }

        StringTest();
    }



    public static void StringTest()
    {
        String[] nums = {"Amar", "Ram", "is", "testingwerwrwer", "kalei", "t"};

        String first =  "";   //first → stores the largest number
        String second = "";   //second → stores the 2nd largest number

        for (String num : nums) {

            if (num.length() > first.length()) {   //If num is greater than first, then:

                first = num;    //Update first to the current num
                second = first;  //update second to hold the old first

                //Update 2nd Largest (if not equal to first)
                //If num is not greater than first but is greater than second, and not equal to the current first, then update second.
            } else if (num.length() > second.length() && (!num.equalsIgnoreCase(first))) {
                second = num;
            }
        }

        //If second is still Integer.MIN_VALUE, it means a second largest number wasn’t found (e.g., all numbers were the same).
        if (second.equalsIgnoreCase("")) {
            System.out.println("No second largest number found.");
        } else {
            System.out.println("Second largest number is: " + second);
        }
    }
}
