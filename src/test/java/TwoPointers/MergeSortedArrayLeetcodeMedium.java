package TwoPointers;

import java.util.Arrays;

public class MergeSortedArrayLeetcodeMedium {

    public static int[] MergeSortedArray(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;
        int p2 = n - 1;
        int p = m + n - 1;

        while(p1 >=0 && p2>=0)
        {
            if(nums1[p1] > nums2[p2])
            {
                nums1[p] = nums1[p1];
                p--;
                p1--;
            }
            else
            {
                nums1[p] = nums2[p2];
                p--;
                p2--;
            }

        }

        //if ther are remaning elelments in nums2 , copy them
        while(p2 >=0)
        {
            nums1[p] = nums2[p2];
            p--;
            p2--;
        }

        return nums1;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;

        System.out.println(Arrays.toString(MergeSortedArray(nums1, m, nums2, n)));
    }
}
