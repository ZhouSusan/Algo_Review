import java.util.ArrayDeque;

public class Queue {
    public static void main(String[] args) {

        // Create a new empty deque object that will function as a queue
        java.util.Queue<Integer> newQueue = new ArrayDeque<Integer>();

        // Add some items to the queue
        newQueue.add(1);
        newQueue.add(2);
        newQueue.add(3);
        newQueue.add(4);

        // Print the queue contents
        for (Integer elem: newQueue) {
            System.out.println(elem);
        }

        // Pop an item off the front of the queue
        newQueue.remove();
        System.out.println();
        newQueue.forEach(System.out::println); // 2 3 4

        newQueue.remove();
        newQueue.remove();
        System.out.println();
        newQueue.forEach(System.out::println);// 4

    }
}