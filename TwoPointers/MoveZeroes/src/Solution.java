public class Solution {
    /**
     * Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
     * This must be done in-place.
     * @param nums<Integer> - an array of integers
     */
    public static void moveZeroes(int[] nums) {
        if (nums.length == 1) {
            return;
        }

        for (int i =0, j = 1; j < nums.length; j++) {
            if (nums[i] != 0) {
                i++;
            }

            if (nums[i] == 0 && nums[j] != 0) {
                nums[i] = nums[j];
                nums[j] = 0;
                i++;
            }
        }
    }
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        moveZeroes(nums);;

        for(int num : nums) {
            System.out.println(num);
        }
    }
}