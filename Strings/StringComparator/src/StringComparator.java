import java.util.Stack;

public class StringComparator {

    /**
     * Determines whether the strings are equal, ignoring case.
     * @param a - String A
     * @param b - String B
     * @return boolean - If the strings are equal or not
     */
    public static boolean caseInsensitiveStringCompare(String a, String b) {
        if (a == null || b == null || (a.length() != b.length())) {
            return false;
        }

        for (int i = 0; i < a.length(); i++) {
            if (a.toLowerCase().charAt(i) != b.toLowerCase().charAt(i)) {
                return false;
            }
        }

        return true;
    }

    /**
     * Determines if the given strings are equal after the backspace characters '#' are processed.
     * @param s - string
     * @param t - string
     * @return boolean - are the two strings equal after backspace characters '#" are processed
     */
    public static Boolean backspaceStringCompare(String s, String t) {
        if (s == null && t == null) {
            return true;
        }

        Stack<Character> charStackS = new Stack<Character>();
        Stack<Character> charStackT = new Stack<Character>();

        if (s == null || t == null || (charStackS.size() != charStackT.size())) {
            return false;
        }

        if (s.isEmpty() && t.isEmpty()) {
            return true;
        }

        int i = 0; // index counter for s
        while (i < s.length()) {
            char currentChar = s.charAt(i);
            if (Character.isLetter(currentChar)) {
                charStackS.add(currentChar);
            } else if (currentChar == '#') {
                if (charStackS.size() > 0) {
                    charStackS.pop();
                }
            }
            i++;
        }

        int j = 0; // index counter for t
        while (j < t.length()) {
            char currentChar = t.charAt(j);
            if (Character.isLetter(currentChar)) {
                charStackT.add(currentChar);
            } else if (currentChar == '#') {
                if (charStackT.size() > 0) {
                    charStackT.pop();
                }
            }
            j++;
        }

        return charStackS.equals(charStackT);
    }
    public static void main(String[] args) {
        String strA = "AbCdE";
        String strB = "abcde";
        String strC = "ab";

        System.out.println(caseInsensitiveStringCompare(strA, strB));
        System.out.println(caseInsensitiveStringCompare(strA, strC));

        String S1 = "ab#c";
        String T1 = "ad#c";
        System.out.println(backspaceStringCompare(S1, T1));

        String S2 = "ab##";
        String T2 = "c#d#";
        System.out.println(backspaceStringCompare(S2, T2));

        String S3 = "a##c";
        String T3 = "#a#c";
        System.out.println(backspaceStringCompare(S3, T3));

        String S4 = "a#c";
        String T4 = "b";
        System.out.println(backspaceStringCompare(S4, T4));
    }
}