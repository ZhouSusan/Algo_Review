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

    public static boolean isUgly2(int n) {
        if (n <= 0) return false;

        while (n%2 == 0) {
            n = n/2;
        }

        while (n%3 == 0) {
            n = n/3;
        }

        while (n%5 == 0) {
            n = n/5;
        }

        return n == 1;
    }

    public static void main(String[] args) {
        int n1 = 8;
        System.out.println(isUgly2(n1));

        int n2 = 100001;
        System.out.println(isUgly2(n2));
    }
    
}