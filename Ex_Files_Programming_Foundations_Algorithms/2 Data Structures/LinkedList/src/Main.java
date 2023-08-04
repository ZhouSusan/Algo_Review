public class Main {
    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.find(38);
        sll.insert(15);
        sll.insert(13);
        sll.insert(49);
        sll.insert(38);

        System.out.printf("Item count: %d\n", sll.getCount());
        sll.find(38);
        sll.find(13);
        sll.find(15);
        sll.find(78);
        System.out.println();
        sll.dumpList();

        sll.deleteAt(3);
        System.out.printf("\nItem updated count: %d\n", sll.getCount());
        sll.find(13);
        sll.dumpList();
        sll.deleteAt(0);
        System.out.printf("\nItem updated count: %d\n", sll.getCount());
        sll.find(38);
        sll.dumpList();
    }
}