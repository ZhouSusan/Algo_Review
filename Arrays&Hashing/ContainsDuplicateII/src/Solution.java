import java.util.HashMap;

public class Solution {
    /**
     * Determines if there are duplicates nearby in a given array.
     * @param nums - an array of integers
     * @param k - an integer
     * @return boolean - whether if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k
     */
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int current = nums[i];
            if (map.containsKey(current) && i-map.get(current) <= k) {
                return true;
            } else {
                map.put(current, i);
            }
        }

        return false;
    }
    public static void main(String[] args) {
        int[] nums = {1,0,1,1};
        int k = 1;
        System.out.println(containsNearbyDuplicate(nums, k));
    }
}