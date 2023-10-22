public class Solution {
    /**
     * Finding the longest common prefix string amongst an array of strings.
     * @param strs<String> - an array of strings. strs[i] consists of only lowercase English letters
     * @return String - longest common prefix or an empty string
     */
    public static String longestCommonPrefix(String[] strs) {
        if(strs.length == 1) {
            return strs[0];
        }

        StringBuilder longestCommonPrefix = new StringBuilder();
        for(int i = 0; i < strs[0].length(); i++) {
            for(String j : strs) {
                if (i == j.length() || j.charAt(i) != strs[0].charAt(i)) {
                    return longestCommonPrefix.toString();
                }
            }
            longestCommonPrefix.append(strs[0].charAt(i));
        }
        return longestCommonPrefix.toString();
    }
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs));
    }
}