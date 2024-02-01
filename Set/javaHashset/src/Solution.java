import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        Set<String> pairs = new HashSet<>();
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();

        for (int i = 0; i < x; i++) {
            String left = scan.next();
            String right = scan.next();
            pairs.add("("+left+", " + right+")");
            System.out.println(pairs.size());
        }
        scan.close();
    }
}