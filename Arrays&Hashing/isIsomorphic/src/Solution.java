import java.util.HashMap;

public class Solution {
    /**
     * Determine if two strings are isomorphic.
     * @param s - a string that consist of any valid ascii character
     * @param t - a string that consist of any valid ascii character
     * @return boolean - if s and t are isomorphic strings
     */
    public static boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> sMap = new HashMap<>();
        HashMap<Character, Character> tMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            Character sCurrentChar = s.charAt(i);
            Character tCurrentChar = t.charAt(i);

            if (sMap.containsKey(sCurrentChar) && sMap.get(sCurrentChar) != tCurrentChar ||
                    tMap.containsKey(tCurrentChar) && tMap.get(tCurrentChar) != sCurrentChar) {
                return false;
            }

            sMap.put(sCurrentChar, tCurrentChar);
            tMap.put(tCurrentChar, sCurrentChar);
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "paper", t = "title";
        System.out.println(isIsomorphic(s, t));
    }
}