package LeetCode150Questions;

import java.util.HashSet;

public class CountingElementsLeetCode {

    public static int countElements(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        int count = 0;

        // Add all elements to the set
        for (int num : arr) {
            set.add(num);
        }

        // Check if num + 1 exists in the set
        for (int num : arr) {
            if (set.contains(num + 1)) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        System.out.println("Output: " + countElements(arr1)); // Output: 2

        int[] arr2 = {1, 1, 3, 3, 5, 5, 7, 7};
        System.out.println("Output: " + countElements(arr2)); // Output: 0
    }
}
