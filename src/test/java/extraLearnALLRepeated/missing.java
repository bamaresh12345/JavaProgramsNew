package extraLearnALLRepeated;

public class missing {

    public static void main(String[] args) {

        int[] arr= {1,2,4,5};

        int n=arr.length+1;
        int sum = (n * (n+1))/2;

        for (int i = 0; i < arr.length; i++) {
            sum = sum -arr[i];
        }

        System.out.println(sum);
    }
}
