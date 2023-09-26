import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Solution {
    /**
     * Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.
     * @param nums<Integer> - array of positive integers
     * @return List<Integer> - an array of integers in the range [1, n] that does not appear in nums
     */
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        List<Integer> missingNumbers = new ArrayList<>();

        for (int x = 0; x < nums.length; x++) {
            set.add(x+1);
        }

        for (int i = 0; i <nums.length; i++) {
            if (set.contains(nums[i])) {
                set.remove(nums[i]);
            }
        }

        for (int num : set) {
            missingNumbers.add(num);
        }

        return missingNumbers;
    }

    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(nums));
    }
}