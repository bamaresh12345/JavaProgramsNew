package TwoPointersNew.SlidingWindow_FixedLength;

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
int i = 0;

for (int j = 0; j < nums.length; j++) {

    while (set.contains(nums[j])) {
        set.remove(nums[i]);
        i++;
    }

    set.add(nums[j]);
    result = Math.max(result, j - i + 1);
}

     */


    /*

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
=========================================================
        int left = 1;

        for (int right = 1; right < nums.length; right++) {
        ===================================================
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
        ==========================================
        2️⃣ Move Zeroes
          if (nums[right] != 0) {
                nums[left] = nums[right];
                left++
                }

                while (left < nums.length) {
                    nums[left++] = 0;
                    left++
                    }
        ============================================
        4️⃣ Remove Element
        if (nums[right] != val) {
                nums[left++] = nums[right];
            }
        }
        return slow;
         ===========================================
         3️⃣ Move Negative Numbers to Left  (SWAP and increment left++)
           if (nums[right] < 0) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
            }


     */

}
