public class Main {
    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.insert(38);
        sll.insert(39);
        sll.insert(13);
        sll.insert(15);

        System.out.printf("Item count: %d", sll.getCount());
        sll.dumpList();
    }
}