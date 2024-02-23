import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> twoDArray = new ArrayList<>();
        int n = sc.nextInt();

        for (int i = 0; i < n; i ++) {
            int subArrLength = sc.nextInt();
            ArrayList<Integer> row = new ArrayList<>();

            for (int j = 0; j < subArrLength; j++) {
                row.add(sc.nextInt());
            }

            twoDArray.add(row);
        }

        int queries = sc.nextInt();

        for (int k = 0; k < queries; k++) {
            int col = sc.nextInt();
            int row = sc.nextInt();

            try{
                System.out.println(twoDArray.get(col-1).get(row-1));
            } catch(IndexOutOfBoundsException exception) {
                System.out.println("ERROR!");
            }
        }

        sc.close();
    }
}