public class Solution {
    /**
     * Function that move all 0's to the end of the array in-place while maintaining the relative order of the non-zero elements.
     * @param nums<Integer> - an array of integers
     */
    public static void moveZeroes(int[] nums) {
        if(nums.length == 1) {
            return;
        }

        int i = 0;
        int j = 0;

        while(j < nums.length) {
            if (nums[j] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }
            j++;
        }
    }
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        moveZeroes(nums);

        for(int num : nums) {
            System.out.println(num);
        }
    }
}