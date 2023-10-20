public class Solution {
    /**
     * Reversing a string.
     * @param str - a string that contains ascii characters
     * @return String - a reversed input str
     */
    public static String firstReverse(String str) {
        if (str == null || str.length() == 0) {
            return "";
        }

        if(str.length() == 1) {
            return str;
        }

        String[] strArr = str.split("");
        int start = 0;
        int end = str.length()-1;

        while(start <= end) {
            String temp = strArr[start];
            strArr[start] = strArr[end];
            strArr[end] = temp;
            start++;
            end--;
        }

        return String.join("", strArr);
    }
    public static void main(String[] args) {
        String str1 = "Hel2lo World and Coders!";
        System.out.println(firstReverse(str1));
    }
}