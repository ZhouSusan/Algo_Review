import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MyHashMapTest {

    @org.junit.jupiter.api.Test
    void put() {
        MyHashMap hm1 = new MyHashMap();
        assertNotNull(hm1);
        assertTrue(hm1.list.isEmpty());

        // adding to list
        hm1.put(1, 1);
        hm1.put(2, 2);
        assertTrue(hm1.list.size() == 2);
        assertEquals(1, hm1.list.get(0).get(0));
        assertEquals(1, hm1.list.get(0).get(1));
        assertEquals(2, hm1.list.get(1).get(0));
        assertEquals(2, hm1.list.get(1).get(1));

        hm1.put(3, 3);
        assertTrue(hm1.list.size() == 3);
        assertEquals(3, hm1.list.get(2).get(0));
        assertEquals(3, hm1.list.get(2).get(1));

        // updating list
        hm1.put(2, 3);
        assertTrue(hm1.list.size() == 3);
        assertEquals(3, hm1.list.get(1).get(1));
    }

    @org.junit.jupiter.api.Test
    void get() {
        MyHashMap hm2 = new MyHashMap();
        assertNotNull(hm2);
        assertTrue(hm2.list.isEmpty());


        hm2.put(0, 0);
        hm2.put(1, 2);
        assertTrue(hm2.list.size() == 2);
        assertEquals(0, hm2.list.get(0).get(1));
        assertEquals(2, hm2.list.get(1).get(1));
    }

    @org.junit.jupiter.api.Test
    void remove() {
        MyHashMap hm3 = new MyHashMap();
        assertNotNull(hm3);
        assertTrue(hm3.list.isEmpty());

        hm3.put(10, 10);
        hm3.put(11, 11);
        assertTrue(hm3.list.size() == 2);
        assertEquals(10, hm3.list.get(0).get(0));
        assertEquals(10, hm3.list.get(0).get(1));
        assertEquals(11, hm3.list.get(1).get(0));
        assertEquals(11, hm3.list.get(1).get(1));

        hm3.remove(13);
        assertTrue(hm3.list.size() == 2);

        // removing list
        hm3.remove(10);
        assertTrue(hm3.list.size() == 1);
        assertEquals(11, hm3.list.get(0).get(1));

        hm3.remove(11);
        assertTrue(hm3.list.isEmpty());
    }
}