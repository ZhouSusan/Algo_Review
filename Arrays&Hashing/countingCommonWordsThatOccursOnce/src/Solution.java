import java.util.HashMap;

public class Solution {
    /**
     * Checks two given string arrays, and returns the number of strings that appear exactly once in each of the two arrays.
     * @param words1 - string array where each word consists only of lowercase English letters
     * @param words2 - string array where each word consists only of lowercase English letters
     * @return int - integer
     */
    public static int countWords(String[] words1, String[] words2) {
        int count = 0;
        HashMap<String, Integer> mapWords1 = new HashMap<>();
        HashMap<String, Integer> mapWords2 = new HashMap<>();

        for (int i = 0; i < words1.length; i++) {
            if (mapWords1.containsKey(words1[i])) {
                mapWords1.put(words1[i], mapWords1.get(words1[i]) + 1);
            } else {
                mapWords1.put(words1[i], 1);
            }
        }

        for (int j = 0; j < words2.length; j++) {
            if (!mapWords2.containsKey(words2[j])) {
                mapWords2.put(words2[j], 1);
            } else {
                mapWords2.put(words2[j], mapWords2.get(words2[j]) + 1);
            }
        }

        for (String word : mapWords1.keySet()) {
            if (mapWords1.get(word) == 1 && mapWords2.containsKey(word) && mapWords2.get(word) == 1) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String[] words1 = {"a","ab"}, words2 = {"a","a","a","ab"};
        System.out.println(countWords(words1, words2));
    }
}