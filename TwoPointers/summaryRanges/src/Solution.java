import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    /**
     * Returns the smallest sorted list of ranges that cover all the numbers in the array.
     * @param nums - a sorted integer array. All values are unique.
     * @return List<String> - sorted list of ranges
     */
    public static List<String> summaryRanges(int[] nums) {
        List<String> summaryRangeList = new ArrayList<>();
        String ranges = "";

        int i = 0;
        int j = 0;

        while(i < nums.length) {
            j=i;

            while ((j+1<nums.length) && (nums[j]+1 == nums[j+1])) {
                j++;
            }

            if (i == j) {
                summaryRangeList.add(String.valueOf(nums[i]));
                i++;
            } else {
                ranges += nums[i] + "->" + nums[j];
                summaryRangeList.add(ranges);
                j++;
                i=j;
                ranges="";
            }
        }
        return summaryRangeList;
    }
    public static void main(String[] args) {
        int[] nums = {0,1,2,4,5,7};
        System.out.println(summaryRanges(nums));
    }
}