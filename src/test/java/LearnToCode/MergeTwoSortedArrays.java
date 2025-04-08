package LearnToCode;

import java.util.Arrays;

public class MergeTwoSortedArrays {
    /*
      1. declare 3 pointers p1,p2,p3
      2. p1 points the last array index of m
      2. p2 points the last array index of n
      2. p3points the last array index of m+n-1
      3. run while loop till p3 >0
      4. initlize 2 elments elment1 and element2 =0
      5. assign ele1 when p1>=0 ? nums1[p1] or Integer.MIN_VALUE
      6. assing ele2 = when p2>=0 nums2[p2] or INTEGER.MIN_VALUE
      7. if element 1 > element2 update  element1 to nums1[p3] and decrment p3 and p1
      8. if elment1 < elment2 update  element2 to nums1[p3] and decrment p3 and p2
      9. can print array


     */
    public static void mergeTwoSortedArrays(int[] nums1, int[] nums2, int m, int n) {
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





        System.out.println(Arrays.toString(nums1));
    }

    public static void main(String[] args) {

        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        int m = 3;
        int n = 3;

//        int[] nums1 = {0};
//        int[] nums2 = {1};
//        int m = 0;
//        int n = 1;

        mergeTwoSortedArrays(nums1, nums2, m, n);


    }


}
