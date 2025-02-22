package ArraysLeetCode.SearchFinal;

public class BinarySearchLeetCode704 {

    public static int ValidateBinarySearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int mid;

        while (left < right) {
            mid = (left + right) / 2;

            if (nums[mid] == target)
                return mid;    //IMPORTANT not nums[mid]

            else if (nums[mid] < target)   //COMPARING WITH nums[mid] with TARGET not with left or right
                left = mid + 1;

            else
                right = mid - 1;

        }

        return -1;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int arr[] = {2, 3, 4, 10, 40};
        int target = 10;
        int i = ValidateBinarySearch(arr, target);

        System.out.println("Index of traget  " + target + " is :   " + i);


        int i1 = linearSearch(arr, target);
        System.out.println("Index of traget  " + target + " is :   " + i1);

    }

    public static int linearSearch(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target)
                return i;
        }


        return -1;
    }

}
