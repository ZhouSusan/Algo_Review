public class Main {
    public static void countDown(int x) {
        if (x == 0) {
            System.out.println("Done!");
            return;
        }

        System.out.println(x + "...");
        countDown(x-1);
    }

    public static int power(int num, int pwr) {
        if (pwr == 0) {
            return 1;
        }

        return num * power(num, pwr-1);
    }

    public static int factorial(int num) {
        if (num == 0) {
            return 1;
        }

        return num * factorial(num-1);
    }

    public static void main(String[] args) {
        countDown(5);
        System.out.printf("%d to the power of %d is %s.\n", 5, 3, power(5, 3));
        System.out.printf("%d to the power of %d is %s.\n", 1, 5, power(1, 5));
        System.out.printf("%d! is %s.\n", 4, factorial(4));
        System.out.printf("%d! is %s.", 0, factorial(0));;
    }
}