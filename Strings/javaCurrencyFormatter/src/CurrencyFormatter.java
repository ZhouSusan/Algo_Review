import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyFormatter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        NumberFormat n = NumberFormat.getCurrencyInstance(Locale.US);
        String us = n.format(payment);

        n = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        String india = n.format(payment);

        n = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String china = n.format(payment);

        n = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String france = n.format(payment);

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}