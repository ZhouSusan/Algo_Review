public class Solution {
    /**
     * Finding the longest word in a string.
     * @param sen - a string that contains ascii characters
     * @return String - the longest word
     */
    public static String longestWord(String sen) {
        String regexStr = sen.trim().replaceAll("[^a-zA-Z0-9]+", " ");
        if(regexStr.length() <= 1) {
            return "";
        }
        String[] senArr = regexStr.split(" ");
        String longestWord = senArr[0];

        for (int i = 1; i < senArr.length; i++) {
            if (senArr[i].length() > longestWord.length()) {
                longestWord = senArr[i];
            }
        }
        return longestWord;
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}