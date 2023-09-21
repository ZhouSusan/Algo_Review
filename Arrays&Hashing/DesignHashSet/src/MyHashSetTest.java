import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MyHashSetTest {

    @Test
    void addTest() {
        MyHashSet testSet1 = new MyHashSet();
        assertNotNull(testSet1);
        assertTrue(testSet1.list.isEmpty());
        testSet1.add(1);
        testSet1.add(2);
        assertFalse(testSet1.list.isEmpty());
        assertTrue(testSet1.list.size()==2);

        testSet1.add(1); // does not add duplicate keys that already exist in list
        assertEquals(2, testSet1.list.size());
        assertFalse(testSet1.list.size() == 3);

        testSet1.add(3);
        testSet1.add(4);
        testSet1.add(4); // does not add duplicate keys that already exist in list
        testSet1.add(5);
        assertEquals(5, testSet1.list.size());
    }

    @Test
    void containsTest() {
        MyHashSet testSet2 = new MyHashSet();
        assertNotNull(testSet2);
        assertTrue(testSet2.list.isEmpty());

        assertFalse(testSet2.contains(20));
        testSet2.add(20);
        testSet2.add(27);
        testSet2.add(34);
        assertFalse(testSet2.list.isEmpty());
        assertTrue(testSet2.contains(20));
        assertTrue(testSet2.contains(27));
        assertTrue(testSet2.contains(34));
        assertFalse(testSet2.contains(0));
    }

    @Test
    void removeTest() {
        MyHashSet testSet3 = new MyHashSet();
        assertNotNull(testSet3);
        assertTrue(testSet3.list.isEmpty());
        testSet3.add(1);
        testSet3.add(2);
        testSet3.add(3);
        testSet3.add(4);
        testSet3.add(5);
        assertFalse(testSet3.list.isEmpty());
        assertTrue(testSet3.list.size()==5);

        testSet3.remove(6);
        assertNotEquals(4, testSet3.list.size());
        assertTrue(testSet3.list.size()==5);

        testSet3.remove(4);
        testSet3.remove(3);
        assertTrue(testSet3.list.size()==3);

        testSet3.remove(5);
        testSet3.remove(2);

        assertTrue(testSet3.list.size()==1);

        testSet3.remove(1);
        assertTrue(testSet3.list.isEmpty());
    }
}