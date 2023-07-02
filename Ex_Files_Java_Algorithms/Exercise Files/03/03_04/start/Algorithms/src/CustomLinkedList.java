public class CustomLinkedList {

    Node head;

    public void displayContents() {
        Node current = head;
        while(current != null) {
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println();
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

    public boolean isEmpty() {
        return head == null;
    }

    public void deleteBackHalf() {
        if (head == null || head.next == null) {
            head = null;
        }
        Node slow = head;
        Node fast = head;
        Node prev = null; // prev node will just behind the slow node

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            prev = slow;
            slow = slow.next;
        }

        prev.next = null;
    }
}
