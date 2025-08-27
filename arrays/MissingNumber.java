// Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, 
// find the single number that is missing.

public class MissingNumber {
    public static int missingNumber(int[] nums) {
        for(int i = 0; i < nums.length-1;i++){
            if(nums[i+1] != nums[i]+1){
                return nums[i] + 1;
            }
        }
        return -1;
    }

    //used chat gpt to make test cases
    public static void main(String[] args) {
        int[] arr1 = {0, 1, 2, 4, 5}; // missing 3
        int[] arr2 = {1, 2, 3, 4, 5, 7}; // missing 6
        int[] arr3 = {0, 1, 2, 3, 4}; // missing 5 (edge case)

        System.out.println("Missing number in arr1: " + missingNumber(arr1));
        System.out.println("Missing number in arr2: " + missingNumber(arr2));
        System.out.println("Missing number in arr3: " + missingNumber(arr3));
    }
}
