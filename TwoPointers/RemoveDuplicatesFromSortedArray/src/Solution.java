public class Solution {
    /**
     * Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once.
     * The relative order of the elements should be kept the same.
     * @param nums<Integer> - a sorted array of integers
     * @return integer - the number of unique elements in nums array
     */
    public static int removeDuplicates(int[] nums) {
        if(nums.length==1) {
            return 1;
        }

        int j = 1;
        for (int i = 1; i < nums.length-1; i++) {
            if(nums[i] != nums[i-1]) {
                nums[j++] = nums[i];
            }
        }

        nums[j++] = nums[nums.length-1];
        return j;
    }
    public static void main(String[] args) {
        int[] nums = {1,1,2};
        System.out.println(removeDuplicates(nums));
    }
}