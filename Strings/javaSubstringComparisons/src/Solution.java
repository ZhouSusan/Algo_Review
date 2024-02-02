import java.util.Scanner;

public class Solution {

    /**
     *  Finds the lexicographically smallest and largest substrings of length k.
     * @param s - a string consists of English alphabetic letters only
     * @param k -  the length of the substrings to find
     * @return String - the string ' + "\n" + ' where and are the two substrings
     */
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        smallest = largest = s.substring(0, k);

        for(int i = 0; i <= s.length()-k; i++) {
            String currentPartialStr = s.substring(i, i+k);
            if (smallest.compareTo(currentPartialStr) > 0) {
                smallest = currentPartialStr;
            }

            if(largest.compareTo(currentPartialStr) < 0) {
                largest = currentPartialStr;
            }
        }
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}