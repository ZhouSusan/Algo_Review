public class Solution {
    /**
     * Checks if input n is a power of two.
     * @param n - integer
     * @return boolean - if n is a power of two
     */
    public static boolean isPowerOfTwo(int n) {
        if (n == 1) return true;
        if (n <= 0) return false;
        return ( n & (n-1)) == 0;
    }

    public static void main(String[] args) {
        int n1 = 8;
        System.out.println(isPowerOfTwo(n1));

        int n2 = 15;
        System.out.println(isPowerOfTwo(n2));
    }

}