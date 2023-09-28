public class Solution {
    /**
     * Shuffling the Array
     * @param nums<Integer> - an array of positive numbers, ranging from 1 to 500
     * @param n - a number that represents the second half of the nums array
     * @return nums<Integer> - an array in the form [x1,y1,x2,y2,...,xn,yn]
     */
    public static int[] shuffle(int[] nums, int n) {
        int[] shuffledNums = new int[nums.length];
        int i = 0;
        int j = n;
        int counter = 0;

        while(counter < nums.length) {
            if (counter % 2 == 0) {
                shuffledNums[counter] = nums[i];
                i++;
            } else {
                shuffledNums[counter] = nums[j];
                j++;
            }
            counter++;
        }

        return shuffledNums;
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,4,4,3,2,1};
        int n1 = 4;
        int[] shuffledNums1 = shuffle(nums1, n1);
        for (int num: shuffledNums1) {
            System.out.println(num);
        }
    }
}