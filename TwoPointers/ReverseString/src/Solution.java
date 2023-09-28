public class Solution {
    /**
     * A function that reverses a string in-place.
     * @param s - a string of ascii characters
     */
    public static void reverseString(char[] s) {
        int start = 0;
        int end = s.length-1;

        while (start < end) {
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        char[] s = {'J','e','L','l','O'};
        reverseString(s);
        System.out.println(s);
    }
}