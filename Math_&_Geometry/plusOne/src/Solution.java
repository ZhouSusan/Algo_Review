public class Solution {
    /**
     * Increments a given array by one.
     * @param digits - integer array
     * @return int[] - the resulting array of digits
     */
    public static int[] plusOne(int[] digits) {

        for (int i=digits.length-1; i>=0; i--) {
            if(digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            digits[i] = 0;
        }

        int[] digitsPlusOne = new int[digits.length+1];
        digitsPlusOne[0] = 1;
        return digitsPlusOne;
    }

    public static void main(String[] args) {
        int[] digits1 = {1,2,3};
        int[] results = plusOne(digits1);
        for (int num: results) {
            System.out.println(num);
        }
    }
}