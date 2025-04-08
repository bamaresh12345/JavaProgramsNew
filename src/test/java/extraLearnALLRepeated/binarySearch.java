package extraLearnALLRepeated;

public class binarySearch {
    public static void main(String[] args) {


        int[] arr= {2,5,8,9,10,12,18,21,28};
        int target=2;
        int left=0;
        int right =arr.length-1;

        while(left <= right)
        {
            int mind = (left + right)/2;

            if(arr[mind]==target)
            {
                System.out.println("target found at index" + mind +" " +arr[mind] );
                break;
            }
            else if(arr[mind] < target)
            {
                left = mind+1;
            }
            else
            {
                right = mind-1;
            }
        }

        System.out.println("not ofund");
    }
}
