import java.util.Stack;

public class Algorithms {

    public static boolean hasMatchingParentheses(String s) {
        if (s == null || s.isEmpty() || s.isBlank()) {
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            if ( curr == '(') {
                stack.push(curr);
            } else if (curr == ')') {
                if (!stack.isEmpty()) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static boolean hasMatchingParentheses2(String s) {
        if (s == null || s.isEmpty() || s.isBlank()) {
            return false;
        }
        int matchingSymbolTracker = 0;

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (currentChar == '(') {
                matchingSymbolTracker++;
            } else if (currentChar == ')') {
                if (matchingSymbolTracker > 0) {
                    matchingSymbolTracker--;
                } else {
                    return false;
                }
            }
        }
        return matchingSymbolTracker == 0;
    }

    public static void main(String[] args) {
        System.out.println(hasMatchingParentheses("((algorithm()))"));
        System.out.println(hasMatchingParentheses("()(algorithm())"));
        System.out.println(hasMatchingParentheses("((algorithm))"));
        System.out.println(hasMatchingParentheses("(algorithm)"));

        System.out.println();

        System.out.println(hasMatchingParentheses("(algorithm("));
        System.out.println(hasMatchingParentheses(")algorithm)"));
        System.out.println(hasMatchingParentheses(")algorithm("));
        System.out.println(hasMatchingParentheses("algorithm(("));
        System.out.println(hasMatchingParentheses("(algorithm"));
        System.out.println(hasMatchingParentheses("((algorithm)"));
    }
}
