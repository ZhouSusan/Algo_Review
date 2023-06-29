import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;

public class Algorithms {

    public static List<Integer> findMissingElements(int[] first, int[] second) {
        List<Integer> missingElements = new ArrayList<>();
        if (first.length == 0 || (first.length == 0 && second.length==0)) {
            return missingElements;
        }

        HashSet<Integer> hashSet = new HashSet<>();

        for (int i = 0; i < second.length; i++) {
            hashSet.add(second[i]);
        }

        for (int x : first) {
            if (!hashSet.contains(x)) {
                missingElements.add(x);
            }
        }

        return missingElements;
    }

    public static void main(String[] args) {

        findMissingElements(new int[] {1, 2, 3, 4},
                new int[] {1, 3}).forEach(System.out::println);

        System.out.println();

        findMissingElements(new int[] {8, 0, 1, 7, 3},
                new int[] {5, 7, 8, 0, 2}).forEach(System.out::println);
    }
}
