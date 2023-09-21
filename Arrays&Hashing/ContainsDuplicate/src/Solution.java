import java.util.HashSet;

public class Solution {
    /**
     * Given an integer array nums, return true if any value appears at least twice in the array,
     *  and return false if every element is distinct.
     * @param nums - array of numbers
     * @return boolean - whether every element is distinct.
     */
    public static Boolean containsDuplicate(int[] nums) {
        if (nums.length == 1) {
            return false;
        }

        HashSet<Integer> numsSet = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            int currentNum = nums[i];
            if (!numsSet.contains(currentNum)) {
                numsSet.add(currentNum);
            } else {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,1};
        System.out.println(containsDuplicate(nums1));

        int[] nums2 = {1,2,3,4,5};
        System.out.println(containsDuplicate(nums2));

        int[] nums3 = {1,1,1,3,3,4,3,2,4,2};
        System.out.println(containsDuplicate(nums3));
    }
}