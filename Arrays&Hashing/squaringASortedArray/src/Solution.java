import java.util.Arrays;

public class Solution {
    /**
     * @param nums<Integer> - a sorted array in non-decreasing order
     * @return int[] -  an array of the squares of each number sorted.
     */
    public static int[] sortedSquares(int[] nums) {
        if (nums.length == 1) {
            nums[0] = nums[0] * nums[0];
            return nums;
        }

        int[] sortedSquareArr = new int [nums.length];
        for (int i = 0; i < nums.length; i++) {
            sortedSquareArr[i] = nums[i] * nums[i];
        }

        Arrays.sort(sortedSquareArr);
        return sortedSquareArr;
    }
    public static void main(String[] args) {
        int[] nums1 = {-4,-1,0,3,10};
        int[] result = sortedSquares(nums1);

        for(int num: result) {
            System.out.println(num);
        }
    }
}