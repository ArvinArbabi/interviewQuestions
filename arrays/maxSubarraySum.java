public class maxSubarraySum {

    public static int maxSubarraySumCircular(int[] nums) {  // Method signature; takes an int array and returns the max circular subarray sum.
        int total = 0;                                       // Will store the total sum of all elements.

        int maxEnd = nums[0], maxSum = nums[0]; // Kadane for max: current best ending at i, and global maximum so far.
        int minEnd = nums[0], minSum = nums[0]; // Kadane for min: current worst ending at i, and global minimum so far.

        for (int i = 0; i < nums.length; i++) { // go through the array from left to right
            int x = nums[i];

            if (i == 0) { // For the first element, we already initialized the trackers with nums[0].
                total = x; // Initialize total with the first element.
                continue;                                     
            }

            total += x; // Find total sum.

            // Regular Kadane's step for maximum subarray (non-wrapping case).
            maxEnd = Math.max(x, maxEnd + x); // Either start new subarray at x or extend previous one.
            maxSum = Math.max(maxSum, maxEnd); // Update global maximum if current ending is better.

            // Kadane's step for minimum subarray (used for wrapping case).
            minEnd = Math.min(x, minEnd + x); // Either start new min subarray at x or extend previous one.
            minSum = Math.min(minSum, minEnd); // Update global minimum if current ending is smaller.
        }

        if (maxSum < 0) return maxSum; //if all the numbers are negative, return the most non negative number in array

        // Wrapping candidate = total sum minus the minimum subarray (cut the worst middle).
        // Final answer is the best of non-wrap max (maxSum) and wrap sum (total - minSum).
        return Math.max(maxSum, total - minSum);
    }

    public static void main(String[] args) {                  
        int[] a = {5, -3, 5};
        System.out.println(maxSubarraySumCircular(a));
    }
}
