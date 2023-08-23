public class CustomizeString {

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

    /**
     * Adds and formats the given honorific to the given full Names.
     * @param honorific - title to be added to the full name (ex. "Mr", "Miss", "Sir", "Miss", etc)
     * @param fullNames - an array of full name strings in "Last Name", "First Name" format
     * @return Array<String> - in this format "Honorific FirstName LastName"
     */
    public static String[] addHonorific(String honorific, String[] fullNames) {
        if (fullNames == null || fullNames.length == 0) {
            return new String[0];
        }

        String[] namesWithHonorific = new String[fullNames.length];

        for (int i = 0; i < fullNames.length; i++) {
            String firstName = fullNames[i].split(",")[1];
            String lastName = fullNames[i].split(",")[0];

            if (honorific == null) {
                namesWithHonorific[i] = firstName.trim() + " " + lastName;
            } else {
                namesWithHonorific[i] = honorific + firstName + " " + lastName;
            }
        }

        return namesWithHonorific;
    }

}