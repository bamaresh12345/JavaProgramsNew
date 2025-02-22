package SldingWindowProbelms;

/*  487. Max Consecutive Ones II
Input: [1,0,1,1,0] Output: 4
Explanation: Flip the first zero will get the the maximum number of consecutive 1s.
    After flipping, the maximum number of consecutive 1s is 4.
 */
public class MAxConsectiveOnesIINew {

    public static int maxConsitiveOnesII(int[] arr) {
        int count = 0; //to count the nubmer of zeros
        int maxLen = 0; // t counte the max nubmer of length of array with 1st
        int left = 0;  // point to 1st elment of array
        int right = 0; // pointe to 1st element of array
        int n = arr.length;

        if (n < 2) // base case  if the lenght is less than 2 , jsut return the length
            return n;

        while (right < n) {  // run while loop till end of array
            if (arr[right] == 0) { // check if arr of right=0, then incrment count=count +1
                count++;
            }

            while (count > 1) {  // run while loop till count >1 say if user gets 0,0,0
                if (arr[left] == 0) {  // check if left pointer aray is zero
                    count--;   // then decrment the counter of zero
                }
                left++;   // and incrment the left pointer to point to next elment
            }

            // update the maxLenght and get the maxLength
            maxLen = Math.max(maxLen, right - left + 1);
            right++;  // move forward with lext element to look for 1s or 0s
        }

        return maxLen;
    }


    public static void main(String args[]) {
        int[] arr = {1, 0, 1, 1, 0};

        System.out.println(maxConsitiveOnesII(arr));
    }

}
