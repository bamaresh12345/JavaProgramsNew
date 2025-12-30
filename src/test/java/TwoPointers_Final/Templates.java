package TwoPointers_Final;
/*
How to Recognize Two Pointer Problems in Interviews
Look for keywords:
•	Sorted array
•	Subarray / substring
•	Contiguous
•	In-place
•	Maximum / minimum window
•	Pair / triplet


🔹 1. Classic Two Pointer (Opposite Ends)
Easy****************
Two Sum II – Input Array Is Sorted (LC 167)
Reverse String (LC 344)
Valid Palindrome (LC 125)
Squares of a Sorted Array (LC 977)
Remove Duplicates from Sorted Array (LC 26)
Remove Element (LC 27)

Medium******************

Container With Most Water (LC 11)
3Sum (LC 15)
3Sum Closest (LC 16)
4Sum (LC 18)
Trapping Rain Water (LC 42)
Boats to Save People (LC 881)

🔹 2. Fast & Slow Pointer (Cycle Detection)
Easy**********************
Linked List Cycle (LC 141)
Middle of the Linked List (LC 876)

Medium
Linked List Cycle II (LC 142)
Happy Number (LC 202)
Remove Nth Node From End of List (LC 19)

🔹 3. Sliding Window (Variable Window) ***************************
Easy
Maximum Average Subarray I (LC 643)
Longest Substring Without Repeating Characters (LC 3)
Best Time to Buy and Sell Stock (LC 121)
Medium (🔥 VERY IMPORTANT)
Minimum Size Subarray Sum (LC 209)
Subarray Sum Equals K (LC 560)
Longest Substring with At Most K Distinct Characters
Longest Repeating Character Replacement (LC 424)
Permutation in String (LC 567)
Find All Anagrams in a String (LC 438)
Fruit Into Baskets (LC 904)

🔹 4. Two Pointer + Sorting ***********************
Medium
Kth Largest Element in an Array (LC 215)
Sort Colors (Dutch National Flag) (LC 75)
Merge Sorted Array (LC 88)
Intersection of Two Arrays II (LC 350)
🔹 5. Prefix + Two Pointer / Window
Medium
Longest Subarray with Sum ≤ K
Longest Subarray with Sum = K (positive numbers)
Binary Subarrays With Sum (LC 930)
🔹 6. Advanced Two Pointer Patterns (High Frequency)
Medium–Hard
Rotate Array (LC 189)
Move Zeroes (LC 283)
Remove Duplicates from Sorted Array II (LC 80)
Minimum Window Substring (LC 76)
Subarray Product Less Than K (LC 713)

🔹 7. String Two Pointer Problems *******************
Easy–Medium
Is Subsequence (LC 392)
Backspace String Compare (LC 844)
Reverse Words in a String (LC 151)
Palindrome Partitioning (LC 131)

🔹 Interview-Ready Core Set (Must Practice)
If you are short on time, practice these first:

✔ Two Sum II
✔ Move Zeroes
✔ Remove Duplicates from Sorted Array
✔ Sort Colors
✔ Minimum Size Subarray Sum
✔ Longest Substring Without Repeating Characters
✔ Longest Substring with At Most K Distinct Characters
✔ Subarray Sum Equals K
✔ Container With Most Water

🔹 How to Recognize Two Pointer Problems in Interviews

Look for keywords:

Sorted array

Subarray / substring

Contiguous

In-place

Maximum / minimum window

Pair / triplet

If you want, I can:
✅ Create a 30-day Two Pointer practice plan
✅ Provide Java templates for each pattern
✅ Give mock interview questions with hints

👉 What would you like next?

Provide Java templates for each pattern

Excellent request 👍
Below are INTERVIEW-READY Java templates for every major Two-Pointer & Sliding Window pattern.
You can memorize these templates and adapt them to almost any problem.

🔹 1. Two Pointers – Opposite Ends (Sorted Array)
🔑 Used for: Two Sum II, Palindrome, Container With Most Water
int left = 0;
int right = nums.length - 1;

while (left < right) {
    int sum = nums[left] + nums[right];

    if (sum == target) {
        // found answer
        break;
    } else if (sum < target) {
        left++;
    } else {
        right--;
    }
}

🔹 2. Two Pointers – Same Direction (In-Place Array Modification)
🔑 Used for: Move Zeroes, Remove Duplicates
int slow = 0;

for (int fast = 0; fast < nums.length; fast++) {
    if (nums[fast] != 0) {
        nums[slow] = nums[fast];
        slow++;
    }
}

🔹 3. Sliding Window – Fixed Size
🔑 Used for: Maximum Average Subarray, Fixed window sums
int windowSum = 0;
int windowSize = k;

for (int i = 0; i < windowSize; i++) {
    windowSum += nums[i];
}

for (int end = windowSize; end < nums.length; end++) {
    windowSum += nums[end];
    windowSum -= nums[end - windowSize];
}

🔹 4. Sliding Window – Variable Size (Positive Numbers Only)
🔑 Used for: Minimum Size Subarray Sum
int left = 0, sum = 0;
int minLen = Integer.MAX_VALUE;

for (int right = 0; right < nums.length; right++) {
    sum += nums[right];

    while (sum >= target) {
        minLen = Math.min(minLen, right - left + 1);
        sum -= nums[left];
        left++;
    }
}
===============================================================================
🔹 5. Sliding Window + HashMap (At Most K Distinct)
🔑 Used for: Longest Substring with At Most K Distinct Characters
int left = 0, maxLen = 0;
Map<Character, Integer> map = new HashMap<>();

for (int right = 0; right < s.length(); right++) {
    char ch = s.charAt(right);
    map.put(ch, map.getOrDefault(ch, 0) + 1);

    while (map.size() > k) {
        char leftChar = s.charAt(left);
        map.put(leftChar, map.get(leftChar) - 1);
        if (map.get(leftChar) == 0) {
            map.remove(leftChar);
        }
        left++;
    }

    maxLen = Math.max(maxLen, right - left + 1);
}
=========================================================================================
🔹 6. Sliding Window + HashSet (No Repeating Characters)
🔑 Used for: Longest Substring Without Repeating Characters
Set<Character> set = new HashSet<>();
int left = 0, maxLen = 0;

for (int right = 0; right < s.length(); right++) {
    while (set.contains(s.charAt(right))) {
        set.remove(s.charAt(left));
        left++;
    }
    set.add(s.charAt(right));
    maxLen = Math.max(maxLen, right - left + 1);
}
============================================================================================
🔹 7. Prefix Sum + HashMap (Subarray Sum = K)
🔑 Used for: Subarray Sum Equals K
Map<Integer, Integer> map = new HashMap<>();
map.put(0, 1);

int sum = 0, count = 0;

for (int num : nums) {
    sum += num;

    if (map.containsKey(sum - k)) {
        count += map.get(sum - k);
    }

    map.put(sum, map.getOrDefault(sum, 0) + 1);
}
=====================================================================================================
🔹 8. Dutch National Flag (3 Pointers)
🔑 Used for: Sort Colors
int low = 0, mid = 0, high = nums.length - 1;

while (mid <= high) {
    if (nums[mid] == 0) {
        swap(nums, low++, mid++);
    } else if (nums[mid] == 1) {
        mid++;
    } else {
        swap(nums, mid, high--);
    }
}
🔍 Case-by-case Logic
✅ Case 1: arr[mid] == 0
swap(low++, mid++);
Why?
•	0 belongs to the left side
•	Swap it with low
•	Move both pointers forward because:
o	The swapped value at mid is already processed
📌 Result: expands the 0s zone
✅ Case 2: arr[mid] == 1
mid++;
Why?
•	1 belongs in the middle
•	It’s already in the correct region
•	Just move ahead
📌 Result: expands the 1s zone
✅ Case 3: arr[mid] == 2
swap(mid, high--);
Why?
•	2 belongs to the right side
•	Swap with high
•	Decrease high

========================================================================================
🔹 9. Fast & Slow Pointers (Cycle Detection)
🔑 Used for: Linked List Cycle, Happy Number
ListNode slow = head;
ListNode fast = head;

while (fast != null && fast.next != null) {
    slow = slow.next;
    fast = fast.next.next;

    if (slow == fast) {
        return true;
    }
}
=====================================================================================
🔹 10. Rotate Array – Reversal Pattern
🔑 Used for: Rotate Array
k = k % nums.length;

reverse(nums, 0, nums.length - 1);
reverse(nums, 0, k - 1);
reverse(nums, k, nums.length - 1);
=====================================================================================
🔹 11. Merge Two Sorted Arrays (Two Pointers)
int i = m - 1, j = n - 1, k = m + n - 1;

while (i >= 0 && j >= 0) {
    nums1[k--] = nums1[i] > nums2[j] ? nums1[i--] : nums2[j--];
}

while (j >= 0) {
    nums1[k--] = nums2[j--];
}

🔹 MASTER INTERVIEW TIP 🔥

If interviewer says:

Sorted array → Two pointers (ends)

Subarray / substring → Sliding window

Count subarrays → Prefix sum + HashMap

In-place → Same direction pointers

Distinct characters → HashMap / HashSet

✅ What I Can Do Next

✔ Convert these into a 1-page cheat sheet PDF
✔ Give mock interview problems with hints
✔ Create a pattern → problem mapping table
✔ Provide LeetCode practice order (Beginner → Advanced)

👉 What do you want next?

ChatGPT can make mistak

 */
public class Templates {
    {}
}
