public class Solution {

    /**
     * Searching for a target value in a rotated sorted array.
     * @param nums<Integer> - an integer array, sorted in ascending order with distinct values
     * @param target - an integer
     * @return  integer - index of target if it is in nums, or -1
     */
    public static int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;

        while(low <= high) {
            int mid = low + (high-low)/2;

            if(nums[mid] == target) {
                return mid;
            }

            if (nums[low] <= nums[mid]) {
                if(nums[low] <= target && target < nums[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                if (nums[mid] < target && target <= nums[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        int target = 1;
        System.out.println(search(nums, target));
    }
}