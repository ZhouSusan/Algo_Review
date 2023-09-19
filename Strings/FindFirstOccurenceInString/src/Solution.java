public class Solution {
    /**
     * Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack
     * @param haystack - string consist of only lowercase English characters
     * @param needle - string consist of only lowercase English characters
     * @return number - the index of the first occurrence of needle in haystack, or -1
     */
    public static int strStr(String haystack, String needle) {
        if (haystack.contains(needle)) {
            return haystack.indexOf(needle);
        }
        return -1;
    }
    public static void main(String[] args) {
        String haystack = "sadbutsad", needle = "sad";
        System.out.println(strStr(haystack, needle));
    }
}