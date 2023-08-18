import java.util.HashSet;
import java.util.Hashtable;

public class Main {

    /**
     * @param items - an array of strings
     * @return hashtable - that counts each individual item from the input array
     */
    public static Hashtable<String, Integer> getCountInventory(String[] items ) {

        if (items == null || items.length == 0) {
            return new Hashtable<String, Integer>();
        }

        Hashtable<String, Integer> itemsDictionary = new Hashtable<String, Integer>();

        for (int i = 0; i < items.length; i++) {
            String currentItem = items[i];
            if (itemsDictionary.containsKey(currentItem)) {
                itemsDictionary.put(currentItem, itemsDictionary.get(currentItem) + 1);
            } else {
                itemsDictionary.put(currentItem, 1);
            }
        }

        return itemsDictionary;
    }

    /**
     * @param arr - an array of strings
     * @return hashset - set of items that we want to reduce duplicates
     */
    public static HashSet<String> filterDuplicates(String[] arr) {
        if (arr == null || arr.length == 0) {
            return new HashSet<>();
        }

        Hashtable<String, Integer> ht = new Hashtable<>();

        for (int i = 0; i < arr.length; i++) {
            ht.put(arr[i] , 0);
        }

        HashSet<String> filteredSet = new HashSet<>();
        ht.forEach((k, v) -> {
            if (!filteredSet.contains(k)) {
                filteredSet.add(k);
            }
        });

        return filteredSet;
    }

    public static void main(String[] args) {
        String[] items = new String[] {"apple", "pear", "orange", "banana", "apple",
                "orange", "apple", "pear", "banana", "orange",
                "apple", "kiwi", "pear", "apple", "orange"};

        Hashtable countItems = getCountInventory(items);

        countItems.forEach((k, v) -> {
            System.out.println(k + ":" + v);
        });

        System.out.println();
        HashSet filteredItems = filterDuplicates(items);
        filteredItems.forEach(entry -> {
            System.out.print(entry + " ");
        });
    }
}