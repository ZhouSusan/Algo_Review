import java.util.LinkedList;

public class CustomLinkedList {

    Node head;

    public void displayContents() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println();
    }

    public int length() {
        int size = 0;
        if (isEmpty()) {
            return size;
        }

        Node current = head;
        while (current != null) {
            size += 1;
            current = current.next;
        }
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }
    public void deleteKthNodeFromEnd(int k) {
        if (isEmpty() || k == 0) {
            return;
        }

        Node first = head;
        Node second = head;

        for (int i = 0; i < k; i++) {
            second = second.next; // increment second pointer until we reached kth item
            if (second.next==null) {
                // K >= length of ths list
                if (i == k - 1) {
                    head = head.next;
                }
                return;
            }
        }

        while (second.next != null) {
            first = first.next;
            second = second.next;
        }

        first.next = first.next.next;
    }
}
