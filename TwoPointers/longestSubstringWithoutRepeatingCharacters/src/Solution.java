import java.util.HashSet;
import java.util.Set;

public class Solution {
    /**
     * Finds the length of the longest substring without repeating characters.
     * @param s - string consists of English letters, digits, symbols and spaces
     * @return int - length of the longest substring
     */
    public static int lengthOfLongestSubstring(String s) {
        Set<Character> charSet = new HashSet<>();
        int i = 0;
        int j = 0;
        int maxCount = 0;

        while(j < s.length()) {
            if (!charSet.contains(s.charAt(j))) {
                charSet.add(s.charAt(j));
                j++;
                maxCount = Math.max(maxCount, charSet.size());
            } else {
                charSet.remove(s.charAt(i));
                i++;
            }
        }
        return maxCount;
    }
    public static void main(String[] args) {
        String s = "pwwkew";
        System.out.println(lengthOfLongestSubstring(s));
    }
}