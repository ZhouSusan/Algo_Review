import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashTable {
    public static void main(String[] args) {
        // Create a hashtable all at once
        Hashtable <?, ?> ht = new Hashtable<>() {
            {
                put("key1", 1);
                put("key2", 2);
                put("key3", "three");
                put(4, "four");
                put(5, 5);
            }
        };

        System.out.println(ht);
        System.out.println();

        // Create a hashtable progressively
        Hashtable < String, Integer> items2 = new Hashtable<String, Integer>();
        items2.put("key1", 1);
        items2.put("key2", 2);
        items2.put("key3", 3);
        System.out.println(items2);
        System.out.println();

        System.out.println(items2.get("key2"));
        System.out.println();

        // Try to access a nonexistent key
        System.out.println(items2.get("key4"));
        System.out.println();

        // replace an item
        items2.replace("key3", 3, 5);
        System.out.println(items2);
        System.out.println();

        // Iterate the keys and values in the dictionary
        Iterator<? extends Map.Entry<?, ?>> itr = ht.entrySet().iterator();
        Map.Entry<?,?> entry = null;

        while (itr.hasNext()) {
            entry = itr.next();
            System.out.println(entry.getKey() + "->" + entry.getValue());
        }

        System.out.println();

        Set<Map.Entry<String, Integer>> entries = items2.entrySet();
        for (Map.Entry<String, Integer> item: entries) {
            System.out.println(item.getKey() + "->" + item.getValue());
        }
    }
}