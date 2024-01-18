import java.util.Scanner;

public class Solution {
    /**
     * Determines if the given string is a palindrome.
     * @param str - a string that consist at most 50 lower case english letters
     * @return boolean
     */
    public static boolean isPalindrome(String str) {
        if (str.length() <= 1) {
            return true;
        }
        int left = 0;
        int right = str.length()-1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            } else {
                left++;
                right--;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String inputS = scan.nextLine();
        scan.close();

        String result = isPalindrome(inputS)? "Yes" : "No";
        System.out.print(result);
    }
}