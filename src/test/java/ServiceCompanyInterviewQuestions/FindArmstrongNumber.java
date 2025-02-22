package ServiceCompanyInterviewQuestions;

public class FindArmstrongNumber {

    public static boolean findArmstrongNumber(int n) {

        int count = numCount(n);
        int temp = n;
        int last = 0;
        int num = 0;

        while (n > 0) {
            last = n % 10;
            num = (int) (num + Math.pow(last, count));
            n = n / 10;
        }

        System.out.println("temp nubmer : " + temp + " num : " + num);
        if (temp == num)
            return true;
        else
            return false;


    }

    public static int numCount(int n) {
        int count = 0;
        int last = 0;
        while (n > 0) {
            last = n % 10;
            count++;
            n = n / 10;
        }
        System.out.println("total nubmers : " + count);
        return count;
    }

    public static void main(String[] args) {
        int n = 153;

        System.out.println(findArmstrongNumber(n));
    }
}
