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

    public void find(int val) {
        boolean flag = false;

        if (isEmpty()) {
            System.out.println("Element is not present in the list");
            return;
        }

        Node current = this.head;
        int i =1;
        while (current != null) {
            if (current.getData() == val) {
                flag = true;
                break;
            } else {
                i++;
                current = current.getNext();
            }
        }

        if (flag) {
            System.out.println("Element is present in the list at the position : " + i);
        } else {
            System.out.println("Element is not present in the list");
        }
    }

    public void deleteAt(int idx) {
        if (isEmpty()) {
            return;
        }

        Node temp = head;
        if (idx == 0)
        {
            head = temp.getNext();
            return;
        }
        for (int i=0; temp!=null && i<idx-1; i++)
            temp = temp.getNext();
        if (temp == null || temp.getNext() == null)
            return;
        Node next1 = temp.getNext().getNext();

        temp.setNext(next1);
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
            System.out.printf("Node: %d\n", curr.getData());

            curr = curr.getNext();
        }
    }
}
