import java.util.HashMap;
import java.util.Stack;

public class Solution {

    /**
     * Determines whether the string's braces, brackets, and parenthesis are valid
     * based on the order and amount of opening and closing pairs.
     * @param str - a string of characters
     * @return boolean - whether the string's braces, brackets, and parenthesis are valid
     */
    public static boolean isBracesValid(String str) {
        if (str == null || str.length() == 1) {
            return false;
        }

        if (str.isEmpty()) {
            return true;
        }

        Stack<Character> parenthesesStack = new Stack<>();
        HashMap<Character, Character> parenthesesCloseMap = new HashMap<>() {};
        parenthesesCloseMap.put(')' , '(');
        parenthesesCloseMap.put('}', '{');
        parenthesesCloseMap.put(']', '[');


        for (int i = 0; i < str.length(); i++) {
            switch (str.charAt(i)) {
                case '(':
                case '{':
                case '[':
                    parenthesesStack.add(str.charAt(i));
                    break;
                case ')':
                case '}':
                case ']':
                    if (parenthesesCloseMap.get(str.charAt(i)).equals(parenthesesStack.lastElement())) {
                        parenthesesStack.pop();
                    } else {
                        return false;
                    }
                    break;
                default:
                    break;
            }
        }
        return parenthesesStack.empty();
    }

    public static void main(String[] args) {
        String str1 = "W(a{t}s[o(n{ c}o)m]e )h[e{r}e]!";
        System.out.println(isBracesValid(str1));
        String str2 = "D(i{a}l[ t]o)n{e";
        System.out.println(isBracesValid(str2));
        String str3 = "A(1)s[O (n]0{t) 0}k";
        System.out.println(isBracesValid(str3));
    }
}