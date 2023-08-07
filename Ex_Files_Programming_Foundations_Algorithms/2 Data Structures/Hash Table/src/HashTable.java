import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

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

        //# TODO: create a hashtable progressively


        //# TODO: try to access a nonexistent key


        //# TODO: replace an item


        // Iterate the keys and values in the dictionary
        Iterator<? extends Map.Entry<?, ?>> itr = ht.entrySet().iterator();
        Map.Entry<?,?> entry = null;

        while (itr.hasNext()) {
            entry = itr.next();
            System.out.println(entry.getKey() + "->" + entry.getValue());
        }
    }
}