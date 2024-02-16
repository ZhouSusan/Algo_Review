public class Solution {

    /**
     * Prints out all the elements from an array.
     * @param arr - an array of elements
     */
    public static <T>void print(T[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        Integer[] intArr = {1,2,3};
        String[] strArr = {"Hello", "World"};
        print(intArr);
        print(strArr);
    }
}