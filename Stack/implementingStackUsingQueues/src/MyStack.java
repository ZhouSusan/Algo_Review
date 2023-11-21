import java.util.LinkedList;
import java.util.Queue;

public class MyStack {

    private Queue<Integer> queue1;
    private Queue<Integer> queue2;

    public MyStack() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }

    /**
     * Pushes element x to the top of the stack.
     * @param x - integer
     */
    public void push(int x) {
        while(queue1.size() > 0) {
            queue2.add(queue1.poll());
        }
        queue1.add(x);

        while(queue2.size() > 0) {
            queue1.add(queue2.poll());
        }
    }

    /**
     * Removes the element on the top of the stack and returns it.
     * @return int - top element of stack
     */
    public int pop() {
        return queue1.poll();
    }


    /**
     * Returns the element on the top of the stack.
     * @return int - top element of stack
     */
    public int top() {
        return empty() ? -1 : queue1.peek();
    }

    /**
     * Checks if the stack is empty.
     * @return boolean - true if the stack is empty, false otherwise
     */
    public boolean empty() {
        return queue1.size() == 0;
    }

    /**
     * Returns the size of the stack
     * @return int - size of stack
     */
    public int size() {
        return this.queue1.size();
    }
}
