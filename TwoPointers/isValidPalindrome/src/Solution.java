public class Solution {
    /**
     * Determines if the given string is a palindrome.
     * @param s - a string that only consist of printable ASCII characters
     * @return boolean - whether if the string is a palindrome
     */
    public static boolean isPalindrome(String s) {
        if (s.length() == 1) return true;

        int low = 0;
        int high = s.length()-1;

        while (low <= high) {
            if (!Character.isLetterOrDigit(s.charAt(low))) {
                low++;
                continue;
            }

            if (!Character.isLetterOrDigit(s.charAt(high))) {
                high--;
                continue;
            }

            if (Character.toLowerCase(s.charAt(low)) != Character.toLowerCase(s.charAt(high))) {
                return false;
            }

            low++;
            high--;
        }

        return true;
    }
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }
}