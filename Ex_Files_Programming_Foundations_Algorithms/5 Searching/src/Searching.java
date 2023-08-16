public class Searching {

    /**
     * @param arr - unordered array
     * @param item - searching for an item in an unordered array
     * @return - index if item exist or -1
     */
    //
    public static int linearSearch(int[] arr, int item) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == item) {
                return i;
            }
        }
        return -1;
    }

    /**
     * @param arr - ordered array
     * @param item - searching for an item in an ordered array
     * @return - index if item exist or -1
     */
    public static int binarySearch(int[] arr, int item) {
        if (arr == null || arr.length == 0) {
            return -1;
        }

        int low = 0;
        int high = arr.length-1;
        int middle;

        while (low <= high) {
            middle = low + (high-low)/2;
            if (arr[middle] == item) {
                return middle;
            } else if ( item < arr[middle]) {
                high = middle - 1;
            } else {
                low = middle + 1;
            }
        }

        return -1;
    }

    /**
     * @param arr - an array
     * @return - boolean if the input array is sorted or not
     */
    public static boolean is_sorted(int[] arr) {
        if (arr == null) {
            return false;
        }

        if (arr.length < 2) {
            return true;
        }

        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] > arr[i+1]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[] itemArr = new int[] {6, 20, 8, 19, 56, 23, 87, 41, 49, 53};
        System.out.println(linearSearch(itemArr, 87));
        System.out.println(linearSearch(itemArr, 250));

        int[] itemArr2 = new int[] {6, 20, 28, 39, 56, 63, 67, 74, 81};
        System.out.println(binarySearch(itemArr2, 67));
        System.out.println(binarySearch(itemArr2, 81));
        System.out.println(binarySearch(itemArr2, 41));

        System.out.println(is_sorted(itemArr));
        System.out.println(is_sorted(itemArr2));
    }
}