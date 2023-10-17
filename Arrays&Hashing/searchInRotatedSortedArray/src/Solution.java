public class Solution {
    /**
     * Searching for a target value in a rotated sorted array.
     * @param nums<Integer> - an integer array, sorted in ascending order with distinct values
     * @param target - an integer
     * @return  integer - index of target if it is in nums, or -1
     */
    public static int search(int[] nums, int target) {
        int idx = -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                idx = i;
            }
        }
        return idx;
    }
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        int target = 1;
        System.out.println(search(nums, target));
    }
}