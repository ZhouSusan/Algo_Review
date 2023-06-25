import java.util.Arrays;
import java.util.OptionalInt;

public class Algorithms {

    public static Integer linearSearch(int[] arr, int item) {
        for (int current : arr) {
            if (current == item) {
                return item;
            }
        }

        return null;
    }

    // An OptionalInt acts as a container to help prevent null exceptions.
    // If the array contains the item, then the optional will contain the item.
    // Otherwise, the optional will be empty.
    public static OptionalInt linearSearch2(int[] arr, int item) {
        return Arrays.stream(arr).filter(x -> x == item).findFirst();
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        linearSearch2(arr, 1).ifPresent(System.out::println);
        linearSearch2(arr, 8).ifPresent(System.out::println);
    }
}
