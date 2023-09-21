public class Solution {
    /**
     * @param s - a string consisting of words and spaces
     * @return int - the length of the last word in the string
     */
    public static int lengthOfLastWord(String s) {
        String regexS = s.trim().replaceAll(" +", " ");
        String[] words = regexS.split(" ");
        return words[words.length-1].length();
    }
    public static void main(String[] args) {
        String s = "sushi roll";
        System.out.println(lengthOfLastWord(s));
    }
}