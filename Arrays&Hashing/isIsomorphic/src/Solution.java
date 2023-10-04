import java.util.HashMap;

public class Solution {
    /**
     * Determine if two strings are isomorphic.
     * @param s - a string that consist of any valid ascii character
     * @param t - a string that consist of any valid ascii character
     * @return boolean - if s and t are isomorphic strings
     */
    public static boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }

        if(s.equals(t)) {
            return true;
        }

        HashMap<Character, Character> letterMap = new HashMap<>();

        for(int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            if(letterMap.containsKey(sChar)) {
                if (letterMap.get(sChar) != tChar) {
                    return false;
                }
            } else {
                if(letterMap.containsValue(tChar)) {
                    return false;
                }

                letterMap.put(sChar, tChar);
            }
        }

        return true;
    }
    public static void main(String[] args) {
        String s = "paper", t = "title";
        System.out.println(isIsomorphic(s, t));
    }
}