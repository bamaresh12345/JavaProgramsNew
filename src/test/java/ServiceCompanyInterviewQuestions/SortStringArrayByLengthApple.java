package ServiceCompanyInterviewQuestions;

import java.util.Arrays;

public class SortStringArrayByLengthApple {

     public static String[] sortByLength(String[] arr) {
            int n = arr.length;

            // Perform Bubble Sort using temporary variable
            for (int i = 0; i < n ; i++) {
                for (int j = i+1; j < n; j++) {
                    // Compare string lengths
                    if (arr[i].length() > arr[j].length()) {
                        // Swap using a temporary variable
                        String temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }

            return arr;
        }

        public static void main(String[] args) {
            String[] input = {"banana", "apple", "kiwi", "orange", "grape"};

            System.out.println(Arrays.toString(sortByLength(input)));
        }
    }


