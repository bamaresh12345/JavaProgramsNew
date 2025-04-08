package CyclicSortAmazonGoogle;


public class findMissingPostiveNubmerLeectCode41IMP {

    public static void main(String[] args) {

        int[] nums = {3, 4, -1, 1};
        System.out.println("First Missing Positive: " + firstMissingPositive(nums)); // Output: 2
    }

    public static int firstMissingPositive(int[] nums) {

        int i=0;
        int n = nums.length;

        // Step 1: Cyclic Sort
        while(i < nums.length)
        {
            int currentElement = nums[i]-1; /// *** IMP****

            if(nums[i] > 0 && nums[i] <=n && nums[i]!=nums[currentElement])  // nums[i] > 0  removes negative nubmers
            {
                // Swap nums[i] to its correct position
                  int temp= nums[i];
                  nums[i]=nums[currentElement];
                  nums[currentElement]=temp;
            }
            else
            {
                i++;
            }
        }

        // Step 2: Find first missing positive
        for (int j = 0; j < n; j++) {   // ** IMP  j
            if(nums[j] != j+1)    // ** IMP  j
            {
                return j+1;  // missing postive nubmer
            }
        }

                return n+1; // If all numbers are in place, return n+1
    }
}
