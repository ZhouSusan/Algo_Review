public class Main {
    public static void countDown(int x) {
        if (x == 0) {
            System.out.println("Done!");
            return;
        }

        System.out.println(x + "...");
        countDown(x-1);
    }

    public static void main(String[] args) {
        countDown(5);
    }
}