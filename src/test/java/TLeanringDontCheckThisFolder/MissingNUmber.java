package TLeanringDontCheckThisFolder;

public class MissingNUmber {

    public static void main(String[] args) {

        // should hvae values from 1 ot 10
        // sohuld not be in sorting order
        // sohuld have start and end value
        int arr[] ={1,4,3,5};

        int n = arr.length;
        int sum2=0;
        int sum1 = 0;
        //int sum1 = (n * (n+1))/2;

        for (int i = 0; i <n; i++) {

            sum1 = arr[i]+ sum1;
        }

        //System.out.println(sum1-sum);

        for (int i = 0; i < 5; i++) {

            sum2 = i + sum2;
        }

        int finalsum = sum1-sum2 ;
        System.out.println("missing ubmer " + finalsum);

    }
}
