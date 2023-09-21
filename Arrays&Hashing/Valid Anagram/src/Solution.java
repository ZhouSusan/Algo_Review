import java.util.HashMap;

public class Solution {
    /**
     * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
     * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
     * @param s - string of lowercase letters
     * @param t - string of lowercase letters
     * @return boolean - whether if t is an anagram of s
     */
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> aMap = new HashMap<Character, Integer>();
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (aMap.containsKey(currentChar)) {
                aMap.put(currentChar, aMap.get(currentChar)+1);
            } else {
                aMap.put(currentChar, 1);
            }
        }

        for (int j = 0; j < t.length(); j++) {
            char currentChar = t.charAt(j);
            if (aMap.containsKey(currentChar) && aMap.get(currentChar) > 0) {
                aMap.replace(currentChar, aMap.get(currentChar)-1);
            } else {
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        String s1 = "anagram";
        String t1 = "nagaram";
        System.out.println(isAnagram(s1, t1));

        String s2 = "ccaa";
        String t2 = "ccca";
        System.out.println(isAnagram(s2, t2));

        String s3 = "rat";
        String t3 = "car";
        System.out.println(isAnagram(s3, t3));
    }
}