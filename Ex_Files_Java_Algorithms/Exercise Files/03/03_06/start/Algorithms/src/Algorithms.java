public class Algorithms {

    public static void main(String[] args) {
        CustomLinkedList linkedList = new CustomLinkedList();

        Node firstNode = new Node(3);
        Node secondNode = new Node(4);
        Node thirdNode = new Node(5);
        Node fourthNode = new Node(6);

        linkedList.head = firstNode;
        firstNode.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = fourthNode;

        linkedList.displayContents();
        System.out.printf("The size of length %s\n", linkedList.length());
        System.out.printf("Is this list empty: %s\n", linkedList.isEmpty());

        linkedList.deleteKthNodeFromEnd(2);
        linkedList.displayContents();
    }
}
