public class Solution {
    /**
     * Determines the sign of the product of an array.
     * @param nums<Integer> - an array of integers
     * @return integer - 1 if positive, -1 if negative, or 0
     */
    public static int arraySign(int[] nums) {
        int signProduct = 1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                return 0;
            }

            if (nums[i] < 0) {
                signProduct = -signProduct;
            }
        }

        return signProduct;
    }

    public static void main(String[] args) {
        int[] nums = {-1,1,-1,1,-1};
        System.out.println(Solution.arraySign(nums));
    }
}
