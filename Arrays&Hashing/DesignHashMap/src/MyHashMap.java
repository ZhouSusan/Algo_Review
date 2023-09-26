import java.util.ArrayList;

public class MyHashMap {

    static ArrayList<ArrayList<Integer>> list;
    public MyHashMap() {
        list = new ArrayList<>();
    }

    /**
     * Adds (key, value) pair into the HashMap.
     * @param key - number
     * @param value - number
     */
    public static void put(int key, int value) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).get(0) == key) {
                list.remove(i);
            }
        }

        ArrayList<Integer> innerList = new ArrayList<>();
        innerList.add(key);
        innerList.add(value);
        list.add(innerList);
    }

    /**
     * Retrieves the value associated with the key in map.
     * @param key - number
     * @return number - the value associated with key, or -1
     */
    public static int get(int key) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).get(0) == key) {
                return list.get(i).get(1);
            }
        }

        return -1;
    }

    /**
     * Removes the key and its corresponding value, if presented in map.
     * @param key - number
     */
    public static void remove(int key) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).get(0) == key) {
                list.remove(i);
            }
        }
    }
}