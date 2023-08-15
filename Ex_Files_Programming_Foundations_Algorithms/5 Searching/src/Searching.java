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
    
    public static void main(String[] args) {
        int[] itemArr = new int[] {6, 20, 8, 19, 56, 23, 87, 41, 49, 53};
        System.out.println(linearSearch(itemArr, 87));
        System.out.println(linearSearch(itemArr, 250));
    }
}