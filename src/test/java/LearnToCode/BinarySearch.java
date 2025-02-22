package LearnToCode;

public class BinarySearch {

    //bruteForce
    public static int binarySearch(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
//        int[] nums = {-1, 0, 3, 5, 9, 12};
//        int target = 9;

        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 2;

        System.out.println(binarySearch(nums, target));
        System.out.println(binarySearchBS(nums, target));
    }

    //bruteForce
    public static int binarySearchBS(int[] nums, int target) {
        /*
           Two Ponter Method
           1. create 3 varailbes left=0, right=nums.length-1 and mid=0;
           2. use while loop run till right > 0
           3. calcualte midpint of array mid = (left + right)/2
           4. check if array of mid = target
           5. if yes return mid
           6. if arrary of mid less than target left = mid+1
           7. else if array of mid is greater than target right = mid-1
           8. coitnute till end of the loop
           9 else return -1
         */

        int left = 0;
        int right = nums.length - 1;
        int mid = 0;

        while (left < right) //** PRESENT CONDITION SHOULD be SATISFIED
        {
            mid = (left + right) / 2;

            if (nums[mid] == target)
                return mid;
            else if (nums[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return -1;
    }
}
