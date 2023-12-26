public class Solution {
    /** Determines how many integers are even number of digits in a given array.
     * @param nums - integer array
     * @return int - integer
     */
    public static int findNumbers(int[] nums) {
        int evenNumberCount = 0;

        for (int num : nums) {
            if (Integer.toString(num).length() % 2 == 0) evenNumberCount++;
        }

        return evenNumberCount;
    }
    public static void main(String[] args) {
        int[] nums = {100197,555,901,4821,1771};
        System.out.println(findNumbers(nums));
    }
}