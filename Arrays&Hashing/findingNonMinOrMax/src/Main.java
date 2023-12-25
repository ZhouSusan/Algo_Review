public class Main {
    /**
     * Finds any number from the array that is neither the minimum nor the maximum value in the array. If there is no such number, return -1.
     * @param nums - integer array containing distinct positive integers
     * @return int - integer
     */
    public static int findNonMinOrMax(int[] nums) {
        if (nums.length < 3) return -1;

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < 3; i++) {
            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);
        }

        for (int num : nums) {
            if (num != max && num != min) {
                return num;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] nums1 = {3,2,1,4};
        System.out.println(findNonMinOrMax(nums1));
    }
}