import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("================================");
        for(int i = 0; i < 3; i++) {
            String str = scan.next();
            int num = scan.nextInt();

            System.out.printf("%-15s%s%n", str, String.format("%03d", num));
        }
        System.out.println("================================");
        scan.close();
    }
}