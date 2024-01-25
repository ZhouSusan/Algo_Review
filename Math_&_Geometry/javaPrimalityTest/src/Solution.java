import java.math.BigInteger;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BigInteger inputNumber = scan.nextBigInteger();
        System.out.println(inputNumber.isProbablePrime(10) ? "prime": "not prime");
        scan.close();
    }
}