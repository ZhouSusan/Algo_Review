import java.util.Arrays;

public class Solution {
    /**
     * Finding the majority element from a given array.
     * @param nums<Integer> - an array of numbers, ranging from [-1000000000, 1000000000]
     * @return integer - the majority element of nums
     */
    public static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
    public static void main(String[] args) {
        int[] arr = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(arr));
    }
}