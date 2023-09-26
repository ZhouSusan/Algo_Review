import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Solution {
    /**
     * Given a string text, you want to use the characters of text to form as many instances of the word "balloon" as possible.
     * You can use each character in text at most once.
     * @param text - a string that consists of lower case English letters only
     * @return number - maximum number of the word "balloon" that be formed
     */
    public static int maxNumberOfBalloons(String text) {
        if (text.length() < 7) {
            return 0;
        }

        HashSet<Character> hs = new HashSet<>();
        String balloon = "balloon";

        for (int i = 0; i < balloon.length(); i++) {
            hs.add(balloon.charAt(i));
        }

        HashMap<Character, Integer> balloonMap = new HashMap<>();
        for (int j = 0; j < text.length(); j++) {
            char current = text.charAt(j);
            if (hs.contains(current) && !balloonMap.containsKey(current)) {
                balloonMap.put(current, 1);
            } else if (hs.contains(current) && balloonMap.containsKey(current)) {
                balloonMap.put(current, balloonMap.get(current)+1);
            }
        }

        if(balloonMap.size() < hs.size()) {
            return 0;
        }

        int max = balloonMap.get('b');
        for(Map.Entry<Character, Integer> entry: balloonMap.entrySet()) {
            if (entry.getKey() == 'b') {
                continue;
            } else if (entry.getKey() == 'a' || entry.getKey() == 'n') {
                max = Math.min(entry.getValue(), max);
            } else {
                max = (int)Math.min(Math.floor(entry.getValue() / 2), max);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        String text = "leetocde";
        System.out.println(maxNumberOfBalloons(text));
    }
}