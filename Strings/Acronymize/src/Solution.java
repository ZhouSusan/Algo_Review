public class Solution {

    /**
     * Create a function that, given a string, returns the string’s acronym
     * @param str - A string of words to be turned into an acronym
     * @return string - the string’s acronym in upper case
     */
    public static String acronymize(String str) {
        if (str == null || str.isEmpty() ) {
            return "";
        }
        String trimmedString = str.replaceAll("\\s+", " ").trim();
        String[] wordsArr = trimmedString.split(" ");
        StringBuilder sb = new StringBuilder(wordsArr.length);

        for (int i = 0; i < wordsArr.length; i++) {
            sb.append(wordsArr[i].toUpperCase().charAt(0));
        }

        return sb.toString();
    }

    public static void main(String[] args) {
            String strOne = "object oriented programming";
            System.out.println(acronymize(strOne));

            String strTwo = "  global   information tracker    ";
            System.out.println(acronymize(strTwo));
    }
}