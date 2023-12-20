import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    /**
     * Finds the target indices after sorting the given array.
     * @param nums - integer array
     * @param target - integer
     * @return List<Integer> - a sorted list of the target indices
     */
    public static List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> sortedNums = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                sortedNums.add(i);
            }
        }

        return sortedNums;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,5,2,3};
        int target = 3;
        List<Integer> targetedIndicesList = targetIndices(nums, target);
        System.out.println(targetedIndicesList);
    }
}