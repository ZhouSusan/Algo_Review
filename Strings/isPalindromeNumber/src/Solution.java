public class Solution {
    /**
     * Checks whether input x is a palindrome number.
     * @param x - integer
     * @return boolean - is number a palindrome
     */
    public static boolean isPalindrome(int x) {
        if (x < 0) return false;
        String stringX = Integer.toString(x);
        int left = 0;
        int right = stringX.length()-1;

        while (left <= right) {
            if (stringX.charAt(left) == stringX.charAt(right)) {
                left++;
                right--;
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int x = 90109;
        System.out.println(isPalindrome(x));
    }
}