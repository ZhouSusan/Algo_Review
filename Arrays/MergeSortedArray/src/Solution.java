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
        for (int i = m; i < m+n; i++) {
            nums1[i] = nums2[j];
            j++;
        }
        Arrays.sort(nums1);
    }

    public static void merge2(int[] nums1, int m, int[] nums2, int n) {
        // last index of nums1
        int lastIdx = m + n-1;

        // merge in reverse order
        while (m > 0 && n > 0) {
            if (nums1[m-1] > nums2[n-1]) {
                nums1[lastIdx] = nums1[m-1];
                m--;
            } else {
                nums1[lastIdx] = nums2[n-1];
                n--;
            }
            lastIdx--;
        }

        // if num2 two is not empty
        while (n > 0) {
            nums1[lastIdx] = nums2[n-1];
            lastIdx--;
            n--;
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {2,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {1,5,6};
        int n = 3;
        merge2(nums1, m, nums2, n);

        for (int num: nums1) {
            System.out.print(num + " ");
        }
    }
}