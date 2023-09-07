import java.util.HashMap;

public class Solution {
    /**
     * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
     * You may assume that each input would have exactly one solution, and you may not use the same element twice.
     * @param nums - array of integers
     * @param target - an integer
     * @return Array<numbers> -  indices of the two numbers that they add up to target
     */
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        HashMap<Integer, Integer> numsMap = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            int difference = target - nums[i];
            if (numsMap.containsKey(difference)) {
                result[0] = numsMap.get(difference);
                result[1] = i;
            } else {
                numsMap.put(nums[i], i);
            }
        }

        return result;
    }
    public static void main(String[] args) {
        int[] nums = {3,3};
        int target = 6;
        int[] result = twoSum(nums, target);
        for (int x:
             result) {
            System.out.println(x);
        }
    }
}