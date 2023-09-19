import java.util.HashMap;
import java.util.Stack;

public class Solution {
    /**
     * Given a string s, remove duplicate letters so that every letter appears once and only once.
     * You must make sure your result is the smallest in lexicographical order among all possible results.
     * @param s - a string of lowercase letters
     * @return string - after the removal of the duplicate letters in the smallest, lexicographical order
     */
    public static String removeDuplicateLetters(String s) {
        Stack<Character> stack = new Stack<>();
        HashMap<Character, Integer> characterFreqMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);

            if (!characterFreqMap.containsKey(currentChar)) {
                characterFreqMap.put(currentChar, 1);
            } else {
                characterFreqMap.replace(currentChar, characterFreqMap.get(currentChar) + 1);
            }
        }

        for (int j = 0; j < s.length(); j++) {
            char currentChar = s.charAt(j);
            while (stack.size() > 0 && stack.peek() > currentChar && characterFreqMap.get(stack.peek()) > 0 && !stack. contains(currentChar)) {
                stack.pop();
            }

            if (!stack.contains(currentChar)) {
                stack.push(currentChar);
            }

            characterFreqMap.put(currentChar, characterFreqMap.get(currentChar)-1);
        }

        StringBuilder stringSet = new StringBuilder(stack.size());
        while(!stack.empty()) {
            stringSet.append(stack.pop());
        }

        return stringSet.reverse().toString();
    }
    public static void main(String[] args) {
        String s = "bcabc";
        System.out.println(removeDuplicateLetters(s));
    }
}