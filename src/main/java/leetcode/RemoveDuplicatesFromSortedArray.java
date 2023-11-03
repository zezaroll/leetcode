package leetcode;

public class RemoveDuplicatesFromSortedArray {

    public static void main(String[] args) {
        int[] nums = new int[]{0, 1, 1, 1, 1, 2, 2, 3};
        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {
        int index = 2;
        boolean ok = false;

        //0, 1, 1, 1, 1, 2, 2, 3
        //      1,
        //index=3
        for (int i = 2; i <= nums.length; i++) {
            if (nums[i] != nums[index - 2]) {
                nums[index] = nums[i];
                index++;
            }
        }
        return 0;
    }
}
