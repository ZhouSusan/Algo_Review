public class Algorithms {

    public static boolean linearSearch(int[] arr, int item) {
        if (arr == null || arr.length == 0) {
            return false;
        }
        for (int curr: arr) {
            if (curr == item) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        System.out.println(linearSearch(arr, 1));
        System.out.println(linearSearch(arr, 8));
    }
}
