import java.util.ArrayList;
import java.util.List;

public class Solution {
    /**
     * @param numRows - an integer
     * @return  List<List<Integer>> - the first numRows of Pascal's triangle
     */
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        result.add(firstRow);

        for (int i = 1; i < numRows; i++) {
            List<Integer> currentRow = new ArrayList<>();
            currentRow.add(1);

            for(int j = 1; j < i; j++){
                currentRow.add(result.get(i-1).get(j-1) + result.get(i-1).get(j));
            }
            currentRow.add(1);
            result.add(currentRow);
        }
        return result;
    }
    public static void main(String[] args) {
        int numRows = 5;
        System.out.println(generate(numRows));
    }
}