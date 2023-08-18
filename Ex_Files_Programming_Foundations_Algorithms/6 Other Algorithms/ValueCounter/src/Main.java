import java.util.Hashtable;

public class Main {

    public static java.util.Hashtable<String, Integer> getCountInventory(String[] items ) {

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

    public static void main(String[] args) {
        String[] items = new String[] {"apple", "pear", "orange", "banana", "apple",
                "orange", "apple", "pear", "banana", "orange",
                "apple", "kiwi", "pear", "apple", "orange"};

        Hashtable countItems = getCountInventory(items);
        countItems.forEach((k, v) -> {
            System.out.println(k + ":" + v);
        });
    }
}