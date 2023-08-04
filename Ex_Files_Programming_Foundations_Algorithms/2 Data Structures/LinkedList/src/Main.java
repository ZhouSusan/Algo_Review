public class Main {
    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.insert(38);
        sll.insert(39);
        sll.insert(13);
        sll.insert(15);

        System.out.printf("Item count: %d\n", sll.getCount());
        sll.find(38);
        sll.find(13);
        sll.find(15);
        sll.find(78);
        System.out.println();
        sll.dumpList();
    }
}