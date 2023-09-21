public class Solution {
    /**
     * Given an integer array nums of length n, you want to create an array ans of length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).
     * @param nums - an array of positive numbers
     * @return Array - a concatenation of two nums arrays.
     */
    public static int[] getConcatenation(int[] nums) {
        int[] concatenatedArr = new int[nums.length * 2];

        for (int i = 0; i < nums.length; i++) {
            concatenatedArr[i] = nums[i];
            concatenatedArr[nums.length + i] = nums[i];
        }
        return concatenatedArr;
    }
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4, 5};
        int[] result = getConcatenation(nums1);

        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}