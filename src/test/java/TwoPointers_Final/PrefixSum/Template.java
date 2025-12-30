package TwoPointers_Final.PrefixSum;

import java.util.Arrays;

public class Template {
/*

•	📌 What is Prefix Sum?
Prefix Sum is a technique where we store the cumulative sum of elements up to each index so that range sum queries and
subarray calculations become fast.

Input  int[] arr = {2, 4, 6, 8};
Output  arr = [2, 6, 12, 20];  [2,  2+4, 2+4+6, 2+4+6+8]



 int[] arr = {2, 4, 6, 8};
  int[] prefix = new int[arr.length];
   prefix[0] = arr[0];

  // Step 1: Build prefix sum array
    for(int i=1; i<arr.length; i++)
      {
          prefix[i] = prefix[i-1] + arr[i];  // prefix[1-1] + arr[1]  and prefix[2-1] + arr[2]
      }
       System.out.println(Arrays.toString(prefix));   //[2, 6, 12, 20]
       ======================================================================
       if Memory contraint

       for(int i=1; i<arr.length; i++)
       {  arr[i] = arr[i-1] + arr[i]  // make sum if Memory is contraint
       }

===================================================================================================
=====================================================================================================
🟢 Top 5 Prefix Sum Problems – Java Interviews

| # | Problem Name                                                         | Key Idea / Approach                                                                    |
| - | -------------------------------------------------------------------- | -------------------------------------------------------------------------------------- |
| 1 | **Subarray Sum Equals K** (LeetCode 560)                             | Use **prefix sum + HashMap** to count number of subarrays with sum = K in O(n)         |
| 2 | **Maximum Sum Subarray of Size K** (Sliding Window Variant)          | Use **prefix sum array** or **sliding window** to compute sum of subarrays efficiently |
| 3 | **Range Sum Query – Immutable** (LeetCode 303)                       | Precompute **prefix sum array** to answer sum queries in O(1)                          |
| 4 | **Count Subarrays with Sum Divisible by K** (LeetCode 974 / variant) | Use **prefix sum modulo K + HashMap** to count subarrays efficiently                   |
| 5 | **2D Range Sum Query / Matrix Sum** (LeetCode 304)                   | Use **2D prefix sum array** to compute sum of any rectangle in O(1)                    |


=====================================================================================================
1️⃣ Subarray Sum Equals K (Prefix Sum + HashMap)

arr = [1, 2, 3, 0, -1, 2], k = 3

Expected Output: 4

Explanation: Subarrays with sum = 3 are: [1,2], [3], [3,0], [0,-1,2,2] (or adjusted index depending on counting).

| i (index) | arr[i] | Running Sum (sum) | sum - k | Found in Map? | Count Added | count | Prefix Map (sum → freq)        |
| --------- | ------ | ----------------- | ------- | ------------- | ----------- | ----- | ------------------------------ |
| 0         | 1      | 1                 | -2      | ❌             | 0           | 0     | {0:1, 1:1}                     |
| 1         | 2      | 3                 | 0       | ✅             | 1           | 1     | {0:1, 1:1, 3:1}                |
| 2         | 3      | 6                 | 3       | ✅             | 1           | 2     | {0:1, 1:1, 3:1, 6:1}           |
| 3         | 0      | 6                 | 3       | ✅             | 1           | 3     | {0:1, 1:1, 3:1, 6:2}           |
| 4         | -1     | 5                 | 2       | ❌             | 0           | 3     | {0:1, 1:1, 3:1, 6:2, 5:1}      |
| 5         | 2      | 7                 | 4       | ❌             | 0           | 3     | {0:1, 1:1, 3:1, 6:2, 5:1, 7:1} |

=======VARIABLES================================================
sum → keeps track of the running sum of elements as we iterate.
count → total number of subarrays found with sum = k.
prefixMap → maps a prefix sum value to the number of times it has occurred.
prefixMap.put(0,1) → base case to handle subarrays starting at index 0.

int sum = 0;
int count = 0;
Map<Integer, Integer> prefixMap = new HashMap<>();
prefixMap.put(0, 1); // base case

for (int i = 0; i < n; i++) {
    sum += arr[i];      //Add current element to the running sum (sum).

    /*1. So if sum - k exists in prefixMap, it means there is at least one previous subarray ending before i such that the sum of elements between that point and i is k.
    2. Add the frequency of sum - k in prefixMap to count because there may be multiple subarrays contributing.

    if (prefixMap.containsKey(sum - k)) {  //3️⃣ Check for Previous Prefix Sum   ,sum[i] - sum[j] = k  → subarray arr[j+1..i] has sum = k
        count += prefixMap.get(sum - k);  // 2. Add the frequency of sum - k in prefixMap to count because there may be multiple subarrays contributing.
    }

 /*Store the current running sum sum in the map.
Increment frequency if it already exists.
This ensures future subarrays can use this sum for calculation.

    prefixMap.put(sum, prefixMap.getOrDefault(sum, 0) + 1); //Store the current running sum sum in the map, Increment frequency if it already exists.This ensures future subarrays can use this sum for calculation.
}
return count;

Key Idea:
Track running sum (prefix sum).
Count subarrays with sum = K using sum - k in map.


🔹 Example Dry Run
Array: [1, 2, 3], k = 3
| i | arr[i] | sum | sum - k | Found? | count | prefixMap         |
| - | ------ | --- | ------- | ------ | ----- | ----------------- |
| 0 | 1      | 1   | -2      | ❌      | 0     | {0:1,1:1}         |
| 1 | 2      | 3   | 0       | ✅      | 1     | {0:1,1:1,3:1}     |
| 2 | 3      | 6   | 3       | ✅      | 2     | {0:1,1:1,3:1,6:1} |


✅ Result: 2 subarrays → [1,2] and [3]

=================================================================================================================
2️⃣ Maximum Sum Subarray of Size K (Sliding Window / Prefix Sum)

Problem : Find the maximum sum of any contiguous subarray of size k.

Example Input: arr = [2, 1, 5, 1, 3, 2]  k = 3
Expected Output: 9
Explanation: Subarray [5,1,3] has the maximum sum 9.

Step-by-Step Dry Run (Tabular Format)
| i (right) | Added arr[i] | Removed arr[i-k] | windowSum | maxSum | Current Subarray |
| --------- | ------------ | ---------------- | --------- | ------ | ---------------- |
| 0         | 2            | -                | 2         | 2      | [2]              |
| 1         | 1            | -                | 3         | 3      | [2,1]            |
| 2         | 5            | -                | 8         | 8      | [2,1,5]          |
| 3         | 1            | 2                | 7         | 8      | [1,5,1]          |
| 4         | 3            | 1                | 9         | 9      | [5,1,3]          |
| 5         | 2            | 5                | 6         | 9      | [1,3,2]          |

Result
Maximum sum of subarray of size 3 = 9
Explanation Compute sum of first k elements → windowSum.
Slide window by adding the new element and removing the element leaving the window.
Keep updating maxSum at each step.
Final maxSum is the maximum sum of any subarray of size k.

int windowSum = 0;
for (int i = 0; i < k; i++) windowSum += arr[i];
int maxSum = windowSum;

for (int i = k; i < n; i++) {
    windowSum = windowSum + arr[i] - arr[i - k]; // slide window
    maxSum = Math.max(maxSum, windowSum);
}
return maxSum;

Key Idea:
Compute sum of first k elements, slide window by 1.
Update maxSum.

===============================================================================================================
3️⃣ Range Sum Query – Immutable (Prefix Sum Array)

Problem : Given an array arr, preprocess it to answer sum of elements between indices l and r quickly.

Example Input: arr = [1, 2, 3, 4, 5]
Queries: sum(1,3), sum(0,2)

Expected Output:
sum(1,3) = 2+3+4 = 9
sum(0,2) = 1+2+3 = 6

Step-by-Step Dry Run
Array: [1, 2, 3, 4, 5]
Step 1: Build prefix sum array.

| i | arr[i] | prefix[i] = sum arr[0..i] |
| - | ------ | ------------------------- |
| 0 | 1      | 1                         |
| 1 | 2      | 1 + 2 = 3                 |
| 2 | 3      | 3 + 3 = 6                 |
| 3 | 4      | 6 + 4 = 10                |
| 4 | 5      | 10 + 5 = 15               |

Prefix Array: [1, 3, 6, 10, 15]

Step 2: Answer queries

Query sum(1,3)

l = 1, r = 3
sum = prefix[3] - prefix[0] = 10 - 1 = 9
Subarray = [2,3,4]


Query sum(0,2)

l = 0, r = 2
sum = prefix[2] = 6
Subarray = [1,2,3]

Result
sum(1,3) = 9
sum(0,2) = 6

Explanation

Prefix sum array stores cumulative sum up to each index.

Query sum(l,r) is computed in O(1) using:

=========================================================================================================
4️⃣ Count Subarrays with Sum Divisible by K

Problem :Given an array arr and an integer k, count the number of continuous subarrays whose sum is divisible by k.

Example Input: arr = [4, 5, 0, -2, -3, 1]  k = 5
Expected Output: 7
Explanation: Subarrays divisible by 5 are [4,5,0,-2,-3,1] subsets where sum % 5 == 0.

Step-by-Step Dry Run (Tabular Format)
Array: [4, 5, 0, -2, -3, 1], k = 5

| i | arr[i] | Running Sum (sum) | sum % k (mod) | modMap (mod → freq) | Subarrays Count Added | Total Count |
| - | ------ | ----------------- | ------------- | ------------------- | --------------------- | ----------- |
| 0 | 4      | 4                 | 4             | {0:1,4:1}           | 0                     | 0           |
| 1 | 5      | 9                 | 4             | {0:1,4:2}           | 1                     | 1           |
| 2 | 0      | 9                 | 4             | {0:1,4:3}           | 2                     | 3           |
| 3 | -2     | 7                 | 2             | {0:1,4:3,2:1}       | 0                     | 3           |
| 4 | -3     | 4                 | 4             | {0:1,4:4,2:1}       | 3                     | 6           |
| 5 | 1      | 5                 | 0             | {0:2,4:4,2:1}       | 1                     | 7           |

Result
Total number of subarrays divisible by 5 → 7

4️⃣ Count Subarrays with Sum Divisible by K

int sum = 0, count = 0;
Map<Integer, Integer> modMap = new HashMap<>();
modMap.put(0, 1); // base case

for (int i = 0; i < n; i++) {
    sum += arr[i];
    int mod = ((sum % k) + k) % k; // handle negative numbers
    count += modMap.getOrDefault(mod, 0);
    modMap.put(mod, modMap.getOrDefault(mod, 0) + 1);
}
return count;

Key Idea:
Use prefix sum modulo K.
Count how many previous sums have same modulo.

==============================================================================================================
5️⃣ 2D Range Sum Query / Matrix Sum

Problem : Given a 2D matrix, preprocess it to quickly answer sum of elements in any rectangle defined by top-left (r1,c1) and
bottom-right (r2,c2).

Example Input:
matrix = [
  [1, 2, 3],
  [4, 5, 6],
  [7, 8, 9]
]

Query: sum of rectangle from (1,1) to (2,2)

Expected Output: sum = 5 + 6 + 8 + 9 = 28

Step 1: Build 2D Prefix Sum
| i\j | 0  | 1  | 2  |
| --- | -- | -- | -- |
| 0   | 1  | 3  | 6  |
| 1   | 5  | 12 | 21 |
| 2   | 12 | 27 | 45 |

Calculation Details:

prefix[0][0] = 1

prefix[0][1] = 1 + 2 = 3

prefix[0][2] = 3 + 3 = 6

prefix[1][0] = 1 + 4 = 5

prefix[1][1] = 5 + 12 ? Wait let's compute properly:

Formula:

prefix[i][j] = matrix[i][j] + top + left - top-left


prefix[0][0] = 1
prefix[0][1] = 2 + 0 + 1 - 0 = 3
prefix[0][2] = 3 + 0 + 3 - 0 = 6
prefix[1][0] = 4 + 1 + 0 - 0 = 5
prefix[1][1] = 5 + 3 + 5 - 1 = 12
prefix[1][2] = 6 + 6 + 12 - 3 = 21
prefix[2][0] = 7 + 5 + 0 - 0 = 12
prefix[2][1] = 8 + 12 + 12 - 5 = 27
prefix[2][2] = 9 + 21 + 27 - 12 = 45 ✅

Step 2: Query sum of rectangle (1,1) to (2,2)

prefix[r2][c2] = prefix[2][2] = 45
Subtract top: r1>0 → prefix[r1-1][c2] = prefix[0][2] = 6
Subtract left: c1>0 → prefix[r2][c1-1] = prefix[2][0] = 12
Add top-left: r1>0 && c1>0 → prefix[r1-1][c1-1] = prefix[0][0] = 1
sum = 45 - 6 - 12 + 1 = 28

Submatrix elements:
5 6
8 9
Sum = 28

Result  : Sum of rectangle (1,1) to (2,2) = 28

======================================================================================================

==========================================================================================================
1️⃣ Subarray Sum Equals K (Prefix Sum + HashMap)
int sum = 0;
int count = 0;
Map<Integer, Integer> prefixMap = new HashMap<>();
prefixMap.put(0, 1); // base case

for (int i = 0; i < n; i++) {
    sum += arr[i];
    if (prefixMap.containsKey(sum - k)) {
        count += prefixMap.get(sum - k);
    }
    prefixMap.put(sum, prefixMap.getOrDefault(sum, 0) + 1);
}
return count;

Key Idea:
Track running sum (prefix sum).
Count subarrays with sum = K using sum - k in map.


======================================================================================================
2️⃣ Maximum Sum Subarray of Size K (Sliding Window / Prefix Sum)

int windowSum = 0;
for (int i = 0; i < k; i++) windowSum += arr[i];
int maxSum = windowSum;

for (int i = k; i < n; i++) {
    windowSum = windowSum + arr[i] - arr[i - k]; // slide window
    maxSum = Math.max(maxSum, windowSum);
}
return maxSum;

Key Idea:
Compute sum of first k elements, slide window by 1.
Update maxSum.
=====================================================================================================
3️⃣ Range Sum Query – Immutable (Prefix Sum Array)
// Build prefix sum array
int[] prefix = new int[n];
prefix[0] = arr[0];
for (int i = 1; i < n; i++)
 prefix[i] = prefix[i-1] + arr[i];

// Query sum from l to r
int l = ...;
int r = ...;
int sum = (l == 0) ? prefix[r] : prefix[r] - prefix[l-1];

Key Idea:
Precompute prefix sum to answer any range sum query in O(1).
===============================================================================================================

4️⃣ Count Subarrays with Sum Divisible by K

int sum = 0, count = 0;
Map<Integer, Integer> modMap = new HashMap<>();
modMap.put(0, 1); // base case

for (int i = 0; i < n; i++) {
    sum += arr[i];
    int mod = ((sum % k) + k) % k; // handle negative numbers
    count += modMap.getOrDefault(mod, 0);
    modMap.put(mod, modMap.getOrDefault(mod, 0) + 1);
}
return count;

Key Idea:
Use prefix sum modulo K.
Count how many previous sums have same modulo.

=========================================================================================================
5️⃣ 2D Range Sum Query / Matrix Sum

int[][] matrix; // n x m
int[][] prefix = new int[n][m];

// Build 2D prefix sum
for (int i = 0; i < n; i++) {
    for (int j = 0; j < m; j++) {
        prefix[i][j] = matrix[i][j]
            + (i > 0 ? prefix[i-1][j] : 0)
            + (j > 0 ? prefix[i][j-1] : 0)
            - (i > 0 && j > 0 ? prefix[i-1][j-1] : 0);
    }
}

// Query sum of rectangle from (r1,c1) to (r2,c2)
int sum = prefix[r2][c2]
        - (r1 > 0 ? prefix[r1-1][c2] : 0)
        - (c1 > 0 ? prefix[r2][c1-1] : 0)
        + (r1 > 0 && c1 > 0 ? prefix[r1-1][c1-1] : 0);

==============================================================================================================
======================================================================================================

==========================================================================================================

======================================================================================================
=====================================================================================================
===============================================================================================================
=========================================================================================================
==============================================================================================================
======================================================================================================

==========================================================================================================

======================================================================================================
 */

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8};

        int[] prefix = new int[arr.length];
        prefix[0] = arr[0];

        // Step 1: Build prefix sum array
        for(int i=1; i<arr.length; i++)
        {
            prefix[i] = prefix[i-1] + arr[i];  // prefix[1-1] + arr[1]  and prefix[2-1] + arr[2]
        }

        System.out.println(Arrays.toString(prefix));   //[2, 6, 12, 20]


        // Step 2: Query sum of subarray [l, r] (0-based index)
        int l =2; // ...; // left index
        int r =4; // ...; // right index
        int subarraySum;
        if (l == 0) {
            subarraySum = prefix[r];
        } else {
            subarraySum = prefix[r] - prefix[l - 1];
        }

// Now subarraySum contains sum of arr[l..r]

        /*
        Explanation

        prefix[i] stores the sum of elements from index 0 to i.
        Sum of any subarray [l, r] can be calculated in O(1):
        sum[l..r] = prefix[r] - prefix[l-1]  (if l>0)
        sum[0..r] = prefix[r]                 (if l==0)

        Example
        arr = [2, 4, 6, 8]
       prefix = [2, 6, 12, 20]

          // Sum of subarray [1,3] → arr[1]+arr[2]+arr[3] = 4+6+8=18
          subarraySum = prefix[3] - prefix[0] = 20 - 2 = 18

         */


    }

}
