import java.util.HashMap;

public class Solution {
    static HashMap<Character, Integer> orderMap = new HashMap<>();

    /**
     * Determine if the sequence of words are sorted lexicographically, based on the order of their alphabet.
     * @param words<String> - a sequence of lowercase words written in the alien language
     * @param order - a string of lowercase letters in the alien's alphabet
     * @return boolean - whether the words are sorted lexicographically in this alien language
     */
    public static boolean isAlienSorted(String[] words, String order) {
        int index = 0;
        for (int c = 0; c < order.length(); c++) {
            orderMap.put(order.charAt(c), index++);
        }

        for (int i = 0; i < words.length-1; i++) {
            String word1 = words[i];
            String word2 = words[i + 1];

            for (int j = 0; j < word1.length(); j++) {
                if (j == word2.length()) {
                    return false;
                } else if (word1.charAt(j) != word2.charAt(j)) {
                    if (orderMap.get(word2.charAt(j)) < orderMap.get(word1.charAt(j))) {
                        return false;
                    } else {
                        break;
                    }
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String[] words = {"hello","leetcode"};
        String order = "hlabcdefgijkmnopqrstuvwxyz";
        System.out.println(isAlienSorted(words, order));
    }
}