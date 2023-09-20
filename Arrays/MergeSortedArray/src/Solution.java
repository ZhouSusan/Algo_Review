import java.util.Arrays;

public class Solution {
    /**
     * Given two integer arrays nums1 and nums2, and two integers m and n - merge nums1 and nums2 into a single array sorted in non-decreasing order.
     * @param nums1 - an integer array in non-decreasing order
     * @param m - an integer representing the number of elements in nums1 respectively
     * @param nums2 - an integer array in non-decreasing order
     * @param n - an integer representing the number of elements in nums2 respectively
     */
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int j = 0;
        for (int i = m; i < nums1.length; i++) {
            nums1[i] = nums2[j];
            j++;
        }
        Arrays.sort(nums1);
    }
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;
        merge(nums1, m, nums2, n);

        for (int num: nums1) {
            System.out.print(num + " ");
        }
    }
}