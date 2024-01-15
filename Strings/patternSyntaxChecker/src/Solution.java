import java.util.Scanner;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int testCases = Integer.parseInt(scan.nextLine());

        while (testCases > 0) {
            String pattern = scan.nextLine();
            try {
                Pattern checkPattern = Pattern.compile(pattern);
                System.out.println("Valid");
            } catch(Exception e) {
                System.out.println("Invalid");
            }
            testCases -= 1;
        }
        scan.close();
    }
}