import java.util.Arrays;

public class PivotIndex {

    public static int findPivotIndex(int[] nums) {
        if (nums == null || nums.length == 0) {
            return -1;
        }

        long totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }

        long leftSum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (leftSum == totalSum - leftSum - nums[i]) {
                return i;
            }
            leftSum += nums[i];
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 7, 3, 6, 5, 6};
        System.out.println(findPivotIndex(arr1));

        int[] arr2 = {1, 2, 3};
        System.out.println(findPivotIndex(arr2));

        int[] arr3 = {2, 1, -1};
        
        System.out.println(findPivotIndex(arr3));
    }
}