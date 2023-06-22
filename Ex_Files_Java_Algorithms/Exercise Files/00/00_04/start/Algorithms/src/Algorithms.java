public class Algorithms {

    public static int findMaximum(int a, int b, int c) {
        int maxNum = a;
        if (b > maxNum) {
            maxNum = b;
        }

        if (c > maxNum) {
            maxNum = c;
        }
        return maxNum;
    }

    public static void main(String[] args) {

        System.out.println(findMaximum(1, 2, 3));
        System.out.println(findMaximum(8, 8, 1));
        System.out.println(findMaximum(3, 2, 3));
        System.out.println(findMaximum(1, 1, 9));
        System.out.println(findMaximum(1, 9, 9));
    }
}
