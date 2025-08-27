public class MissingNumber {
    public static int missingNumber(int[] nums) {
        int n = nums.length, x = n;
        for (int i = 0; i < n; i++) {
            x ^= i ^ nums[i];
        }
        return x;
    }
}
