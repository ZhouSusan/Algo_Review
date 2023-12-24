public class Solution {
    /**
     * Determines the third maximum number in a given array. If the third maximum does not exist, then the maximum number is returned.
     * @param nums - integer array
     * @return int - third distinct maximum number or maximum number
     */
    public static int thirdMax(int[] nums) {
        long maxNum1 = Long.MIN_VALUE;
        long maxNum2 = Long.MIN_VALUE;
        long maxNum3 = Long.MIN_VALUE;

        for (int num : nums) {
            maxNum1 = Math.max(maxNum1, num);
        }

        for (int num : nums) {
            if (num != maxNum1) maxNum2 = Math.max(maxNum2, num);
        }

        for (int num: nums) {
            if (num!= maxNum1 && num != maxNum2) maxNum3 = Math.max(maxNum3, num);
        }

        return maxNum3 != Long.MIN_VALUE ? (int)maxNum3 : (int)maxNum1;
    }

    public static void main(String[] args) {
        int[] nums = {2,2,3,1};
        System.out.println(thirdMax(nums));
    }
}