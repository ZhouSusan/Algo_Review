import java.util.Arrays;

public class Algorithms {

    public static void rotateArrayLeft(int[] arr) {
        if (arr == null || arr.length == 0 || arr.length == 1) {
            return;
        }
        int firstElement = arr[0];
        for (int i = 0; i < arr.length-1; i++) {
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = firstElement;
    }

    public static void rotateArrayRight(int[] arr) {
        if (arr == null || arr.length == 0 || arr.length == 1) {
            return;
        }
        int lastElement = arr[arr.length-1];
        for (int i = arr.length-1; i > 0; i--) {
            // [1 ,1,2,3,4,5]
            arr[i] = arr[i-1];
        }
        arr[0] = lastElement;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        rotateArrayLeft(arr);
        rotateArrayRight(arr);
        Arrays.stream(arr).forEach(System.out::println);
    }
}
