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
    public void deleteKthNode() {

    }
}
