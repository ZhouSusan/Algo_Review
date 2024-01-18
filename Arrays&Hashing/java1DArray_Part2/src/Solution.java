import java.util.Scanner;

public class Solution {

    /**
     * Checks if the game can be won.
     * @param leap - the size of the leap
     * @param game - integer array
     * @return boolean
     */
    public static boolean canWin(int leap, int[] game) {
        if (game == null) return false;
        return isJumpable(leap, game, 0);

    }

    /**
     * Checks if we can jump to the next cell of the array.
     * @param leap - the size of the leap
     * @param game - integer array
     * @param i - index
     * @return boolean
     */
    private static boolean isJumpable(int leap, int[] game, int i) {
        if (i >= game.length) {
            return true;
        } else if(i < 0 || game[i] == 1) {
            return false;
        }

        game[i] = 1;

        return isJumpable(leap, game, i + leap)
                || isJumpable(leap, game, i - 1)
                || isJumpable(leap, game, i+1);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}