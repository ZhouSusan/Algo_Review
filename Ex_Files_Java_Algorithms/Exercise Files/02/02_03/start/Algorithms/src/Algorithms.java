import java.util.Arrays;

public class Algorithms {

    public static boolean binarySearch(int[] arr, int item) {
        if (arr.length == 0) {
            return false;
        }

        int min = 0;
        int max  = arr.length-1;
        int middle;

        while (min <= max) {
            middle = (max+min)/2;
            if (item == arr[middle]) {
                return true;
            } else if (item > arr[middle]) {
                min = middle + 1;
            } else if(item < arr[middle]) {
                max = middle -1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        System.out.println(binarySearch(arr, 3));
        System.out.println(binarySearch(arr, 1));
        System.out.println(binarySearch(arr, 8));

        System.out.println(Arrays.binarySearch(arr, 4));
    }
}
