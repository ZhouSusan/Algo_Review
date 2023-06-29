import static org.junit.jupiter.api.Assertions.*;

class CustomLinkedListTest {

    @org.junit.jupiter.api.Test
    void hasCycle() {

        CustomLinkedList noCycleLinkedList = new CustomLinkedList();
        // The list is initial empty
        assertFalse(noCycleLinkedList.hasCycle());

        Node firstNode = new Node(3);
        Node secondNode = new Node(4);
        Node thirdNode = new Node(5);
        Node fourthNode = new Node(6);

        noCycleLinkedList.head = firstNode;
        firstNode.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = fourthNode;

        // the second call is 3->4->5->6-> null. Does not have a cycle.
        assertFalse(noCycleLinkedList.hasCycle());

        CustomLinkedList cycleLinkedList = new CustomLinkedList();
        cycleLinkedList.head = firstNode;
        thirdNode.next = secondNode;

        // the third call has a cycle.
        assertTrue(noCycleLinkedList.hasCycle());
    }
}