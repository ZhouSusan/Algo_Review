import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String inputStr = in.nextLine();
        int start = in.nextInt();
        int end = in.nextInt();

        System.out.println(inputStr.substring(start, end));
        in.close();
    }
}