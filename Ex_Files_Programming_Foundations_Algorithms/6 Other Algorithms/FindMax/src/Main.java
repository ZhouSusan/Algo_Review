public class Main {
    /**
     * @param arr - array of numbers
     * @param index - index of the value you want to compare
     * @return - return the maximum value or -1
     */
    public static int getMax(int[] arr, Integer index) {
        if (arr == null || arr.length == 0) {
            return -1;
        }

        if (arr.length == 1) {
            return arr[0];
        }

        if (index > 0) {
            return Math.max(arr[index], getMax(arr, index-1));
        } else {
            return arr[0];
        }
    }
    public static void main(String[] args) {
        int[] arr = {6, 20, 8, 19, 56, 23, 87, 41, 49, 53};
        System.out.println(getMax(arr, arr.length-1));
    }
}