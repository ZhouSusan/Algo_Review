public class Solution {
    /**
     * Finding the starting and ending position of a given value target.
     * If target is not found in the array, return [-1, -1].
     * @param nums<Integer> - a sorted array in non-decreasing order
     * @param target - an integer
     * @return int[] - an integer array
     */
    public static int[] searchRange(int[] nums, int target) {
        if (nums.length == 0) {
            return new int[] {-1, -1};
        }

        return  new int[] {binarySearch(nums, target, true), binarySearch(nums, target, false)};
    }

    /**
     * Function that searches for target in nums.
     * @param nums -  a sorted array in non-decreasing order
     * @param target - an integer
     * @param checkingLeft - boolean, whether we are checking the left
     * @return int - index if target exist or -1
     */
    public static int binarySearch(int[] nums, int target, boolean checkingLeft) {
        int low = 0;
        int high = nums.length-1;
        int mid;
        int idx = -1;

        while(low <= high) {
            mid = low + (high-low)/2;
            if(target < nums[mid]) {
                high = mid -1;
            } else if (target > nums[mid]) {
                low = mid + 1;
            } else {
                idx = mid;
                if (checkingLeft) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
        }
        return idx;
    }

    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 7;
        int[] results = searchRange(nums, target);
        for(int res : results) {
            System.out.print(res + " ");
        }
    }
}