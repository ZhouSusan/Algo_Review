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

    public void insertNode(int data) {
        Node addThisNode = new Node(data);

        if (isEmpty()) {
            this.head = addThisNode;
        }

        addThisNode.setNext(this.head.getData());
        this.head = addThisNode;
        this.count++;
    }

    public boolean isEmpty() {
        return this.head == null;
    }
}
