public class Solution {
    /**
     * Finding the pivot index of an array.
     * The pivot index is the index where the sum of all the numbers strictly to the left of the index is equal to the sum of all the numbers strictly to the index's right.
     * @param nums<Integer> - an array of integers
     * @return integer - the leftmost pivot index or -1
     */
    public static int pivotIndex(int[] nums) {
        if(nums.length == 1) return 0;

        int sum = 0;
        int leftSum= 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }

        for (int j = 0; j < nums.length; j++) {
            int rightSum = sum-leftSum-nums[j];
            if (leftSum == rightSum) return j;

            leftSum += nums[j];
        }

        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {1,7,3,6,5,6};
        System.out.println(pivotIndex(nums));
    }
}