import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();

        List<Integer> numList = new ArrayList<>();

        for (int i = 0; i < num; i++)
        {
            numList.add(scan.nextInt());
        }


        int numOfQueries = scan.nextInt();

        for (int i = 0; i < numOfQueries; i++)
        {
            String op = scan.next();
            int idx = scan.nextInt();
            if (op.equals("Insert"))
            {
                int val = scan.nextInt();
                numList.add(idx, val);
            }

            else if (op.equals("Delete"))
            {
                numList.remove(idx);
            }
        }

        scan.close();

        for (int x: numList)

        {
            System.out.print(x + " ");
        }
    }
}