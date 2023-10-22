public class Solution {

    /**
     * Finding find the leftmost middleIndex.
     * A middleIndex is an index where nums[0] + nums[1] + ... + nums[middleIndex-1] == nums[middleIndex+1] + nums[middleIndex+2] + ... + nums[nums.length-1].
     * @param nums<Integer> - an array of integers
     * @return integer - the middleIndex or -1
     */
    public static int findMiddleIndex(int[] nums) {
        if(nums.length == 1) return 0;

        int leftSum = 0;
        int total = 0;

        for(int num : nums) {
            total += num;
        }

        for (int i = 0; i < nums.length; i++) {
            int rightSum = total - leftSum - nums[i];
            if(leftSum == rightSum) {
                return i;
            }

            leftSum += nums[i];
        }

        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {2,3,-1,8,4};
        System.out.println(findMiddleIndex(nums));
    }
}