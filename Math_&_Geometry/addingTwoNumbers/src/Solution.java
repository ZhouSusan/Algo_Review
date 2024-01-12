import java.util.Scanner;

public class Solution {
    /**
     * Compute the sum of two integers.
     * @param a - integer
     * @param b - integer
     * @return int - sum of a + b
     */
    public static int solveMeFirst(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println(solveMeFirst(a, b));
        in.close();
    }
}