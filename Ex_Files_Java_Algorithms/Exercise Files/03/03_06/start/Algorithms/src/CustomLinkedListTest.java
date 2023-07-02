import static org.junit.jupiter.api.Assertions.*;

class CustomLinkedListTest {

    @org.junit.jupiter.api.Test
    void deleteKthNodeFromEndTest() {
        CustomLinkedList linkedList = new CustomLinkedList();

        assertTrue(linkedList.isEmpty());
        assertNotNull(linkedList);
        assertEquals(linkedList.length(), 0);

        Node firstNode = new Node(3);
        Node secondNode = new Node(4);
        Node thirdNode = new Node(5);
        Node fourthNode = new Node(6);
        Node fifthNode = new Node(7);
        Node sixthNode = new Node(8);

        linkedList.head = firstNode;
        firstNode.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = fourthNode;

        assertTrue(!linkedList.isEmpty());
        // 3->4->5->6
        assertEquals(linkedList.length(), 4);
        assertEquals(linkedList.head.data, 3);
        assertEquals(linkedList.head.next.data, 4);
        assertEquals(linkedList.head.next.next.data, 5);
        assertEquals(linkedList.head.next.next.next.data, 6);

        fourthNode.next = fifthNode;
        fifthNode.next = sixthNode;
        // 3->4->5->6->7->8
        assertEquals(linkedList.length(), 6);
        assertEquals(linkedList.head.next.next.next.next.data, 7);
        assertEquals(linkedList.head.next.next.next.next.next.data, 8);

        linkedList.deleteKthNodeFromEnd(2);

        // 3->4->6->8
        assertEquals(linkedList.length(), 5);
        assertEquals(linkedList.head.data, 3);
        assertEquals(linkedList.head.next.data, 4);
        assertEquals(linkedList.head.next.next.data, 5);
        assertEquals(linkedList.head.next.next.next.data, 6);
        assertEquals(linkedList.head.next.next.next.next.data, 8);

        linkedList.deleteKthNodeFromEnd(3);

        assertEquals(linkedList.length(), 4);
        assertEquals(linkedList.head.data, 3);
        assertEquals(linkedList.head.next.data, 4);
        assertEquals(linkedList.head.next.next.data, 6);
        assertEquals(linkedList.head.next.next.next.data, 8);

        // >4->6->8
        linkedList.deleteKthNodeFromEnd(3);
        assertEquals(linkedList.head.data, 4);
        assertEquals(linkedList.head.next.data, 6);
        assertEquals(linkedList.head.next.next.data, 8);
    }
}