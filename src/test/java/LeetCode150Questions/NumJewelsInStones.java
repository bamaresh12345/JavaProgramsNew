package LeetCode150Questions;

import java.util.HashSet;

public class NumJewelsInStones {

    public int numJewelsInStones(String jewels, String stones) {

        // Create a HashSet to store jewels for quick lookup
        HashSet<Character> set = new HashSet<>();

        for (char c : jewels.toCharArray()) {
            set.add(c);                        //stores all jewels in a HashSet, its O(1) lookup time.
        }

        int count = 0;
        // Count the stones that are jewels
        for (char c : stones.toCharArray()) {
            if (set.contains(c)) {             //checks if the stone is a jewel in constant time
                count++;
            }
        }
        return count;

    }

    public static void main(String[] args) {
        NumJewelsInStones solution = new NumJewelsInStones();
        System.out.println(solution.numJewelsInStones("aA", "aAAbbbb")); // Output: 3
        System.out.println(solution.numJewelsInStones("z", "ZZ")); // Output: 0
    }
}
