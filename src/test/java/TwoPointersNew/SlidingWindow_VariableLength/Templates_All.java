package TwoPointersNew.SlidingWindow_VariableLength;

public class Templates_All {

    /*
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

🔹 Data Structure Selection
        Problem Type	Use
        Sum / Count	int variable
        Duplicates	HashSet
        Frequency	HashMap
        First / Max / Min	Deque
        Characters	int[26] / Map

==================
🔹 Common Interview Traps 🚨

❌ Using nested loops
❌ Clearing entire window instead of shrinking
❌ Forgetting to remove left element
❌ Confusing substring vs subsequence
❌ Not explaining window movement

🔹 How to Explain in Interview (Script)

“I use a sliding window with two pointers.
The right pointer expands the window, and the left pointer shrinks it when the condition breaks.
This allows me to process all subarrays in linear time.”

🔹 Pattern Recognition (FAST)
Max / Min / Avg of size K → Fixed window
Longest / Shortest substring → Variable window
Duplicate check → HashSet
Frequency match → HashMap

🔥 5-Minute Revision Strategy

1️⃣ Identify window type (fixed / variable)
2️⃣ Choose DS (set / map / queue)
3️⃣ Write template
4️⃣ Add → Check → Remove → Slide
5️⃣ State time complexity = O(n)

If you want next:

Daily 7-day sliding window practice plan

Company-wise asked sliding window questions

PDF cheat-sheet

Mock interview Q&A

Just say 👍

Explain step by step🔹 Fixed Size Template
for (int j = 0; j < n; j++) {
    add(arr[j]);

    if (j >= k - 1) {
        updateAnswer();
        remove(arr[j - k + 1]);
    }
}

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

Great question — this is the core of sliding window mastery 👍
I’ll explain both templates step by step, slowly, with intuition + dry-run thinking, exactly how interviewers expect you to reason.

🔹 1️⃣ FIXED SIZE SLIDING WINDOW (Step-by-Step)
🔧 Template
for (int j = 0; j < n; j++) {
    add(arr[j]);

    if (j >= k - 1) {
        updateAnswer();
        remove(arr[j - k + 1]);
    }
}

🧠 When to Use

Window size is constant = k

Problems like:

Maximum Sum Subarray of Size K

Maximum Average Subarray

Maximum Vowels in Substring

🪜 Step-by-Step Explanation
🔹 Step 1: Right pointer j expands window
add(arr[j]);


👉 We add the current element into the window
This could mean:

Adding to sum

Increasing count

Adding to a set/map

📌 At this point, the window is growing from left to right

🔹 Step 2: Check if window size reached k
if (j >= k - 1)


Why k - 1?

At j = k - 1, window size becomes:

j - 0 + 1 = k


👉 Now we have exactly k elements

🔹 Step 3: Process the window
updateAnswer();


Now that the window size is exactly k, we:

Update max / min / count / average

This is where the actual problem logic happens

🔹 Step 4: Remove the leftmost element
remove(arr[j - k + 1]);


Why?

We are about to slide the window forward

The element at index j - k + 1 will leave the window

👉 This keeps window size fixed at k

🧪 Dry Run Example (Sum, k = 3)
arr = [2, 1, 5, 1, 3]

j	Window	Action
0	[2]	add
1	[2,1]	add
2	[2,1,5]	update → remove 2
3	[1,5,1]	update → remove 1
4	[5,1,3]	update → remove 5
🧠 Fixed Window Memory Trick
Add → When size == k → Answer → Remove → Slide

🔹 2️⃣ VARIABLE SIZE SLIDING WINDOW (Step-by-Step)
🔧 Template
int i = 0;

for (int j = 0; j < n; j++) {
    add(arr[j]);

    while (condition breaks) {
        remove(arr[i]);
        i++;
    }

    updateAnswer(j - i + 1);
}

🧠 When to Use
Window size is not fixed
Problems like:
Longest Substring Without Repeating Characters
Longest Subarray with Sum ≤ K
Fruit Into Baskets

🪜 Step-by-Step Explanation
🔹 Step 1: Initialize left pointer
int i = 0;


👉 i = start of the window
👉 j = end of the window

🔹 Step 2: Expand window using j
add(arr[j]);


Add the current element into the window
(window grows to the right)

🔹 Step 3: Shrink window if condition breaks
while (condition breaks) {
    remove(arr[i]);
    i++;
}


This is the heart of variable window ❗

Examples of condition breaking:

Duplicate character found

Sum > k

More than K distinct characters

👉 We shrink from the left until the window becomes valid again

🔹 Step 4: Update the answer
updateAnswer(j - i + 1);


Once window is valid, we calculate:

window length = j - i + 1


And update the max / min result

🧪 Dry Run Example

Longest Substring Without Repeating Characters

s = "abcabcbb"

j	Window	Action
0	[a]	valid
1	[a b]	valid
2	[a b c]	valid
3	[a b c a]	duplicate → remove a
3	[b c a]	valid
4	[b c a b]	duplicate → remove b
5	[c a b c]	duplicate → remove c

Max length = 3

🧠 Variable Window Memory Trick
Expand → Breaks? → Shrink → Valid → Answer

🔥 FINAL COMPARISON
Feature	Fixed Size	Variable Size
Window size	Constant	Dynamic
Condition	j >= k - 1	while (condition)
Remove	Always once	Possibly many times
Result	At exact size k	When valid
🎤 Interview Explanation (Perfect Answer)

“In fixed-size sliding window, I process the window only when its size reaches k.
In variable-size sliding window, I expand with the right pointer and shrink from the left whenever the condition is violated, ensuring linear time.”

If you want next:

Same explanation with real code problems

Common mistakes per template

One-page printable cheat-sheet

🔹 2️⃣ VARIABLE SIZE SLIDING WINDOW (Step-by-Step)
🔧 Template
int i = 0;

for (int j = 0; j < n; j++) {
    add(arr[j]);

    while (condition breaks) {
        remove(arr[i]);
        i++;
    }

    updateAnswer(j - i + 1);
}

🧠 When to Use

Window size is not fixed

Problems like:

Longest Substring Without Repeating Characters

Longest Subarray with Sum ≤ K

Fruit Into Baskets

🪜 Step-by-Step Explanation
🔹 Step 1: Initialize left pointer
int i = 0;


👉 i = start of the window
👉 j = end of the window

🔹 Step 2: Expand window using j
add(arr[j]);


Add the current element into the window
(window grows to the right)

🔹 Step 3: Shrink window if condition breaks
while (condition breaks) {
    remove(arr[i]);
    i++;
}


This is the heart of variable window ❗

Examples of condition breaking:

Duplicate character found

Sum > k

More than K distinct characters

👉 We shrink from the left until the window becomes valid again

🔹 Step 4: Update the answer
updateAnswer(j - i + 1);


Once window is valid, we calculate:

window length = j - i + 1


And update the max / min result

🧪 Dry Run Example

Longest Substring Without Repeating Characters

s = "abcabcbb"

j	Window	Action
0	[a]	valid
1	[a b]	valid
2	[a b c]	valid
3	[a b c a]	duplicate → remove a
3	[b c a]	valid
4	[b c a b]	duplicate → remove b
5	[c a b c]	duplicate → remove c

Max length = 3

🧠 Variable Window Memory Trick
Expand → Breaks? → Shrink → Valid → Answer

🔥 FINAL COMPARISON
Feature	Fixed Size	Variable Size
Window size	Constant	Dynamic
Condition	j >= k - 1	while (condition)
Remove	Always once	Possibly many times
Result	At exact size k	When valid
🎤 Interview Explanation (Perfect Answer)

“In fixed-size sliding window, I process the window only when its size reaches k.
In variable-size sliding window, I expand with the right pointer and shrink from the left whenever the condition is violated, ensuring linear time.”

If you want next:

Same explanation with real code problems

Common mistakes per template

One-page printable cheat-sheet

Mock interview Q&A

Just tell me 👍

===============================================
Problem	Input Example	Key Idea / Condition	Sliding Window Template	Notes
1️⃣ Longest Substring with At Most K Distinct Characters
 Eg --> s = "eceba", k = 2
Window can have ≤ k distinct chars

java Map<Character,Integer> map=new HashMap<>();
int left=0,maxLen=0;
for(int right=0;right<s.length();right++){
 char c=s.charAt(right);
 map.put(c,map.getOrDefault(c,0)+1);

  while(map.size()>k)
  { char leftChar=s.charAt(left);
  map.put(leftChar,map.get(leftChar)-1);
   if(map.get(leftChar)==0)
   map.remove(leftChar);
   left++; }
   maxLen=Math.max(maxLen,right-left+1);
   }	Uses HashMap to track counts
===========================================================================
2️⃣ Longest Repeating Character Replacement  (Track max frequency char to decide shrink)
s = "AABABBA", k = 1
Max freq char in window, replace ≤ k others
java
int[] freq=new int[26];
int left=0,maxFreq=0,maxLen=0;
for(int right=0;right<s.length();right++)
{ char c=s.charAt(right); freq[c-'A']++;
 maxFreq=Math.max(maxFreq,freq[c-'A']);
 while((right-left+1)-maxFreq>k)
 { freq[s.charAt(left)-'A']--;
  left++; }
   maxLen=Math.max(maxLen,right-left+1);
    }
Track max frequency char to decide shrink
============================================================================
3️⃣ Minimum Window Substring
s = "ADOBECODEBANC", t = "ABC"
Window must contain all chars of t
java
Map<Character,Integer> map=new HashMap<>();
for(char c:t.toCharArray())
map.put(c,map.getOrDefault(c,0)+1);
int left=0,count=t.length(),
minLen=Integer.MAX_VALUE,
start=0;
for(int right=0;right<s.length();right++)
{ char c=s.charAt(right);
if(map.containsKey(c)){
if(map.get(c)>0) count--;
map.put(c,map.get(c)-1); }
 while(count==0)
 { if(right-left+1<minLen)
 { minLen=right-left+1; start=left; }
 char lc=s.charAt(left);
 if(map.containsKey(lc)){
  map.put(lc,map.get(lc)+1);
  if(map.get(lc)>0)
  count++;
   } left++; }
    }
Track counts to know when window is v
===========================================================================

4️⃣ Subarray Sum ≤ K   ----> use   while(sum>K)
arr = [1,2,3,4], K = 5
Window sum ≤ K
java
int left=0,sum=0,maxLen=0;
 for(int right=0;right<arr.length;right++)
 { sum+=arr[right];
 while(sum>K)
 { sum-=arr[left];
  left++; }
  maxLen=Math.max(maxLen,right-left+1);  }
Expand right, shrink left when sum exceeds K
============================================================================
6️⃣ Longest Subarray with K Zeros/Ones
arr = [1,0,1,1,0,0,1], k = 2
Flip ≤ k zeros to maximize consecutive 1’s
int left=0,maxLen=0,zeros=0;
for(int right=0;right<arr.length;right++)
{ if(arr[right]==0)
zeros++;
while(zeros>k)
{ if(arr[left]==0)
zeros--; left++;
}
maxLen=Math.max(maxLen,right-left+1);
}
Count zeros, shrink when count > k
===========================================================================
7️⃣ Subarrays with K Distinct Integers
arr = [1,2,1,2,3], k = 2
Count exactly K distinct
Use two windows: atMostK(k) - atMostK(k-1)
Count subarrays with ≤ k distinct and subtract ≤ k-1 distinct.
============================================================================
5️⃣ Fruit into Baskets
fruits = [1,2,1,2,3]
Window ≤ 2 distinct
java
Map<Integer,Integer> map=new HashMap<>();
int left=0,maxLen=0;
for(int right=0;right<fruits.length;right++)
{ map.put(fruits[right];
map.getOrDefault(fruits[right],0)+1);

while(map.size()>2)
{ map.put(fruits[left],map.get(fruits[left])-1);
if(map.get(fruits[left])==0)
map.remove(fruits[left]); left++;
}
 maxLen=Math.max(maxLen,right-left+1);
 }
Similar to “At most K distinct characters” with k=2
===========================================================================
============================================================================
===========================================================================
============================================================================
===========================================================================
============================================================================
===========================================================================
============================================================================
===========================================================================
=======================================================================================================================================================
============================================================================


     */
}
