import java.util.List;

public class Result {
    /**
     * Given an array of integers, find the sum of its elements.
     * @param ar - array of integers
     * @return int - sum of the array's elements as a single integer
     */
    public static int simpleArraySum(List<Integer> ar) {
        int sum = 0;

        for(int num: ar) {
            sum += num;
        }

        return sum;
    }

}