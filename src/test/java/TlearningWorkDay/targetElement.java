package TlearningWorkDay;

public class targetElement {


    public static int lookForTargetEllment(int[] nums , int target)
    {

        for (int i=0; i<nums.length; i++)
        {

            if(nums[i]==target)
            {
                return i+1;
            }
        }

        return -1;
    }


    public static int lookForTargetEllmentBinarySearch(int[] nums , int target)
    {

      int left=0,mid=0;
      int right = nums.length-1;

      while(left < right) {
          mid = (left + right) / 2;

          if (nums[mid] == target)
              return mid+1;
          else if (nums[mid] < target)
              left = mid + 1;
          else
              right = mid - 1;
      }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 4, 6, 8, 9, 14, 15};
        int target=9;

        System.out.println("elelment found at index : " + lookForTargetEllment(nums,target));
        System.out.println("elelment found at Binary index : " + lookForTargetEllmentBinarySearch(nums,target));

    }
}
