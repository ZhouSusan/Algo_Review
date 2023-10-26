public class Solution {

    /**
     * Checks if a given string can be a palindrome after deleting at most one character from it.
     * @param s - a string that only consists of lowercase characters
     * @return boolean - can the string be made into a palindrome
     */
    public static boolean validPalindrome(String s) {
        boolean result = true;
        if (s.length() != 1) {
            int low = 0;
            int high = s.length() - 1;
            while (low < high) {
                if (s.charAt(low) == s.charAt(high)) {
                    low++;
                    high--;
                } else {
                    result = isSubStringPalindrome(s, low + 1, high) || isSubStringPalindrome(s, low, high - 1);
                    break;
                }
            }
        }

        return result;
    }

    /**
     * Checks if a substring of a string is a palindrome.
     * @param s - a string that only consists of lowercase characters
     * @param low - an integer, left indices
     * @param high - an integer, right indices
     * @return boolean - whether the substring is a palindrome
     */
    public static boolean isSubStringPalindrome(String s, int low, int high) {
        String subStr = s.substring(low, high + 1);
        String reverseSubStr = new StringBuilder(subStr).reverse().toString();
        return subStr.equals(reverseSubStr);
    }

    public static void main(String[] args) {
        String s1 = "dvd";
        String s2 = "btg";
        String s3 = "abchpcba";
        System.out.println(validPalindrome(s1));
        System.out.println(validPalindrome(s2));
        System.out.println(validPalindrome(s3));
    }
}