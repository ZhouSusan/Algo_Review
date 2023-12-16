import java.util.ArrayList;
import java.util.HashSet;

public class Solution {

    /**
     * Checks two integer arrays, and returns a unique array of their intersection.
     * @param nums1 - positive integer array
     * @param nums2 - positive integer array
     * @return int[] - an array of their intersection.
     */
    public static int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> intersectionNumList = new ArrayList<>();
        HashSet<Integer> nums1Set = new HashSet<>();
        HashSet<Integer> nums2Set = new HashSet<>();

        for (int i = 0; i < nums1.length; i++) {
            if (!nums1Set.contains(nums1[i])) {
                nums1Set.add(nums1[i]);
            }
        }

        for (int j = 0; j < nums2.length; j++) {
            if (!nums2Set.contains(nums2[j])) {
                nums2Set.add(nums2[j]);
            }
        }

        for (int num : nums2Set) {
            if (nums1Set.contains(num)) {
                intersectionNumList.add(num);
            }
        }

        int [] intersectionNumArr = intersectionNumList.stream().mapToInt(i->i).toArray();;
        return intersectionNumArr;
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,1};
        int[] nums2 = {2,3};

        int[] intersectionResults = intersection(nums1, nums2);

        for(int num : intersectionResults) {
            System.out.println(num);
        }
    }

}