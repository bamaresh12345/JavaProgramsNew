package TwoPointers_Final.SlidingWindow_FixedLength;

public class Template_All {

/*
  🔹 3️⃣ Variable Size Sliding Window Template
👉 Window size changes dynamically
📌 Use cases
1. Longest Substring Without Repeating Characters
2. Longest Subarray with Sum ≤ K
3. Fruit Into Baskets

Subarray Sum Equals K (positive nums)

  ✅ Template
    int i = 0;

for (int j = 0; j < arr.length; j++) {

        // 1️⃣ Add element at j
        windowSum = windowSum + arr[j];

        // 2️⃣ Shrink window while condition breaks
        while (windowValue > k) {
            windowSum = windowSum - arr[i];
            i++;
        }

        // 3️⃣ Update answer
        result = Math.max(result, j - i + 1);
    }

    */


    /*
    🔹 4️⃣ Sliding Window + HashSet Template

👉 For duplicates problems

📌 Use cases

Contains Duplicate II

Longest Substring Without Repeating Characters

Set<Integer> set = new HashSet<>();
int left = 0;

for (int right = 0; right < nums.length; right++) {

    while (set.contains(nums[right])) {
        set.remove(nums[left]);
        left++;
    }

    set.add(nums[right]);
    result = Math.max(result, right - left + 1);
}



    🔹 What do left and right mean?
    In sliding window:
    left → start index of the window
    right → end index of the window

    The window includes both ends.

    indexes:   0   1   2   3   4
    array:   [a   b   c   d   e]

    left = 1, right = 3  → window = [b, c, d]

            🔹 Why +1 is required

    If you subtract indexes:

    right - left = 3 - 1 = 2   ****IMP


    But the window has 3 elements:

    b, c, d → count = 3


    That’s because indexes are zero-based, and both ends are included.

✅ Formula for number of elements
    window size = right - left + 1  == K


    /*
=================================================================================
| #  | Problem Name                                                    | Key Idea                           |
| -- | --------------------------------------------------------------- | ---------------------------------- |
| 1  | Maximum Sum Subarray of Size K                                  | Sum elements in window, slide by 1 |
| 2  | Minimum Sum Subarray of Size K                                  | Similar to max sum but track min   |
| 3  | Average of Subarray of Size K                                   | Maintain sum, divide by K          |
| 4  | Sliding Window Maximum                                          | Use deque to track max in window   |
| 5  | Sliding Window Minimum                                          | Use deque to track min in window   |
| 6  | Longest Substring with K Repeating Characters (fixed K letters) | Track counts in fixed window       |
| 7  | Count Occurrences of Anagram                                    | Fixed window size = pattern length |
| 8  | Maximum Number of Vowels in a Substring of Length K             | Count vowels in fixed window       |
| 9  | Sum of All Subarrays of Size K                                  | Slide window, accumulate sums      |
| 10 | Max Consecutive Ones II / K Flips variant                       | Count ones in fixed window, slide  |
| 11 | Average of Moving Window                                        | Streaming average over fixed size  |

=====================================================================================
1️⃣ Maximum Sum Subarray of Size K

Step-by-Step Dry Run
Initial Array: [2, 1, 5, 1, 3, 2], k = 3

Step 1: Initialize window sum (first k elements)
windowSum = 2 + 1 + 5 = 8
maxSum = 8

Step 2: Slide window forward

| i | Add arr[i] | Remove arr[i-k] | windowSum     | maxSum | Subarray |
| - | ---------- | --------------- | ------------- | ------ | -------- |
| 3 | 1          | 2               | 8 + 1 - 2 = 7 | 8      | [1,5,1]  |
| 4 | 3          | 1               | 7 + 3 - 1 = 9 | 9      | [5,1,3]  |
| 5 | 2          | 5               | 9 + 2 - 5 = 6 | 9      | [1,3,2]  |

Result : Maximum sum of subarray of size 3 = 9

=================================================================================================
9️⃣ Sum of All Subarrays of Size K
Problem : Find the sum of all contiguous subarrays of size k in a given array.
Example Input: arr = [1, 2, 3, 4, 5]  ,k = 3

Expected Output: Total sum = 24

Step 1: Initialize window sum (first k elements)
windowSum = 1 + 2 + 3 = 6
totalSum = 6

Step 2: Slide window forward
| i | Add arr[i] | Remove arr[i-k] | windowSum      | totalSum     | Subarray |
| - | ---------- | --------------- | -------------- | ------------ | -------- |
| 3 | 4          | 1               | 6 + 4 - 1 = 9  | 6 + 9 = 15   | [2,3,4]  |
| 4 | 5          | 2               | 9 + 5 - 2 = 12 | 15 + 12 = 27 | [3,4,5]  |

Result
Total sum of all subarrays of size 3 = 27




=================================================================================================
Problem : Compute the average of each subarray of size k in a given array.
Input  arr = [1, 2, 3, 4, 5]  ,k = 3
Output arr =[2.0, 3.0, 4.0]

Explanation:
[1,2,3] → (1+2+3)/3 = 2.0
[2,3,4] → (2+3+4)/3 = 3.0
[3,4,5] → (3+4+5)/3 = 4.0

Step-by-Step Dry Run
Initial Array: arr = [1, 2, 3, 4, 5], k = 3
Step 1: Initialize window sum (first k elements)
windowSum = 1 + 2 + 3 = 6

Step 2: Slide window forward
| i | windowSum before update | Average = windowSum / k | Add arr[i] | Subtract arr[i-k] | windowSum after update | Subarray |
| - | ----------------------- | ----------------------- | ---------- | ----------------- | ---------------------- | -------- |
| 3 | 6                       | 6 / 3 = 2.0             | 4          | 1                 | 6 + 4 - 1 = 9          | [1,2,3]  |
| 4 | 9                       | 9 / 3 = 3.0             | 5          | 2                 | 9 + 5 - 2 = 12         | [2,3,4]  |

Step 3: Last subarray (after loop finishes, windowSum = 12)

Average = 12 / 3 = 4.0
Subarray = [3,4,5]

Result : Averages = [2.0, 3.0, 4.0]


=================================================================================================
6️⃣ Longest Substring with K Repeating Characters
Problem
Given a string s and a number k, find the length of the longest substring of size k (or containing exactly k repeating characters in the window).
Example Input:
s = "aaabbc"
k = 2

Goal:
Find the longest substring where the most frequent character appears at least k times in the window.
Logic (Sliding Window – Fixed Length Concept)
Maintain a frequency map of characters in the window.
Track the maximum frequency character (maxFreq) in the window.
If window size - maxFreq > allowed replacements, shrink the window from left.
Track the maximum length of valid window.

Step-by-Step Dry Run

String: "aaabbc"
k = 2` (window of size 2 for simplicity in this example)

Step 1: Initialize variables
countMap = {}  // frequency of characters in window
left = 0
maxLen = 0
maxFreq = 0

Step 2: Slide window (right pointer moves)
| right | char | countMap            | maxFreq | windowLen = right-left+1 | Check (windowLen - maxFreq ≤ k) | maxLen |
| ----- | ---- | ------------------- | ------- | ------------------------ | ------------------------------- | ------ |
| 0     | 'a'  | {'a':1}             | 1       | 1                        | 1-1 ≤ 2 ✅                       | 1      |
| 1     | 'a'  | {'a':2}             | 2       | 2                        | 2-2 ≤ 2 ✅                       | 2      |
| 2     | 'a'  | {'a':3}             | 3       | 3                        | 3-3 ≤ 2 ✅                       | 3      |
| 3     | 'b'  | {'a':3,'b':1}       | 3       | 4                        | 4-3 ≤ 2 ✅                       | 4      |
| 4     | 'b'  | {'a':3,'b':2}       | 3       | 5                        | 5-3 ≤ 2 ✅                       | 5      |
| 5     | 'c'  | {'a':3,'b':2,'c':1} | 3       | 6                        | 6-3 ≤ 2 ❌ → shrink from left    | 5      |

Shrink window:
Remove s[left] = 'a' → countMap['a']=2, left=1
Now, windowLen = 5 (indexes 1-5)
5-2 ≤ 2 ❌ → shrink again
Remove s[left]='a' → countMap['a']=1, left=2
5-2 ≤ 2 ✅ → valid window, maxLen still 5

Result
Longest substring length with K repeating characters = 5
Substring = "aabbc" (or part of it depending on sliding)

=================================================================================================
8️⃣ Maximum Number of Vowels in Substring of Length K
Problem : Given a string s and integer k, find the maximum number of vowels in any substring of length k.

Example Input: s = "azerdii"  k = 3
Expected Output: 3
Explanation: The substring "erd" has 2 vowels, "dii" has 3 vowels → maximum = 3.

Logic (Sliding Window – Fixed Length)
Count the number of vowels in the first window of size k.
Slide the window by 1:
Subtract the leftmost character if it’s a vowel.
Add the new rightmost character if it’s a vowel.
Track the maximum count of vowels while sliding.

Step-by-Step Dry Run
String: "azerdii"
k = 3`

Step 1: First window [0..2] → "aze"
a → vowel → countVowels = 1
z → consonant → countVowels = 1
e → vowel → countVowels = 2
maxVowels = 2

Step 2: Slide window
| i (new char) | Window | Remove left?                             | Add right?                | countVowels | maxVowels |
| ------------ | ------ | ---------------------------------------- | ------------------------- | ----------- | --------- |
| 3 ('r')      | "zer"  | 'a' removed → vowel? yes → countVowels=1 | 'r' not vowel → 1         | 1           | 2         |
| 4 ('d')      | "erd"  | 'z' removed → consonant → 1              | 'd' not vowel → 1         | 1           | 2         |
| 5 ('i')      | "rdi"  | 'e' removed → vowel → countVowels=0      | 'i' vowel → countVowels=1 | 1           | 2         |
| 6 ('i')      | "dii"  | 'r' removed → consonant → countVowels=1  | 'i' vowel → countVowels=2 | 2           | 2         |

Wait! Let's correct:

Step 2 Detailed Correct Calculation:

Window "aze" → vowels: a,e → 2
Slide → "zer" → remove 'a' (vowel → -1) → count = 1, add 'r' (consonant → 0 change) → count =1, maxVowels=2
Slide → "erd" → remove 'z' (consonant → no change) → count=1, add 'd' (consonant → no change) → count=1, maxVowels=2
Slide → "rdi" → remove 'e' (vowel → -1?) Wait 'e' is at index 2? window is 3..5 → chars 'r','d','i', remove 'e'? No, left char='e'? indices 2..4, char 'e'? yes → countVowels-- → count=0, add 'i' (vowel) → count=1, maxVowels=2
Slide → "dii" → remove 'r' (consonant → no change) → count=1, add 'i' (vowel → count=2) → maxVowels=2

So final maximum vowels in any window = 2.
Note: careful with index tracking when doing dry run.

Result : Maximum vowels in any substring of size 3 = 2


✅ Explanation:
Maintain a vowel count for the current window.
Slide window: remove left char, add right char.
Track max count throughout.

=================================================================================================

    🧠 SLIDING WINDOW – INTERVIEW CHEAT-SHEET
🔹 When to Use Sliding Window?

        ✅ Subarray / substring
        ✅ Continuous elements
        ✅ Max / min / count / length
        ✅ Optimize from O(n²) → O(n)

        🔹 Fixed vs Variable Window
        Type	Condition
        Fixed size	j - i + 1 == k
        Variable size	while (condition breaks)
        ==========================================================
        🔹 Fixed Size Template
                for (int j = 0; j < n; j++) {
                    add(arr[j]);

                    if (j >= k - 1) {
                        updateAnswer();
                        remove(arr[j - k + 1]);
                    }
                }
=============================================================================
🔹 Variable Size Template
        int i = 0;

        for (int j = 0; j < n; j++) {
            add(arr[j]);

            while (condition breaks) {
                remove(arr[i]);
                i++;
            }

            updateAnswer(j - i + 1);
        }
==========================================================
🔹 Data Structure Selection
        Problem Type	                    Use
        ================================================
        Sum / Count	                    int variable
        Duplicates	                    HashSet
        Frequency	                    HashMap
        First / Max / Min	            Deque
        Characters	int[26] /           Map
=========================================
🔹 Common Interview Traps 🚨

❌ Using nested loops
❌ Clearing entire window instead of shrinking
❌ Forgetting to remove left element
❌ Confusing substring vs subsequence
❌ Not explaining window movement
=======================================================
🔹 How to Explain in Interview (Script)

“I use a sliding window with two pointers.
The right pointer expands the window, and the left pointer shrinks it when the condition breaks.
This allows me to process all subarrays in linear time.”


======================================================
🔹 Pattern Recognition (FAST)
Max / Min / Avg of size K → Fixed window
Longest / Shortest substring → Variable window
Duplicate check → HashSet
Frequency match → HashMap

=================================================
🔥 5-Minute Revision Strategy

1️⃣ Identify window type (fixed / variable)
2️⃣ Choose DS (set / map / queue)
3️⃣ Write template
4️⃣ Add → Check → Remove → Slide
5️⃣ State time complexity = O(n)
===================================================================
TEMPLATES for all
java program cheat sheet for below programs-->
• Remove duplicates from sorted array
• Move zeroes
• Move Negative Numbers to Left
• Remove element
==========================================================================
==========================================================================
🟢 Sliding Window – Fixed Length (Java-style Code Logic)

1️⃣ Maximum Sum Subarray of Size K

int windowSum = 0;
for (int i = 0; i < k; i++) windowSum += arr[i];
int maxSum = windowSum;

for (int i = k; i < n; i++) {
    windowSum = windowSum + arr[i] - arr[i - k];
    if (windowSum > maxSum) maxSum = windowSum;
}
return maxSum;

==========================================================================
2️⃣ Minimum Sum Subarray of Size K

int windowSum = 0;
for (int i = 0; i < k; i++)
windowSum += arr[i];

int minSum = windowSum;

for (int i = k; i < n; i++) {
    windowSum = windowSum + arr[i] - arr[i - k];
    if (windowSum < minSum) minSum = windowSum;   // ****IMP
}
return minSum;

==========================================================================
3️⃣ Average of Subarray of Size K

int windowSum = 0;
for (int i = 0; i < k; i++)
windowSum += arr[i];

for (int i = k; i < n; i++) {
    double avg = (double)windowSum / k; // process avg
    windowSum = windowSum + arr[i] - arr[i - k];
}

==========================================================================
6️⃣ Longest Substring with K Repeating Characters

int[] count = new int[26];
for (int i = 0; i < k; i++)
count[s.charAt(i) - 'a']++;
int maxFreq = max(count);

for (int i = k; i < n; i++) {
    count[s.charAt(i) - 'a']++;
    count[s.charAt(i - k) - 'a']--;
    maxFreq = max(count);
}

===========================================================================
7️⃣ Count Occurrences of Anagram

==========================================================================
8️⃣ Maximum Number of Vowels in Substring of Length K

int countVowels = 0;
for (int i = 0; i < k; i++) if (isVowel(s.charAt(i))) countVowels++;
int maxVowels = countVowels;

for (int i = k; i < n; i++) {
    if (isVowel(s.charAt(i))) countVowels++;
    if (isVowel(s.charAt(i - k))) countVowels--;
    maxVowels = Math.max(maxVowels, countVowels);
}

==========================================================================
9️⃣ Sum of All Subarrays of Size K

int windowSum = 0, totalSum = 0;
for (int i = 0; i < k; i++) windowSum += arr[i];
totalSum += windowSum;

for (int i = k; i < n; i++) {
    windowSum = windowSum + arr[i] - arr[i - k];
    totalSum += windowSum;
}

===========================================================================
🔟 Max Consecutive Ones II / K Flips

int countOnes = 0;
for (int i = 0; i < k; i++) if (arr[i] == 1) countOnes++;
int maxOnes = countOnes;

for (int i = k; i < n; i++) {
    if (arr[i] == 1) countOnes++;
    if (arr[i - k] == 1) countOnes--;
    maxOnes = Math.max(maxOnes, countOnes);
}


==========================================================================
1️⃣1️⃣ Average of Moving Window
int windowSum = 0;
for (int i = 0; i < k; i++) windowSum += arr[i];

for (int i = k; i < n; i++) {
    double avg = (double) windowSum / k; // process average
    windowSum = windowSum + arr[i] - arr[i - k];
}


==========================================================================
==========================================================================
==========================================================================
==========================================================================
==========================================================================
==========================================================================
==========================================================================
==========================================================================




==========================================================================
     */

}
