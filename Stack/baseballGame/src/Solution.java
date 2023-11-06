import java.util.Stack;

public class Solution {
    /**
     * Calculates the sum of all scores on record, and applies appropriate operations to the scoring record based on its rules.
     * @param operations<String> - a list of strings operations, where operations[i] is "C", "D", "+", or a string representing an integer in the range [-3 * 104, 3 * 104]
     * @return int - the sum of all the scores on the record after applying all the operations
     */
    public static int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        int total = 0;
        for (int i = 0; i < operations.length; i++) {
            try {
                int number = Integer.parseInt(operations[i]);
                stack.push(number);
            } catch (NumberFormatException ex) {
                ex.printStackTrace();
            }

            switch(operations[i]) {
                case "C":
                    if(!stack.isEmpty()) {
                        stack.pop();
                    }
                    break;
                case "D":
                    if(!stack.isEmpty()) {
                        stack.push(stack.peek()*2);
                    }
                    break;
                case "+":
                    if(!stack.isEmpty()) {
                        stack.push(stack.peek()+ stack.get(stack.size()-2));
                    }
            }
        }

        for(Integer i: stack) {
            total += i;
        }

        return total;
    }
    public static void main(String[] args) {
        String[] operations = {"3", "2", "C", "D", "1", "+"};
        System.out.println(calPoints(operations));
    }
}