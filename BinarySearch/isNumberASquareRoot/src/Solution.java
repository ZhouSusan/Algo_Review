public class Solution {
    /**
     * Computes and returns the square root of x rounded down to the nearest integer
     * @param x - non-negative integer
     * @return int - non-negative integer
     */
    public static int mySqrt(int x) {
        if(x == 0) {
            return 0;
        }

        int low = 1;
        int high = x/2+1;

        while (low <= high) {
            int mid = low + (high - low)/2;
            if(mid == (x/mid)) {
                return mid;
            } else if (mid < (x/mid)) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return high;
    }
    public static void main(String[] args) {
        int x1 = 25;
        System.out.println(mySqrt(x1));
    }
}