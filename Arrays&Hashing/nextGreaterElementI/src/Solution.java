import java.util.HashMap;
import java.util.Stack;

public class Solution {
    /**
     * For each 0 <= i < nums1.length, find the index j such that nums1[i] == nums2[j] and determine the next greater element of nums2[j] in nums2.
     * If there is no next greater element, then the answer for this query is -1.
     * @param nums1<Integer> - nums1 is a subset of nums2
     * @param nums2<Integer> - an integer array, where all the integers are unique.
     * @return int[] - an integer array, ans, that is the same length as nums1, and ans[i] is the next greater element
     */
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] nextGreaterElems = new int[nums1.length];
        Stack<Integer> stack = new Stack<>();
        HashMap<Integer, Integer> numMap = new HashMap<>();

        for (int i = 0; i < nums2.length; i++) {
            while(!stack.isEmpty() && stack.lastElement() < nums2[i]) {
                numMap.put(stack.pop(), nums2[i]);
            }

            stack.push(nums2[i]);
        }

        while(!stack.isEmpty()) {
            numMap.put(stack.pop(), -1);
        }

        for(int j = 0; j < nums1.length; j++) {
            nextGreaterElems[j] = numMap.get(nums1[j]);
        }

        return nextGreaterElems;
    }
    public static void main(String[] args) {
        int[] nums1 = {2,4}, nums2 = {1,2,3,4};
        int[] nextGreaterElemsArr = nextGreaterElement(nums1, nums2);
        for (int num: nextGreaterElemsArr) {
            System.out.print(num + " ");
        }
    }
}