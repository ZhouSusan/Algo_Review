import java.util.List;

public class Result {
    /**
     * Calculates the absolute difference between the sums of a square matrix's diagonals.
     * @param arr - arr[i][j]: an array of integers
     * @return int - the absolute diagonal difference
     */
    public static int diagonalDifference(List<List<Integer>> arr) {
        int rightDiagonal = 0;
        int leftDiagonal = 0;

        for (int i = 0; i < arr.size(); i++) {
            rightDiagonal += arr.get(arr.size()-1-i).get(i);
            leftDiagonal += arr.get(i).get(i);
        }
        return  Math.abs(leftDiagonal - rightDiagonal);
    }
}