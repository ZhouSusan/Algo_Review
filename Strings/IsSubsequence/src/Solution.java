public class Solution {
    /**
     * @param s - string consist only of lowercase English letters
     * @param t - string consist only of lowercase English letters
     * @return boolean - return true if s is a subsequence of t, or false otherwise.
     */
    public static boolean isSubsequence(String s, String t) {
        int sPointer = 0;
        int tPointer = 0;

        while (sPointer < s.length() && tPointer < t.length()) {
            if (s.charAt(sPointer) == t.charAt(tPointer)) {
                sPointer++;
            }
            tPointer++;
        }

        return sPointer == s.length();
    }

    public static void main(String[] args) {
        String s = "axc", t = "ahbgdc";
        System.out.println(isSubsequence(s, t));
    }
}