package extraLearnALLRepeated;

public class minMaxNum {

    public static void main(String[] args) {

        int[] arr=  {50,30,40,20,60};

        int max=0;
        int min=arr[0];

        for (int i = 0; i < arr.length; i++) {

            if(arr[i]>max)
                max = arr[i];

            if(arr[i] < min)
                min =arr[i];

        }

        System.out.println("max " +max );
        System.out.println("max " +min );
    }
}
