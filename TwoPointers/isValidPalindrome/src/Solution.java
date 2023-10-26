public class Solution {
    /**
     * Determines if the given string is a palindrome.
     * @param s - a string that only consist of printable ASCII characters
     * @return boolean - whether if the string is a palindrome
     */
    public static boolean isPalindrome(String s) {
        if(s.length() == 1) return true;

        String regexS = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int low = 0;
        int high = regexS.length()-1;

        while(low <= high) {
            if(regexS.charAt(low) != regexS.charAt(high)) {
                return false;
            }

            low++;
            high--;
        }

        return true;
    }
    public static void main(String[] args) {
        String s = "race a car";
        System.out.println(isPalindrome(s));
    }
}