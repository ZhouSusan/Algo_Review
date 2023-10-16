public class Solution {
    /**
     * Finding the starting and ending position of a given value target.
     * If target is not found in the array, return [-1, -1].
     * @param nums<Integer> - a sorted array in non-decreasing order
     * @param target - an integer
     * @return int[] - an integer array
     */
    public static int[] searchRange(int[] nums, int target) {
        if (nums.length == 0) {
            return new int[] {-1, -1};
        }

        int startIdx = -1;
        int lastIdx = -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                if (startIdx == -1) {
                    startIdx = i;
                }

                lastIdx = i;
            }
        }

        return  new int[] {startIdx,lastIdx};
    }
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 7;
        int[] results = searchRange(nums, target);
        for(int res : results) {
            System.out.print(res + " ");
        }
    }
}