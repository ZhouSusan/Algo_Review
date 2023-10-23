public class Solution {
    /**
     * Merging two strings alternately.
     * @param word1 - a string consist of lowercase English letters
     * @param word2 - a string consist of lowercase English letters
     * @return string - the merged result string
     */
    public static String mergeAlternately(String word1, String word2) {
        StringBuilder mergedStr = new StringBuilder(word1.length() + word2.length());
        int i = 0;

        while (i < word1.length() || i < word2.length()) {
            if(i < word1.length()) mergedStr.append(word1.charAt(i));
            if(i < word2.length()) mergedStr.append(word2.charAt(i));

            i++;
        }

        return mergedStr.toString();
    }
    public static void main(String[] args) {
        String word1 = "abc", word2 = "pqr";
        System.out.println(mergeAlternately(word1, word2));
    }
}