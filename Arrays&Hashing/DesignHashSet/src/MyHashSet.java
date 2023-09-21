import java.util.ArrayList;
import java.util.List;

public class MyHashSet {
    List<Integer> list = new ArrayList<>();

    public MyHashSet(){}

    /**
     * Inserts the value key into the HashSet.
     * @param {number} - key
     */
    public void add(int key){
        if(!list.contains(key)){
            list.add(key);
        }
    }

    /**
     * Removes the value key in the HashSet. If key does not exist in the HashSet, do nothing.
     * @param {number} - key
     */
    public void remove(int key) {
        if(list.contains(key)) {
            list.remove(Integer.valueOf(key));
        }
    }

    /**
     * Determines if the value key exists in the Hashset or not.
     * @param {number} - key
     * @return {boolean} - Whether the key exists or not
     */
    public boolean contains(int key){
        for(int x : list) {
            if (x == key) {
                return true;
            }
        }
        return false;
    }
}
