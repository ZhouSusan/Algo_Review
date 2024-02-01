import java.util.*;

public class Solution {

    /**
     * Check if two strings are anagrams.
     * @param a - string consist of English alphabetic characters
     * @param b - string consist of English alphabetic characters
     * @return boolean - if a and b are case-insensitive anagrams
     */
    static boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) return false;

        a = a.toLowerCase();
        b = b.toLowerCase();

        HashMap<Character, Integer> characterCount = new HashMap<>();
        for (int i = 0; i < a.length(); i++) {
            char currentCharacter = a.charAt(i);
            if (characterCount.containsKey(currentCharacter)) {
                characterCount.put(currentCharacter, characterCount.get(currentCharacter)+1);
            } else {
                characterCount.put(currentCharacter, 1);
            }
        }

        for (int i = 0; i < b.length(); i++) {
            char currentCharacter = b.charAt(i);
            if (characterCount.containsKey(currentCharacter)) {
                if (characterCount.get(currentCharacter) > 0) {
                    characterCount.put(currentCharacter, characterCount.get(currentCharacter)-1);
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
