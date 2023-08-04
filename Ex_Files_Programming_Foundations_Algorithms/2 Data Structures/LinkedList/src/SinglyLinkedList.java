public class SinglyLinkedList {
    Node head;
    private int count;
    public SinglyLinkedList() {
        this.head = head;
        this.count = 0;
    }

    public int getCount() {
        return this.count;
    }

    public void insert(int data) {
        Node addThisNode = new Node(data);

        if (isEmpty()) {
            this.head = addThisNode;
            this.count++;
            return;
        }

        Node curr = this.head;
        Node previous = this.head;
        while (curr != null) {
            previous = curr;
            curr = curr.getNext();
        }
        previous.setNext(addThisNode);
        this.count++;
    }

    public Node find(int val) {
        if (isEmpty()) {
            return null;
        }

        Node current = this.head;
        while (current != null) {
            if (current.getData() == val) {
                return current;
            } else {
              current = current.getNext();
            }
        }
        return null;
    }

    public boolean isEmpty() {
        return this.head == null;
    }

    public void dumpList() {
        if (isEmpty()) {
            System.out.println("Your list is empty.");
        }

        Node curr = this.head;
        while (curr != null) {
            System.out.printf("Node: %d", curr.getData());

            curr = curr.getNext();
        }
    }
}
