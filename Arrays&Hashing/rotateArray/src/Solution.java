public class Solution {
    /**
     * Rotate the array to the right by k steps
     * @param nums<Integer> - array of numbers
     * @param k - non-negative integer
     */
    public static void rotate(int[] nums, int k) {
        k %= nums.length; // If k is larger than the length of the array

        reverse(nums, 0, nums.length-1-k);
        reverse(nums, nums.length-k, nums.length-1);
        reverse(nums, 0 , nums.length-1);
    }

    /**
     * Reverses the array in place
     * @param nums<Integer>
     * @param start - integer
     * @param end - integer
     */
    public static void reverse(int[] nums, int start, int end)
    {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int[] nums = {1,-100,3,99};
        int k = 2;
        rotate(nums, k);

        for (int num: nums) {
            System.out.println(num);
        }
    }
}