import java.util.HashSet;

public class Solution {
    /**
     * Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise.
     *  A pangram is a sentence where every letter of the English alphabet appears at least once.
     * @param sentence - a string of lowercase letters
     * @return boolean - whether if sentence is a pangram
     */
    public static boolean checkIfPangram(String sentence) {

        HashSet<Character> alphabet = new HashSet<Character>();
        for (char c = 'a'; c <= 'z'; c++) {
            alphabet.add(c);
        }

        for (int i = 0; i < sentence.length(); i++) {
            if (alphabet.contains(sentence.charAt(i))) {
                alphabet.remove(sentence.charAt(i));
            }
        }
        return alphabet.isEmpty();
    }
    public static void main(String[] args) {
        String sentenceOne = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(checkIfPangram(sentenceOne));

        String sentenceTwo = "leetcode";
        System.out.println(checkIfPangram(sentenceTwo));
    }
}