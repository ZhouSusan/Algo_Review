public class Solution {
    /**
     * Replaces every uppercase letter with the same lowercase letter in a given string.
     * @param s - consists of printable ASCII characters
     * @return String - lowercase input s
     */
    public static String toLowerCase(String s) {
        return s.toLowerCase();
    }

    public static void main(String[] args) {
        String s = "CHEESE";
        System.out.println(toLowerCase(s));
    }
}