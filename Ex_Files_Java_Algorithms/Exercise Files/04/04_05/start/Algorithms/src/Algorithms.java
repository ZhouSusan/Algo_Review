import java.util.Stack;

public class Algorithms {

    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        System.out.println("START main");
        stack.push("main");

        System.out.println("START builder");
        stack.push("builder");

        System.out.println("START external-service");
        stack.push("external-service");

        System.out.println("TOP " + stack.peek());

        System.out.println("END " + stack.pop());

        System.out.println("START parse-external-data");
        stack.push("parse-external-data");
        System.out.println("TOP " + stack.peek());

        System.out.println("END " + stack.pop());
        System.out.println("END " + stack.pop());
        System.out.println("END " + stack.pop());
    }
}
