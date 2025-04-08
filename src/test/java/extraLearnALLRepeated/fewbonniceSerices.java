package extraLearnALLRepeated;

public class fewbonniceSerices {

    public static void main(String[] args) {
        int n=10;

        int frsit=0;
        int second =1;
        int third = 0;

        for (int i = 2; i < n; i++) {

            third = frsit + second;
            System.out.print(third + " ");

            frsit=second;
            second =third;

        }

    }
}
