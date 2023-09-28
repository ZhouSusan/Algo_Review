public class Solution {
    /**
     * Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.
     * @param nums<Integer> - an array of positive, unique numbers
     * @return integer - the missing number
     */
    public static int missingNumber(int[] nums) {
        int missingNumber = 0;
        int sum = 0;

        for (int i = 0; i <= nums.length; i++) {
            sum += i;
            if (i != nums.length) {
                missingNumber += nums[i];
            }
        }

        return sum - missingNumber;
    }
    public static void main(String[] args) {
        int[] nums = {3,0,1};
        System.out.println(missingNumber(nums));
    }
}