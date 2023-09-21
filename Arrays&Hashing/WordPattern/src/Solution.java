import java.util.HashMap;

public class Solution {

    /**
     * Given a pattern and a string s, find if s follows the same pattern.
     * @param pattern - a string of only lower-case English letters
     * @param s - a string that contains only lowercase English letters and spaces ' ', no leading or trailing spaces, and words are separated by a single space
     * @return boolean - whether if s follows the same pattern
     */
    public static boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (words.length != pattern.length()) {
            return false;
        }

        HashMap<Character, String> patternMap = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            String currentWord = words[i];
            char letter = pattern.charAt(i);
            if (patternMap.containsKey(letter)) {
              if (!currentWord.equals(patternMap.get(letter))) {
                  return false;
              }
            } else {
                if (patternMap.containsValue(currentWord)) {
                    return false;
                } else {
                    patternMap.put(letter, currentWord);
                }
            }
        }

        return true;
    }
    public static void main(String[] args) {
        String pattern1 = "abba", s1 = "dog cat cat dog";
        System.out.println(wordPattern(pattern1, s1));

        String pattern2 = "abba", s2 = "dog cat cat fish";
        System.out.println(wordPattern(pattern2, s2));

        String pattern3 = "abba", s3 = "dog dog dog dog";
        System.out.println(wordPattern(pattern3, s3));
    }
}