import java.util.ArrayList;
import java.util.List;

public class MyStack {

        private List<Integer> stack;

        public MyStack() {
            stack = new ArrayList<>();
        }

    /**
     * Pushes element x to the top of the stack.
     * @param x - integer
     */
        public void push(int x) {
            this.stack.add(x);
        }

    /**
     * Removes the element on the top of the stack and returns it.
     * @return int - top element of stack
     */
        public int pop() {
            return this.stack.remove(this.stack.size()-1);
        }

    /**
     * Returns the element on the top of the stack.
     * @return int - top element of stack
     */
        public int top() {
            if (!empty()) {
                return this.stack.get(this.stack.size()-1);
            }
            return -1;
        }

    /**
     * Checks if the stack is empty.
     * @return boolean - true if the stack is empty, false otherwise
     */
        public boolean empty() {
            return this.stack.size() == 0;
        }

    /**
     * Returns the size of the stack
     * @return int - size of stack
     */
        public int size() {
            return this.stack.size();
        }
}
