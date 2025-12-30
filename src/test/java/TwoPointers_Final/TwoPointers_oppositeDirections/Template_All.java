package TwoPointers_Final.TwoPointers_oppositeDirections;

public class Template_All {

    /*
    🔁 Two Pointers – Opposite Direction (Java)
🧠 Core Pattern
int left = 0;
int right = n - 1;

while (left < right) {
    // decision
    left++;   // or
    right--;
}


Used when:
Array/string is sorted
Need to compare both ends
Need pairs, palindromes, or reversal
===========================================================================================
🔁 Two Pointers – Opposite Direction (Java) — Programs List
=======================================================================================
#	Problem Name	Core Idea
==============================================================
1	Two Sum II – Input Array Is Sorted -->	Compare sum from both ends
2	Reverse String / Reverse Array	--> Swap left & right elements
3	Valid Palindrome	--> Compare characters from both ends
4	Container With Most Water -->	Move pointer with smaller height
5	Squares of a Sorted Array-->	Pick larger square from ends
6	Trapping Rain Water	Track leftMax & rightMax
7	3Sum -->	Fix one element, use two pointers
8	4Sum	--> Nested loops + two pointers
9	Remove Palindromic Subsequence	--> Check palindrome from ends
10	Shortest Unsorted Continuous Subarray -->	Detect disorder from both ends
11	Valid Palindrome II	 --> Allow one mismatch deletion
12	Minimum Difference Pair -->	Minimize difference using ends
13	Pair With Given Difference -->	Move pointers based on difference
14	Max Pair Sum Less Than K	-->Optimize sum under constraint
15	Boats to Save People  -->	Pair lightest with heaviest
16	Sort Array by Parity -->	Swap even & odd from ends
17	Move All Even Numbers to Front -->	Partition array using ends
18	Find Pair Closest to Target	 --> Minimize absolute difference
============================================================================================
s = "hello"
🧪 VERY SMALL DRY RUN (Step-by-Step) for hello string
=====================================================
| Step  | Left Index | Right Index | Swap              | Array State |
| ----- | ---------- | ----------- | ----------------- | ----------- |
| Start | 0 (`h`)    | 4 (`o`)     | h ↔ o             | o e l l h   |
| 1     | 1 (`e`)    | 3 (`l`)     | e ↔ l             | o l l e h   |
| Stop  | 2          | 2           | ❌ (left == right) | Done        |

✅ Output --> "olleh"
['o','l','l','e','h']
=================================================================================================
Input -->  arr = [10, 20, 30, 40]
Output --> arr = [40, 30, 20, 10]

| Step  | Left | Right | Swap    | Array       |
| ----- | ---- | ----- | ------- | ----------- |
| Start | 0    | 3     | 10 ↔ 40 | 40 20 30 10 |
| 1     | 1    | 2     | 20 ↔ 30 | 40 30 20 10 |
| Stop  | 2    | 1     | ❌       | Done        |

⚠️ COMMON MISTAKES
❌ Using left <= right (extra swap) ❌❌❌❌
❌ Forgetting left++ or right--
❌ Using extra array (not in-place)
=========================================================
s = ['a','b','c','d']
| Step | Left    | Right   | Swap      | Array   |
| ---- | ------- | ------- | --------- | ------- |
| 1    | 0 (`a`) | 3 (`d`) | a ↔ d     | d b c a |
| 2    | 1 (`b`) | 2 (`c`) | b ↔ c     | d c b a |
| 3 ❌  | 2 (`b`) | 1 (`c`) | **WRONG** | d b c a |

input --> abcd
output --> dbca  --> after dcba --> it again swap dbca (extra swap)

SWAP LOGIC → left < right
COMPARE LOGIC → left <= right (sometimes)
==========================================================================================
🧠 Decision Chart: < vs <= (Two Pointers)
🔑 Rule of Thumb

If you SWAP → use <
If you COMPARE → use <= (sometimes)
🧠 Decision Chart: < vs <= (Two Pointers)
🔑 Rule of Thumb

If you SWAP → use <
If you COMPARE → use <= (sometimes)
===========================================================================================
| Scenario                          | Pointer Condition | Why                            |
| --------------------------------- | ----------------- | ------------------------------ |
| Reversing array / string          | `left < right`    | Avoid extra or undo swap       |
| Swapping elements                 | `left < right`    | Pointers must not meet         |
| Container With Most Water         | `left < right`    | Width must be > 0              |
| Trapping Rain Water               | `left < right`    | Need valid boundaries          |
| Comparing characters (palindrome) | `left < right`    | Stop when meet                 |
| Comparing middle element allowed  | `left <= right`   | No swap involved               |
| Binary Search (mid check)         | `low <= high`     | Middle element must be checked |
| Read-only scanning                | `left <= right`   | No data mutation               |

============================================================================================
📋 COMPLETE PROBLEM LIST
1️⃣ Two Sum II – Input Array Is Sorted (LC 167)
Goal: Find two numbers that sum to target

int l = 0, r = nums.length - 1;
while (l < r) {
    int sum = nums[l] + nums[r];
    if (sum == target) return new int[]{l+1, r+1};
    else if (sum < target) l++;
    else r--;
}

📌 Sorted array → opposite pointers
================================================================================================
2️⃣ Reverse String / Reverse Array
int l = 0, r = s.length - 1;
while (l < r) {
    char temp = s[l];
    s[l] = s[r];
    s[r] = temp;
    l++; r--;
}
============================================================================================
3️⃣ Valid Palindrome (LC 125)
 s = s.toLowerCase();
 s = s.replaceAll("[^A-Za-z0-9]", "");

    int l = 0, r = s.length() - 1; // take length after *** IMP

    while (l < r) {
        if (s.charAt(l) != s.charAt(r)) {
            return false;
        } else{   // ELSE OPTIONAL *** IMP
        l++;
        r--; }
    }
    return true;
============================================================================================
4️⃣ Container With Most Water (LC 11)
int l = 0, r = height.length - 1;
int max = 0;

while (l < r) {
    int area = Math.min(height[l], height[r]) * (r - l);
    max = Math.max(max, area);
    if (height[l] < height[r]) l++;
    else r--;
}

============================================================================================
🧠 Move the smaller height

5️⃣ Squares of a Sorted Array (LC 977)
int l = 0, r = n - 1, idx = n - 1;
int[] res = new int[n];

while (l <= r) {
    if (Math.abs(nums[l]) > Math.abs(nums[r])) {
        res[idx--] = nums[l] * nums[l];
        l++;
    } else {
        res[idx--] = nums[r] * nums[r];
        r--;
    }
}
============================================================================================
6️⃣ Trapping Rain Water (LC 42)
int l = 0, r = height.length - 1;
int leftMax = 0, rightMax = 0, water = 0;

while (l < r) {
    if (height[l] < height[r]) {
        leftMax = Math.max(leftMax, height[l]);
        water += leftMax - height[l++];
    } else {
        rightMax = Math.max(rightMax, height[r]);
        water += rightMax - height[r--];
    }
}
============================================================================================
7️⃣ 3Sum (LC 15)
Arrays.sort(nums);

for (int i = 0; i < nums.length; i++) {
    int l = i + 1, r = nums.length - 1;
    while (l < r) {
        int sum = nums[i] + nums[l] + nums[r];
        if (sum == 0) {  store result  l++; r--; }
        else if (sum < 0) l++;
        else r--;
        }
        }
============================================================================================
8️⃣ 4Sum (LC 18)
Same idea as 3Sum, one more loop outside.
============================================================================================
9️⃣ Remove Palindromic Subsequence

Opposite pointer to check palindrome.
============================================================================================
🔟 Shortest Unsorted Continuous Subarray (LC 581)

Uses opposite pointers to find boundaries.

        📊 QUICK COMPARISON
Pattern	Same Direction	Opposite Direction
Pointer movement	→ →	← →
Typical use	Filtering, counting	Pairing, comparison
Needs sorted data	❌	✅ (mostly)
Examples	Remove duplicates	Two Sum, Palindrome


     */
}
