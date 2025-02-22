package ServiceCompanyInterviewQuestions;

public class PalandromeNumber {

    public static boolean ValidPalandrome(int n) {
        int last = 0;
        int rev = 0;
        int temp = n;
        while (n > 0) {
            last = n % 10;
            rev = (rev * 10) + last;
            n = n / 10;
        }

        if (rev == temp)
            return true;
        else
            return false;

    }

    public static void main(String[] args) {
        int n = 16468;

        System.out.println(ValidPalandrome(n));
    }
}
