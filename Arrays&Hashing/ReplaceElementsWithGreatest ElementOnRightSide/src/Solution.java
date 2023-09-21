public class Solution {
    /**
     * Given an array arr, replace every element in that array with the greatest element among the elements to its right, and replace the last element with -1.
     * @param arr - an array of positive integers
     * @return arr - return the array with the greatest element to the right
     */
    public static int[] replaceElements(int[] arr) {

        int rightMax = -1;
        for (int i = arr.length-1; i >= 0; i--) {
            int newRightMax = Math.max(arr[i], rightMax);
            arr[i] = rightMax;
            rightMax = newRightMax;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {1000, 2000, 3};
        replaceElements(arr);
        for(int num : arr) {
            System.out.print(num + " ");
        }
    }
}