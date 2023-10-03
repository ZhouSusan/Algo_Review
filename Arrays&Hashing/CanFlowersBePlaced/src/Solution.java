public class Solution {
    /**
     * Determines if n new flowers can be planted in the flowerbed without violating the no-adjacent-flowers rule.
     * @param flowerbed<Integer> - an integer array containing only 0's or 1's. Where 0 mean empty, and 1 mean not empty.
     * @param n - an integer
     * @return boolean - if n new flowers can be planted in the flowerbed
     */
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(n==0) {
            return true;
        }

        int size = flowerbed.length;
        int counter =0;

        if (size == 1 && flowerbed[0] == 0) {
            return true;
        }

        if (flowerbed[0] == 0 && flowerbed[1] == 0) {
            flowerbed[0] = 1;
            counter++;
        }

        for(int i = 1; i < size; i++) {
            if (i+1< size && flowerbed[i-1] == 0 && flowerbed[i] == 0 && flowerbed[i+1] == 0) {
                flowerbed[i] = 1;
                counter++;
            }
        }

        if (size-2 > 0 && flowerbed[size-2]==0 && flowerbed[size-1] == 0) {
            flowerbed[size-1] = 1;
            counter++;
        }

        return counter >= n;
    }
    public static void main(String[] args) {
        int[] flowerbed = {1,0,0,0,1};
        int n = 2;
        System.out.println(canPlaceFlowers(flowerbed, n));
    }
}