import java.math.BigInteger;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BigInteger inputNum1 = scan.nextBigInteger();
        BigInteger inputNum2 = scan.nextBigInteger();
        scan.close();

        BigInteger sum = inputNum1.add(inputNum2);
        System.out.println(sum);

        BigInteger product = inputNum1.multiply(inputNum2);
        System.out.println(product);
    }
}