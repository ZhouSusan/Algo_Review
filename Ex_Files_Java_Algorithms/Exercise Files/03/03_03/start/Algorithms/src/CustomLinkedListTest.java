import static org.junit.jupiter.api.Assertions.*;

class CustomLinkedListTest {

    @org.junit.jupiter.api.Test
    void LinkedListTest() {
        CustomLinkedList ll = new CustomLinkedList();

        assertTrue(ll.isEmpty());

        ll.add(10);
        ll.add(11);
        ll.add(31);
        ll.add(35);
        ll.add(45);
        assertTrue(!ll.isEmpty());
        assertEquals(5, ll.size());

        ll.prepend(9);
        assertEquals(6, ll.size());
        assertEquals(9, ll.head.data);

        ll.remove(31);
        ll.remove(9);
        assertEquals(4, ll.size());
        assertEquals(10, ll.head.data);
        assertEquals(11, ll.head.next.data);
        assertEquals(35, ll.head.next.next.data);
        assertEquals(45, ll.head.next.next.next.data);
    }
}