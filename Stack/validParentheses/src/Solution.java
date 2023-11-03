import java.util.HashMap;
import java.util.Stack;

public class Solution {
    /**
     * Determines if the input string is valid.
     * An input string is considered valid if:
     *     1. Open brackets must be closed by the same type of brackets.
     *     2. Open brackets must be closed in the correct order.
     *     3. Every close bracket has a corresponding open bracket of the same type.
     * @param s - a string containing ONLY characters '(', ')', '{', '}', '[', and ']'
     * @return boolean - is this input string considered to be valid
     */
    public static boolean isValid(String s) {
        if (s.length() % 2 == 1) {
            return false;
        }
        Stack<Character> openParenStack = new Stack<>();
        HashMap<Character, Character> closeParentheseMap = new HashMap<>();
        closeParentheseMap.put('}', '{');
        closeParentheseMap.put(')', '(');
        closeParentheseMap.put(']', '[');
        for (int i = 0; i < s.length(); i++) {
            Character current = s.charAt(i);
            switch (current) {
                case '}':
                case ')':
                case ']':
                    if (!openParenStack.isEmpty() && openParenStack.peek().equals(closeParentheseMap.get(current))) {
                        openParenStack.pop();
                    } else {
                        return false;
                    };
                    break;
                case '{':
                case '(':
                case '[':
                    openParenStack.push(current);
                    break;
            }
        }
        return openParenStack.isEmpty();
    }
    public static void main(String[] args) {
        String s1 = "(()]";
        System.out.println(isValid(s1));

        String s2 = "{[(([{}]))]}";
        System.out.println(isValid(s2));
    }
}