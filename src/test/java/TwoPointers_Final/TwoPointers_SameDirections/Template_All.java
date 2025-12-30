package TwoPointers_Final.TwoPointers_SameDirections;

public class Template_All {
    /*
   🟢 Two Pointers – Same Direction Problems (Java)
#	Problem	Idea / Key Pattern
============================================================================
1	Remove Duplicates from Sorted Array	 --> Slow & fast pointer to overwrite duplicates
2	Move Zeroes	         ---> Shift non-zero elements forward
3	Remove Element	    --->Overwrite elements equal to val
4	Move Negative Numbers to Left	---> Swap negative numbers to the start
5	Squares of Sorted Array	   ---> Merge two sorted parts with squares
6	Sort Colors / Dutch National Flag	---> Count & overwrite in one pass
7	Merge Sorted Array	---> Two pointers to merge into new array
8	Partition Array	  ---> Separate by condition (even/odd, negative/positive)
9	Remove Adjacent Duplicates (String / Array)	---> Slow pointer tracks final array, fast scans
10	Replace(remove/update) / Modify Elements	---> Use slow pointer to overwrite while scanning
11	Move All X to End	---> Similar to move zeroes
12	Trapping Rain Water 1D (Prefix Sums simplified version) ---> Fill positions using pointers from left/right (variant)
13	Minimum Increment to Make Array Unique	---> Track previous element with slow pointer
14	Duplicate Zeros	  ---> Shift elements while handling duplicates
15	Remove Specific Character from String	 ---> Overwrite using slow pointer
============================================================================================
dry run --> Remove Duplicates from Sorted Array
| Step | i (slow) | j (fast) | nums Array State      | Action / Comment                                           |
| ---- | -------- | -------- | --------------------- | ---------------------------------------------------------- |
| 0    | 0        | 1        | [0,0,1,1,1,2,2,3,3,4] | Compare nums[1]=0 with nums[0]=0 → duplicate → skip        |
| 1    | 0        | 2        | [0,0,1,1,1,2,2,3,3,4] | Compare nums[2]=1 with nums[0]=0 → unique → i=1, nums[1]=1 |
| 2    | 1        | 3        | [0,1,1,1,1,2,2,3,3,4] | Compare nums[3]=1 with nums[1]=1 → duplicate → skip        |
| 3    | 1        | 4        | [0,1,1,1,1,2,2,3,3,4] | Compare nums[4]=1 with nums[1]=1 → duplicate → skip        |
| 4    | 1        | 5        | [0,1,1,1,1,2,2,3,3,4] | Compare nums[5]=2 with nums[1]=1 → unique → i=2, nums[2]=2 |
| 5    | 2        | 6        | [0,1,2,1,1,2,2,3,3,4] | Compare nums[6]=2 with nums[2]=2 → duplicate → skip        |
| 6    | 2        | 7        | [0,1,2,1,1,2,2,3,3,4] | Compare nums[7]=3 with nums[2]=2 → unique → i=3, nums[3]=3 |
| 7    | 3        | 8        | [0,1,2,3,1,2,2,3,3,4] | Compare nums[8]=3 with nums[3]=3 → duplicate → skip        |
| 8    | 3        | 9        | [0,1,2,3,1,2,2,3,3,4] | Compare nums[9]=4 with nums[3]=3 → unique → i=4, nums[4]=4 |
======================================================================================================
============================================================================================
Move all negative numbers to the left side of the array, maintaining relative order is not required.
Example Input:
arr = [1, -2, 3, -4, 5, -6]
Expected Output: arr = [-2, -4, -6, 1, 3, 5]  // negatives on left, positives on right
Step-by-Step Dry Run
| Step | i (current) | j (negative position) | arr State             | Action / Comment                                             |
| ---- | ----------- | --------------------- | --------------------- | ------------------------------------------------------------ |
| 0    | 0           | 0                     | [1, -2, 3, -4, 5, -6] | arr[0]=1 → not negative → skip                               |
| 1    | 1           | 0                     | [1, -2, 3, -4, 5, -6] | arr[1]=-2 → swap arr[1] & arr[0] → arr=[-2,1,3,-4,5,-6], j=1 |
| 2    | 2           | 1                     | [-2,1,3,-4,5,-6]      | arr[2]=3 → not negative → skip                               |
| 3    | 3           | 1                     | [-2,1,3,-4,5,-6]      | arr[3]=-4 → swap arr[3] & arr[1] → arr=[-2,-4,3,1,5,-6], j=2 |
| 4    | 4           | 2                     | [-2,-4,3,1,5,-6]      | arr[4]=5 → not negative → skip                               |
| 5    | 5           | 2                     | [-2,-4,3,1,5,-6]      | arr[5]=-6 → swap arr[5] & arr[2] → arr=[-2,-4,-6,1,5,3], j=3 |

================================================================================================
================================================================================================
Problem
Partition an array so that all elements satisfying a condition are on the left, and the rest on the right.
Example Input (Even/Odd):   ((EVEN/ODD, NEGATIVE/POSITIVE))
Input arr = [1, 2, 3, 4, 5, 6]
Expected Output: [6,2,4,3,5,1]  // order can vary  *** IMP

Goal:
Move even numbers to left, odd numbers to right.
Expected Output: [6,2,4,3,5,1]  // order can vary  *** IMP

Java Logic (Two Pointers / Partitioning)
int left = 0;  // next position for element that satisfies condition
for (int right = 0; right < arr.length; right++) {
    if (arr[right] % 2 == 0) { // condition: even number (arr[right] % 2 != 0) : for ODD numbers
        int temp = arr[right];
        arr[right] = arr[left];
        arr[left] = temp;
        left++;  // IMP ****
    }
}

Step-by-Step Dry Run (Even/Odd)

| Step | right (current) | left (next even) | arr State     | Action / Comment                                      |
| ---- | --------------- | ---------------- | ------------- | ----------------------------------------------------- |
| 0    | 0               | 0                | [1,2,3,4,5,6] | arr[0]=1 → not even → skip                            |
| 1    | 1               | 0                | [1,2,3,4,5,6] | arr[1]=2 → swap arr[1]&arr[0] → [2,1,3,4,5,6], left=1 |
| 2    | 2               | 1                | [2,1,3,4,5,6] | arr[2]=3 → not even → skip                            |
| 3    | 3               | 1                | [2,1,3,4,5,6] | arr[3]=4 → swap arr[3]&arr[1] → [2,4,3,1,5,6], left=2 |
| 4    | 4               | 2                | [2,4,3,1,5,6] | arr[4]=5 → not even → skip                            |
| 5    | 5               | 2                | [2,4,3,1,5,6] | arr[5]=6 → swap arr[5]&arr[2] → [2,4,6,1,5,3], left=3 |
=================================================================================================
=================================================================================================
Problem
Given an array, you can increment elements to make all elements unique. Return the minimum number of increments needed.
Example Input:
arr = [3, 2, 1, 2, 1, 7]
Expected Output: 12
Explanation: After making array unique: [1,2,3,4,5,7]
Increment 2 → 4 (1 step)
Increment 1 → 5 (4 steps)
Total = 12
Java Logic
Sort the array.
Use a variable prev to track the last unique number.
For each number, if it's ≤ prev, increment it to prev + 1.

Arrays.sort(arr);
int res = 0;
int prev = arr[0]; // first element

for (int i = 1; i < arr.length; i++) {
    if (arr[i] <= prev) {
        res += (prev + 1 - arr[i]);
        arr[i] = prev + 1;
    }
    prev = arr[i];
}
return res;

Step-by-Step Dry Run
Sorted Array:
[1, 1, 2, 2, 3, 7]

| i | arr[i] | prev | Action                    | arr State     | res |
| - | ------ | ---- | ------------------------- | ------------- | --- |
| 0 | 1      | 1    | first element             | [1,1,2,2,3,7] | 0   |
| 1 | 1      | 1    | 1 ≤ prev → increment to 2 | [1,2,2,2,3,7] | 1   |
| 2 | 2      | 2    | 2 ≤ prev → increment to 3 | [1,2,3,2,3,7] | 2   |
| 3 | 2      | 3    | 2 ≤ prev → increment to 4 | [1,2,3,4,3,7] | 4   |
| 4 | 3      | 4    | 3 ≤ prev → increment to 5 | [1,2,3,4,5,7] | 6   |
| 5 | 7      | 5    | 7 > prev → no change      | [1,2,3,4,5,7] | 6   |

==============================================================================================
Problem : Given an array with 0s, 1s, and 2s, sort it in-place so that:

All 0s come first,
Then 1s,
Then 2s.
Example Input: nums = [2,0,2,1,1,0]
Expected Output: [0,0,1,1,2,2]

Java Logic
int low = 0, mid = 0, high = nums.length - 1;

while (mid <= high) {
    if (nums[mid] == 0) swap(nums, low++, mid++);
    else if (nums[mid] == 1) mid++;
    else swap(nums, mid, high--);
}

low: next position for 0
mid: current element
high: next position for 2

Step-by-Step Dry Run
Initial Array:
nums = [2,0,2,1,1,0]
low=0, mid=0, high=5

| Step | mid val | Action                                           | low | mid | high | Array State   |
| ---- | ------- | ------------------------------------------------ | --- | --- | ---- | ------------- |
| 1    | 2       | swap(nums[mid], nums[high]) → 2 ↔ 0, high--      | 0   | 0   | 4    | [0,0,2,1,1,2] |
| 2    | 0       | swap(nums[low], nums[mid]) → 0 ↔ 0, low++, mid++ | 1   | 1   | 4    | [0,0,2,1,1,2] |
| 3    | 2       | swap(nums[mid], nums[high]) → 2 ↔ 1, high--      | 1   | 1   | 3    | [0,0,1,1,2,2] |
| 4    | 1       | mid++                                            | 1   | 2   | 3    | [0,0,1,1,2,2] |
| 5    | 1       | mid++                                            | 1   | 3   | 3    | [0,0,1,1,2,2] |
| 6    | 1       | mid++                                            | 1   | 4   | 3    | [0,0,1,1,2,2] |


===============================================================================================
=================================================================================================
Problem
Given a sorted array, return a new array of squares sorted in non-decreasing order.
Example Input:
nums = [-4, -1, 0, 3, 10]
Expected Output: [0, 1, 9, 16, 100]

int n = nums.length;
int[] result = new int[n];
int left = 0, right = n - 1;
int pos = n - 1; // fill result from end

while (left <= right) {
    if (Math.abs(nums[left]) > Math.abs(nums[right])) {
        result[pos] = nums[left] * nums[left];
        left++;
    } else {
        result[pos] = nums[right] * nums[right];
        right--;
    }
    pos--;
}
return result;


Step-by-Step Dry Run
| Step | left | right | nums[left] | nums[right] | pos | Action                                                                                                     | result array                                |               |
| ---- | ---- | ----- | ---------- | ----------- | --- | ---------------------------------------------------------------------------------------------------------- | ------------------------------------------- | ------------- |
| 1    | 0    | 4     | -4         | 10          | 4   |                                                                                                            | 10²=100 > (-4)²=16 → result[4]=100, right-- | [ , , , ,100] |
| 2    | 0    | 3     | -4         | 3           | 3   | (-4)²=16 < 3²=9 → 16>9? 16<9? wait, compare abs: 4<3? Actually abs(-4)=4 > abs(3)=3 → result[3]=16, left++ | [ , , ,16,100]                              |               |
| 3    | 1    | 3     | -1         | 3           | 2   | abs(-1)=1 < abs(3)=3 → result[2]=9, right--                                                                | [ , ,9,16,100]                              |               |
| 4    | 1    | 2     | -1         | 0           | 1   | abs(-1)=1 > abs(0)=0 → result[1]=1, left++                                                                 | [ ,1,9,16,100]                              |               |
| 5    | 2    | 2     | 0          | 0           | 0   | abs(0)=0 → result[0]=0, right--                                                                            | [0,1,9,16,100]                              |               |


===================================================================================================
        int left = 1;

        for (int right = 1; right < nums.length; right++) {
=============================================================================================
        1️⃣ Remove Duplicates from Sorted Array
           if(right < arr.length-1 && arr[right]== arr[right+1])
           continue;
            }
            else
            {
            arr[left] =arr[right];
            left++
            }
        }
        return left;
=============================================================================================
        2️⃣ Move Zeroes
          if (nums[right] != 0) {
                nums[left] = nums[right];
                left++
                }

                while (left < nums.length) {
                    nums[left++] = 0;
                    left++
                    }
=============================================================================================
        4️⃣ Remove Element
        if (nums[right] != val) {
                nums[left++] = nums[right];
            }
        }
        return slow;
=============================================================================================
         3️⃣ Move Negative Numbers to Left  (SWAP and increment left++)
           if (nums[right] < 0) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;

                left++;  // *** IMP

 =============================================================================================
      3️⃣ 485. Max Consecutive Ones
           int count = 0, maxCount = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != 0) {
                count++;
                maxCount = Math.max(count, maxCount);

            } else {
                count = 0;
            }
        }
        return maxCount;

==============================================================================================
         487. Max Consecutive Ones II
Input: [1,0,1,1,0] Output: 4
Explanation: Flip the first zero will get the the maximum number of consecutive 1s.
    After flipping, the maximum number of consecutive 1s is 4.

      int count = 0, maxLen = 0;
        int L = 0, R = 0;
        int n = nums.length;

        //find the consitve ones
        while (R < n) {
            if (nums[R] == 0) {
                count++;
            }

            //contract window if we dont meet the condition
            while (count > 1) {
                if (nums[L] == 0) //decrease count only when left pointer is pointing to 0
                {
                    count--;
                }
                L++;   // increment left counter if the counter is > 1
            }
            //upddate maxLength
            maxLen = Math.max(maxLen, R - L + 1);

            //move the R one to the right
            R++;
        }

        return maxLen;

=============================================================================================
   1️⃣ Squares of Sorted Array

       int l = 0, r = n - 1, idx = n - 1;
        while (l <= r) {
            if (Math.abs(nums[l]) > Math.abs(nums[r]))
                res[idx--] = nums[l++] * nums[l-1];
            else
                res[idx--] = nums[r--] * nums[r+1];
        }

}

=============================================================================================
2️⃣ Sort Colors (Dutch National Flag)

int low = 0, mid = 0, high = n - 1;
while (mid <= high) {
    if (nums[mid] == 0) swap(nums, low++, mid++);
    else if (nums[mid] == 1) mid++;
    else swap(nums, mid, high--);
}

=============================================================================================
3️⃣ Merge Sorted Array

int i = 0, j = 0, k = 0;
while (i < a.length && j < b.length)
    res[k++] = (a[i] <= b[j]) ? a[i++] : b[j++];
while (i < a.length) res[k++] = a[i++];
while (j < b.length) res[k++] = b[j++];

=============================================================================================
4️⃣ Partition Array (Even/Odd or Neg/Pos)

int i = 0;
for (int j = 0; j < n; j++)
    if (nums[j] < 0) swap(nums, i++, j);

=============================================================================================
5️⃣ Remove Adjacent Duplicates

int i = 0;
for (int j = 0; j < n; j++)
    if (i == 0 || nums[j] != nums[i - 1])
        nums[i++] = nums[j];

=============================================================================================
6️⃣ Replace / Remove / Modify Elements

int i = 0;
for (int j = 0; j < n; j++)
    if (nums[j] != val)
        nums[i++] = nums[j];

=============================================================================================
7️⃣ Move All X to End

int i = 0;
for (int j = 0; j < n; j++)
    if (nums[j] != x)
        nums[i++] = nums[j];
while (i < n) nums[i++] = x;


=============================================================================================
8️⃣ Trapping Rain Water (Two Pointers)

int l = 0, r = n - 1, lm = 0, rm = 0, water = 0;
while (l < r) {
    if (height[l] < height[r]) {
        lm = Math.max(lm, height[l]);
        water += lm - height[l++];
    } else {
        rm = Math.max(rm, height[r]);
        water += rm - height[r--];
    }
}


===================================================================================================
9️⃣ Minimum Increment to Make Array Unique

Arrays.sort(nums);
for (int i = 1; i < n; i++)
    if (nums[i] <= nums[i - 1])
        nums[i] = nums[i - 1] + 1;

=============================================================================================
🔟 Duplicate Zeros

int zeros = countZeros(nums);
for (int i = n - 1; i >= 0; i--) {
    if (i + zeros < n) nums[i + zeros] = nums[i];
    if (nums[i] == 0 && --zeros >= 0)
        nums[i + zeros] = 0;
}

=============================================================================================
1️⃣1️⃣ Remove Specific Character (String)

int i = 0;
for (int j = 0; j < s.length(); j++)
    if (s.charAt(j) != ch)
        arr[i++] = s.charAt(j);


=============================================================================================
     */




}
