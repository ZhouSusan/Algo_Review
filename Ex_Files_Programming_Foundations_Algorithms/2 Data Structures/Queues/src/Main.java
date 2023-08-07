import java.util.ArrayDeque;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        // TODO: create a new empty deque object that will function as a queue
        Queue<Integer> newQueue = new ArrayDeque<Integer>();

        // TODO: add some items to the queue
        newQueue.add(1);
        newQueue.add(2);
        newQueue.add(3);
        newQueue.add(4);

        // TODO: print the queue contents
        for (Integer elem: newQueue) {
            System.out.println(elem);
        }

        // TODO: pop an item off the front of the queue
        newQueue.remove();
        System.out.println();
        newQueue.forEach(System.out::println); // 2 3 4

        newQueue.remove();
        newQueue.remove();
        System.out.println();
        newQueue.forEach(System.out::println);// 4

    }
}