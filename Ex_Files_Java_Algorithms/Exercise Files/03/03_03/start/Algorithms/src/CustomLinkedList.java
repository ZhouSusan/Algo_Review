import java.util.LinkedList;

public class CustomLinkedList {
    Node head;

    public boolean isEmpty() {
        return head == null;
    }

    public void add(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = newNode;
            return;
        }

        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = newNode;
    }

    public void prepend(int data) {
        Node newHead = new Node(data);
        if (isEmpty()) {
            head = newHead;
            return;
        }

        newHead.next = head;
        head = newHead;
    }

    public void remove(int data) {
        if (head.data == data) {
            head = head.next;
            return;
        }
        Node current = head;
        while (current.next != null) {
            if (current.next.data == data) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }

        public int size() {
            int length = 0;

            if (isEmpty()) {
                return 0;
            }

            Node current = head;
            while (current != null) {
                length += 1;
                current = current.next;
            }
            return length;
    }

    public void displayContents() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println();
    }
}
