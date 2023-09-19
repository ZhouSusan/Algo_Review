public class Solution {
    /**
     * @param s - a string that contains English letters (upper-case and lower-case), digits, and spaces ' '
     * @return string - a string of the words in reverse order concatenated by a single space
     */
    public static String reverseWords(String s) {
        if (s.length() == 1) {
            return s;
        }

        String regexS = s.trim().replaceAll("\\s+", " ");
        String[] words = regexS.split(" ");
        int start = 0;
        int end = words.length-1;

        while (start <= end) {
            String temp = words[start];
            words[start] = words[end];
            words[end] = temp;
            start++;
            end--;
        }
        return String.join(" ", words);
    }
    public static void main(String[] args) {
        String s1 = "the sky is blue";
        System.out.println(reverseWords(s1));
    }
}