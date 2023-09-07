public class Solution {

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

    public static void main(String[] args) {
        String honorificOne = "Sir";
        String[] namesOne =  {"Sanchez, Rick", "Smith, Jerry"};
        String[] namesWithHonorific = addHonorific(honorificOne, namesOne);
        for (String name : namesWithHonorific) {
            System.out.println(name);
        }
    }
}