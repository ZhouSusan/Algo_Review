import java.util.Arrays;

public class Solution {
    /**
     * Gets the scores of any k students from the array so that the difference between the highest and the lowest of the k scores is minimized.
     * @param nums<Integer> - an array of integers, nums[i] represents the score of the ith student
     * @param k - integer
     * @return integer - minimum possible difference
     */
    public static int minimumDifference(int[] nums, int k) {
        if (nums.length == 1) return 0;

        Arrays.sort(nums);
        int minDiff = Integer.MAX_VALUE;
        int i = 0;
        int j = k - 1;

        while (j < nums.length) {
            minDiff = Math.min(minDiff, nums[j] - nums[i]);

            i++;
            j++;
        }

        return minDiff;
    }

    public static void main(String[] args) {
        int[] nums = {9,4,1,7};
        int k = 2;
        System.out.println(minimumDifference(nums, k));
    }
}