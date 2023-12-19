import java.util.ArrayList;
import java.util.List;

public class Solution {
    /**
     * Searches an array of strings, and returns an arrayList of indices based on which word contains the character x.
     * @param words - an array of lowercase strings
     * @param x - character
     * @return List<Integer> - array of indices representing the words that contain the character x
     */
    public static List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> wordsContainingX = new ArrayList<>();

        for(int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                if (words[i].charAt(j) == x) {
                    wordsContainingX.add(i);
                    break;
                }
            }
        }
        return wordsContainingX;
    }
    public static void main(String[] args) {
        String[] words = {"abc","bcd","aaaa","cbc"};
        char x = 'a';
        System.out.println(findWordsContaining(words, x));
    }
}