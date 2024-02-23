import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] innerArr = new int[n];
        int[][] outerArr = new int[n][n];
        int negativeSumCount = 0;

        for (int i = 0; i < n; i++) {
            innerArr[i] = scan.nextInt();

            if (innerArr[i] < 0) negativeSumCount++;
            outerArr[i][i] = innerArr[i];

            for (int j = 0; j < i; j++) {
                outerArr[j][i] = outerArr[j][i-1] + innerArr[i];
                if (outerArr[j][i] < 0) negativeSumCount++;
            }
        }
        System.out.println(negativeSumCount);

        scan.close();
    }
}