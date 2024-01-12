import java.util.ArrayList;
import java.util.List;

public class Result {
    /**
     * Given a and b, determine their respective comparison points.
     * @param a - array of integers
     * @param b - array of integers
     * @return int[2] - Alice's score is in the first position, and Bob's score is in the second
     */
    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> scores = new ArrayList<>();
        int bobScores = 0;
        int aliceScores = 0;

        for(int i = 0; i < a.size(); i++) {
            if (a.get(i) > b.get(i)) aliceScores++;
            if (a.get(i) < b.get(i)) bobScores++;
        }

        scores.add(aliceScores);
        scores.add(bobScores);
        return scores;
    }
}