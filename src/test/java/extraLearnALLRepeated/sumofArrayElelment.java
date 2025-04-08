package extraLearnALLRepeated;

public class sumofArrayElelment {

    public static void main(String[] args) {

        int[] arr ={5,2,7,9,6};
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        System.out.println(sum);
        sum=0;
        for (int n : arr)
        {
            sum = sum + n;
        }
        System.out.println(sum);
    }
}
