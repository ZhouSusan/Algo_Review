import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution {
    /**
     * Finds and returns all the uncommon words between two given sentences.
     * @param s1 - string consist of lowercase English letters and spaces
     * @param s2 - string consist of lowercase English letters and spaces
     * @return String[] - an array list of all the uncommon words
     */
    public static String[] uncommonFromSentences(String s1, String s2) {
        String[] s1Arr = s1.split(" ");
        String[] s2Arr = s2.split(" ");
        HashMap<String, Integer> mapS1 = new HashMap<>();
        HashMap<String, Integer> mapS2 = new HashMap<>();
        List<String> uncommonWordList = new ArrayList<>();



        for (int i = 0; i < s1Arr.length; i++) {
            if (mapS1.containsKey(s1Arr[i])) {
                mapS1.put(s1Arr[i], mapS1.get(s1Arr[i]) + 1);
            } else {
                mapS1.put(s1Arr[i], 1);
            }
        }

        for (int i = 0; i < s2Arr.length; i++) {
            if (mapS2.containsKey(s2Arr[i])) {
                mapS2.put(s2Arr[i], mapS2.get(s2Arr[i]) + 1);
            } else {
                mapS2.put(s2Arr[i], 1);
            }
        }

        for (String key : mapS1.keySet()) {
            if (mapS1.get(key) == 1 && !mapS2.containsKey(key)) uncommonWordList.add(key);
        }

        for (String key : mapS2.keySet()) {
            if (mapS2.get(key) == 1 && !mapS1.containsKey(key)) uncommonWordList.add(key);
        }

        String[] uncommonWord = new String[uncommonWordList.size()];
        uncommonWordList.toArray(uncommonWord);

        return uncommonWord;
    }

    public static void main(String[] args) {
        String s1 = "apple", s2 = "banana";
        String[] result = uncommonFromSentences(s1, s2);
        for (String word : result) {
            System.out.println(word);
        }
    }
}