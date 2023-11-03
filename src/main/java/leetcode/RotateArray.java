package leetcode;

public class RotateArray {

//    Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
//
//
//
//    Example 1:
//    Input: nums = [1,2,3,4,5,6,7], k = 3
//    Output: [5,6,7,1,2,3,4]
//    Explanation:
//    rotate 1 steps to the right: [7,1,2,3,4,5,6]
//    rotate 2 steps to the right: [6,7,1,2,3,4,5]
//    rotate 3 steps to the right: [5,6,7,1,2,3,4]
//
//
//    Example 2:
//    Input: nums = [-1,-100,3,99], k = 2
//    Output: [3,99,-1,-100]
//    Explanation:
//    rotate 1 steps to the right: [99,-1,-100,3]
//    rotate 2 steps to the right: [3,99,-1,-100]

    public static void main(String[] args) {
        int[] nums = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(rotateArray2(nums, 12));
    }

    public static int rotateArray(int[] nums, int k) {
        for (int i = 0; i < k; i++) {
            int last = nums[nums.length - 1];
            int f;
            int s = nums[0];
            for (int j = 0; j < nums.length - 1; j++) {
                f = nums[j + 1]; //1
                nums[j + 1] = s; //0
                s = f; //1
            }
            nums[0] = last;
        }
        return 0;
    }

    public static int rotateArray2(int[] nums, int k) {
        k %= nums.length;

        rotateArr(nums, 0, nums.length - 1);
        rotateArr(nums, 0, k - 1);

        return 0;
    }

    private static void rotateArr(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
