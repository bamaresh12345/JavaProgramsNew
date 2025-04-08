package extraLearnALLRepeated;

public class countEvenandOddNubmers {

    public static void main(String[] args) {

        int[] arr= {12,5,67,42,1,7,8};

        for (int i = 0; i < arr.length; i++) {

            if(arr[i]%2==0)
            {
                System.out.println("even nubmer : " +arr[i]);
            }
        }

        for (int i = 0; i < arr.length; i++) {

            if(arr[i]%2!=0)
            {
                System.out.println("odd nubmer : " +arr[i]);
            }
        }

        for (int n : arr)
        {
            if(n%2==0)
            {
                System.out.println("even" + n);
            }
        }

        for (int n : arr)
        {
            if(n%2!=0)
            {
                System.out.println("odd" +n);
            }
        }
    }
}
