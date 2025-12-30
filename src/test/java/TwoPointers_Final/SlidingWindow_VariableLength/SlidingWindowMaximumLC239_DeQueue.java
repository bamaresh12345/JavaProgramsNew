package TwoPointers_Final.SlidingWindow_VariableLength;

public class SlidingWindowMaximumLC239_DeQueue {

   /* public static int[] maxSlidingWindow(int[] nums, int k) {

        // Deque stores indices of elements (not values)
        // It maintains elements in decreasing order
        Deque<Integer> dq = new ArrayDeque<>();

        int[] result = new int[nums.length - k + 1];
        int idx = 0;

        for (int i = 0; i < nums.length; i++) {

            // 1️⃣ Remove indices that are OUTSIDE the window
            // Window start index = i - k + 1
            while (!dq.isEmpty() && dq.peek() < i - k + 1) {
                dq.poll();
            }

            // 2️⃣ Remove elements smaller than current element
            // They can never be the maximum again
            while (!dq.isEmpty() && nums[dq.peekLast()] < nums[i]) {
                dq.pollLast();
            }

            // 3️⃣ Add current index to deque
            dq.offer(i);

            // 4️⃣ Window becomes valid when i >= k - 1
            if (i >= k - 1) {
                result[idx++] = nums[dq.peek()];
            }
        }

        return result;
    }*/

    public static void main(String[] args) {
        int[] nums = {1,3,-1,-3,5,3,6,7};
        int k = 3;


    }
}
