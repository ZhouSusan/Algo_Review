public class Solution {
    /**
     * A method that remove all occurrences of val in nums in-place
     * @param nums<Integer> - an integer array
     * @param val - the integer value ranging from [0, 101]
     * @return integer -  the number of elements in nums which are not equal to val
     */
    public static int removeElement(int[] nums, int val) {

        if (nums.length == 0) {
            return 0;
        }
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[j++] = nums[i];
            }
        }
        return j;
    }
    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;
        System.out.println(removeElement(nums, val));
    }
}