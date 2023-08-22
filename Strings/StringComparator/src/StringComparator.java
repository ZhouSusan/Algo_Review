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
    public static void main(String[] args) {
        String strA = "AbCdE";
        String strB = "abcde";
        String strC = "ab";

        System.out.println(caseInsensitiveStringCompare(strA, strB));
        System.out.println(caseInsensitiveStringCompare(strA, strC));
    }
}