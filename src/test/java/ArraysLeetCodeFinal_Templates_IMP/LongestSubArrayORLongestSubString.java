package ArraysLeetCodeFinal_Templates_IMP;

public class LongestSubArrayORLongestSubString {
    /*
    Find the LongestSubarray  with condition sum <=k   ,
    example int[] nums = {2,5,1,7,10} and k=14   , means sum <=14

    Longest subString

    //Brute Force --> generate all SUB ARRAYS
    1. for(int i=0; i<nums.length;i++)
        { sum=0;
          for(int j=i+1; j<nums.length; j++)
       {    sum = sum + nums[j];
           if(sum <=k)
           {
             maxLen = Math.max(maxLen, j-i+1); // gives the max length of array based on condition sum <=k
           }
           else if(sum > k)
           {
           break;
           }
              }
       }

       // better approach Two pointer approach
       int left =0; --- points to 1st elment fo array and it shrinks the array
       int right=0; --> frsit points to 1st elments of array and it expands the array.
       int maxLen=0;  --> keeps the maxlength of array indexes
       int sum=0;      --> keeps the sum of elements in array with starting with left and right pointers
       int n= nums.length;   --> length of array

check if the sum value <= K , then increment(expands right) the right++ and get the sum  = sum + nums[right];
check if  sum value > K ,  then increment(shrink left), left++ and get the sum = sum nums[right];

   while(right < n)
   {
     // getting the 1st sum of array with right elment;
     1. sum = sum + nums[right];


     // shrinking the array with incrmenting the left element , left++;
     3. while(sum >k)  // while is till it shrinks the array  or use if(sum > k) use this for not subArray
       {
          sum = sum - nums[left];
           left++;
       }


    // Expanding the array with incrmenting the right element right++
     2. if(sum <= k)
        {
          maxLen = Math.max(maxLen,right-left+1); // store Left and right in array if they ask for return subArray
           right++;
        }

   }

   //print(maxLen)



     */
    public static void main(String[] args) {

    }
}
