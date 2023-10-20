public class Solution {
    /**
     * Determining if a username is valid.
     * @param str - a string that contains ascii characters
     * @return String - a boolean string, based on if the username is valid
     */
    public static String codelandUsernameValidation(String str) {
        if(str == null || str.length() == 0) {
            return "false";
        }

        if (str.length() >= 4 && str.length() <= 25 && Character.isAlphabetic(str.charAt(0))
                && str.matches("^[a-zA-Z0-9 +_/]+") && str.charAt(str.length()-1) != '_') {
            return "true";
        }

        return "false";
    }

    public static void main(String[] args) {
        String str = "aa_";
        System.out.println(codelandUsernameValidation(str));
    }
}