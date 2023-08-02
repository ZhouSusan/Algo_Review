public class Main {
    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.insertNode(38);
        sll.insertNode(39);
        sll.insertNode(13);
        sll.insertNode(15);

        System.out.printf("Item count: %d", sll.getCount());
    }
}