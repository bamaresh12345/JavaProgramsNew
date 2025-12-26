package JavaGenerices;

public class TimeAndSpaceComplexity {

    /*

    📊 Common Interview Table
Big-O	Example
O(1)	Access array element
O(log n)	Binary search
O(n)	Single loop
O(n²)	Nested loops
O(n log n)	Merge sort
🎯 Interview One-Liner
“Time complexity measures how runtime grows with input size, while space complexity measures additional memory used.”


    🔹 What is Time Complexity?
Time Complexity tells us how fast or slow an algorithm runs as the input size (n) grows.
👉 It does NOT measure actual seconds — it measures number of operations.

⏱️ TIME COMPLEXITY (Big-O)
Time:
One loop → O(n)
Nested loops → O(n²)
Divide by half → O(log n)
Space:



🔹 What is Space Complexity?
Space Complexity tells us how much extra memory an algorithm uses as input size grows.
👉 Includes:
Variables
Data structures (arrays, HashMap, recursion stack)

1️⃣ O(1) — Constant Space
2️⃣ O(n) — Linear Space
3️⃣ O(n) due to Recursion Stack

🔹 Why are they important?
Help choose efficient code
Important for interviews
Helps avoid performance issues
⏱️ TIME COMPLEXITY (Big-O)
1️⃣ O(1) — Constant Time

Execution time does not change with input size.

Java Example
int getFirst(int[] arr) {
    return arr[0];
}

=================================
✔ Fastest possible

2️⃣ O(n) — Linear Time

Time increases linearly with input size.

int sum(int[] arr) {
    int total = 0;
    for (int i : arr) {
        total += i;
    }
    return total;
}

📌 Loop runs n times
=================================================================
3️⃣ O(n²) — Quadratic Time
Nested loops → slow for large input.

void printPairs(int[] arr) {
    for (int i : arr) {
        for (int j : arr) {
            System.out.println(i + "," + j);
        }
    }
}

⚠️ Avoid if possible
===================================================================
4️⃣ O(log n) — Logarithmic Time --> Problem size reduces by half each step.

int binarySearch(int[] arr, int target) {
    int left = 0, right = arr.length - 1;
    while (left <= right) {
        int mid = (left + right) / 2;
        if (arr[mid] == target) return mid;
        if (arr[mid] < target) left = mid + 1;
        else right = mid - 1;
    }
    return -1;
}
⭐ Very efficient
=============================================================================
5️⃣ O(n log n)
Common in efficient sorting.
Examples:
Merge Sort
Quick Sort (average case)
===============================================================================
💾 SPACE COMPLEXITY
1️⃣ O(1) — Constant Space

Uses a fixed number of variables.

int swap(int a, int b) {
    int temp = a;
    a = b;
    b = temp;
    return a;
}
==================================================================================
2️⃣ O(n) — Linear Space

Extra memory grows with input size.

int[] copyArray(int[] arr) {
    int[] copy = new int[arr.length];
    return copy;
}
=============================================================================
3️⃣ O(n) due to Recursion Stack
int factorial(int n) {
    if (n == 0) return 1;
    return n * factorial(n - 1);
}


Space = O(n) (call stack)
======================================================================
🧠 How to Analyze Complexity (Interview Method)
Time:
One loop → O(n)
Nested loops → O(n²)
Divide by half → O(log n)
Space:

1️⃣ O(1) — Constant Space
2️⃣ O(n) — Linear Space
3️⃣ O(n) due to Recursion Stack
Count extra arrays, maps, recursion calls

Ignore input size itself

🔹 Example: Longest Substring Without Repeating Characters
for (int right = 0; right < s.length(); right++) {
    while (set.contains(s.charAt(right))) {
        set.remove(s.charAt(left));
        left++;
    }
}


Time: O(n) → each char added & removed once

Space: O(n) → HashSet stores characters

📊 Common Interview Table
Big-O	Example
O(1)	Access array element
O(log n)	Binary search
O(n)	Single loop
O(n²)	Nested loops
O(n log n)	Merge sort
🎯 Interview One-Liner
“Time complexity measures how runtime grows with input size, while space complexity measures additional memory used.”
     */
}
