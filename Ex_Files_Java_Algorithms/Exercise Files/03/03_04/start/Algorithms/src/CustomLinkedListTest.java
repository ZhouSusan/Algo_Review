import static org.junit.jupiter.api.Assertions.*;

class CustomLinkedListTest {

    @org.junit.jupiter.api.Test
    void customLinkedLinkTest() {
        CustomLinkedList linkedList = new CustomLinkedList();

        assertTrue(linkedList.isEmpty());
        assertEquals(linkedList.size(), 0);

        Node firstNode = new Node(3);
        Node secondNode = new Node(4);
        Node thirdNode = new Node(5);
        Node fourthNode = new Node(6);

        linkedList.head = firstNode;
        firstNode.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = fourthNode;

        assertTrue(!linkedList.isEmpty());
        assertEquals(linkedList.size(), 4);
        assertEquals(linkedList.head.data, 3);
        assertEquals(linkedList.head.next.data, 4);
        assertEquals(linkedList.head.next.next.data, 5);
        assertEquals(linkedList.head.next.next.next.data, 6);

        linkedList.deleteBackHalf();
        assertTrue(!linkedList.isEmpty());
        assertEquals(linkedList.size(), 2);
        assertEquals(linkedList.head.data, 3);
        assertEquals(linkedList.head.next.data, 4);
    }
}