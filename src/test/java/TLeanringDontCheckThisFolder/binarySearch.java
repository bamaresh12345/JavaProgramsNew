package TLeanringDontCheckThisFolder;

public class binarySearch {

    public static  int binarySearch(int[] arr,int ele)
    {
        int left=0;
        int right =arr.length-1;

        while(left <= right)
        {
           int mid = (left + right)/2;

            if(arr[mid]== ele)
            {
                System.out.println("item found " + arr[mid] + " " + mid);
                return arr[mid];
            } else if (arr[mid] < ele) {
                left = mid + 1;
            }
            else if (arr[mid] > ele)
            {
               right = mid-1;

            }


        }

        return -1;


    }
    public static void main(String[] args) {
        int[] arr = {10,20,50,60,80}; // should be in sorted order
        int ele = 80;

        System.out.println(binarySearch(arr,ele));
    }
}
