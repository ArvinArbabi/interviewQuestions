public class maxSubarraySum {

    // O(n) max subarray sum on a circle
    public static int maxSubarraySumCircular(int[] nums) {
        int total = 0;

        int maxEnd = nums[0], maxSum = nums[0];
        int minEnd = nums[0], minSum = nums[0];

        for (int i = 0; i < nums.length; i++) {
            int x = nums[i];
            if (i == 0) { total = x; continue; }
            total += x;

            maxEnd = Math.max(x, maxEnd + x);
            maxSum = Math.max(maxSum, maxEnd);

            minEnd = Math.min(x, minEnd + x);
            minSum = Math.min(minSum, minEnd);
        }

        if (maxSum < 0) return maxSum;      // all negative
        return Math.max(maxSum, total - minSum);
    }

    // Entry point so VS Code can Run/Debug
    public static void main(String[] args) {
        int[] a = {5, -3, 5};
        System.out.println(maxSubarraySumCircular(a)); // prints 10
    }
}
