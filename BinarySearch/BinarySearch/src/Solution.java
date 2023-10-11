public class Solution {
    /**
     * Function that searches for target in nums.
     * @param nums<Integer> - array of unique integers sorted in ascending order
     * @param target - an integer
     * @return index/-1 - If target exists, return index or -1.
     */
    public static int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;

        while (low <= high) {
            int mid = low + (high-low)/2;

            if(nums[mid] == target) {
                return mid;
            } else if (target < nums[mid]) {
                high = mid -1;
            } else {
                low = mid + 1;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {-1,0,3,5,9,12};
        System.out.println(search(nums, 4));
        System.out.println(search(nums, 5));
    }
}