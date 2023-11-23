public class Solution {

    /**
     * Determines if a number is a valid perfect square.
     * @param num - an non-negative integer
     * @return boolean - is this num a perfect square
     */
    public static boolean isPerfectSquare(int num) {

        long low = 1;
        long high = num/2 + 1;

        while (low <= high) {
            long mid = low + (high - low)/2;

            if (mid * mid == num) {
                return true;
            } else if (mid * mid < num) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int num1 = 800000;
        System.out.println(isPerfectSquare(num1));

        int num2 = 100;
        System.out.println(isPerfectSquare(num2));
    }
}