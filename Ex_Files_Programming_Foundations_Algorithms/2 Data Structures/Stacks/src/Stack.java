public class Stack {
    public static void main(String[] args) {
        // create a new empty stack
        java.util.Stack newStack = new java.util.Stack<>();

        // push items onto the stack
        newStack.push(1);
        newStack.push(2);
        newStack.push(3);
        newStack.push(4);

        // print the stack contents
        newStack.forEach(System.out::println);

        // pop an item off the stack
        newStack.pop();
        System.out.println();
        newStack.forEach(System.out::println);

        newStack.pop();
        newStack.pop();
        System.out.println();
        newStack.forEach(System.out::println);
    }
}
