package ServiceCompanyInterviewQuestions;

public class findlargestnumberlessthangivennumberAndwithoutGivendigit {

    //find largestnumber less than given number And without Given digit

    static int getLLessThanN(int number, int digit) {
        //Converting digit to String
        String c = "";            // OR --> String c = Integer.toString(num);
        c = c + digit;

        //Decrementing number & checking whether it contains digit
        for (int i = number; i > 0; i--) {
            String d = "";      // OR --> String d = Integer.toString(i);
            d = d + i;

            if (d.contains(c)) {
                continue;
            } else {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(getLLessThanN(123, 2));

        System.out.println(getLLessThanN(4582, 5));

        System.out.println(getLLessThanN(98512, 5));

        System.out.println(getLLessThanN(548624, 8));
    }
}
