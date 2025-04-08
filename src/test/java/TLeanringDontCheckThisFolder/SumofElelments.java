package TLeanringDontCheckThisFolder;

public class SumofElelments {

    public static void main(String[] args) {
        int[] arr= {5,2,7,9,6};
        int sum=0;

        // NOrmal for loop
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        System.out.println(sum);
        sum=0;

        // Enhanced for loop

        for (int i : arr)
        {
            sum = sum + i;
        }

        System.out.println(sum);
    }
}
