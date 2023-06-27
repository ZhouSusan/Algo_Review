public class Algorithms {

    public static void main(String[] args) {
        CustomLinkedList linkedList = new CustomLinkedList();
        System.out.printf("The size is %d\n", linkedList.size());

        linkedList.add(10);
        linkedList.add(11);
        linkedList.add(31);
        linkedList.add(35);
        linkedList.add(45);
        linkedList.displayContents();
        System.out.printf("The size is %d\n", linkedList.size());

        linkedList.prepend(9);
        linkedList.displayContents();
        System.out.printf("The size is %d\n", linkedList.size());

        linkedList.remove(31);
        linkedList.remove(9);
        linkedList.displayContents();
        System.out.printf("The size is %d\n", linkedList.size());
    }
}
