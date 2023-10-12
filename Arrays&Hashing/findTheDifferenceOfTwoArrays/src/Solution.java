import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Solution {
    /**
     * Finds the differences of two arrays.
     * @param nums1<Integer> - array of integers
     * @param nums2<Integer> - array of integers
     * @return List<List<Integer>> - a list of two lists, removing duplicates that are present in nums1 and nums2
     */
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> missingNumbers = new ArrayList<>();
        HashSet<Integer> nums1Set = new HashSet<>();
        HashSet<Integer> nums2Set = new HashSet<>();
        HashSet<Integer> num1DiffSet = new HashSet<>();
        HashSet<Integer> num2DiffSet = new HashSet<>();

        for(int num : nums1) {
            nums1Set.add(num);
        }

        for(int num : nums2) {
            nums2Set.add(num);
        }

        for (int i : nums1) {
            if (!nums2Set.contains(i)) {
                num1DiffSet.add(i);
            }
        }

        for (int j : nums2) {
            if (!nums1Set.contains(j)) {
                num2DiffSet.add(j);
            }
        }

        missingNumbers.add(new ArrayList<>(num1DiffSet));
        missingNumbers.add(new ArrayList<>(num2DiffSet));
        return missingNumbers;
    }
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,3}, nums2 = {1,1,2,2};
        List<List<Integer>> result = findDifference(nums1, nums2);
        result.forEach(l -> l.forEach(System.out::println));
    }
}