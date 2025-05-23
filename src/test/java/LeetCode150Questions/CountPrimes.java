package LeetCode150Questions;

/*
204. Count Primes Medium

Given an integer n, return the number of prime numbers that are strictly less than n.

Example 1: Input: n = 10  Output: 4
Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.

Example 2:  Input: n = 0  Output: 0
Example 3: Input: n = 1 Output: 0

 */
public class CountPrimes {

    public static int countPrimes(int n) {

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (isPrime(i)) {
                count++;
            }
        }
        return count;
    }

    public static boolean isPrime(int n) {
        if (n <= 2)
            return false;

        for (int i = 3; i < n; i++) {
            if (n % i == 0)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {


        int n = 10;
        System.out.println(countPrimes(10));
    }
}
