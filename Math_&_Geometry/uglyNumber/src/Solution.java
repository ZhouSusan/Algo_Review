public class Solution {

    /**
     * Checks if input n is an ugly number.
     * An ugly number is a positive integer whose prime factors are limited to 2, 3, and 5.
     * @param n - integer
     * @return boolean -  if n is an ugly number
     */
    public static boolean isUgly(int n) {
        if (n <= 0) return false;
        if (n == 1) return true;

        int[] primeFactors = {2,3,5};

        for (int i = 0; i < primeFactors.length; i++) {
            int currentNum = primeFactors[i];
            while(n % currentNum == 0) {
                n = n / currentNum;
            }
        }

        return n == 1;
    }

    public static void main(String[] args) {
        int n1 = 8;
        System.out.println(isUgly(n1));

        int n2 = 100001;
        System.out.println(isUgly(n2));
    }
    
}