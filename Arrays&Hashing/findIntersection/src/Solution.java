import java.util.HashSet;

public class Solution {
    /**
     * Finding the Intersection
     * @param strArr<String> - an array of two strings. Each string represents a list of comma-separated numbers, sorted in ascending order.
     * @return String - a comma-separated string containing the numbers that occur in elements of strArr in sorted order. If there is no intersection, return string false.
     */
    public static String findIntersection(String[] strArr) {

        HashSet<Integer> firstElementSet = new HashSet<>();
        String[] str1Letters = strArr[0].split(", ");
        String[] str2Letters = strArr[1].split(", ");
        StringBuilder resultStr = new StringBuilder();
        boolean intersectionFound = false;

        for(String s : str1Letters) {
            firstElementSet.add(Integer.parseInt(s));
        }

        for(String s : str2Letters) {
            if (firstElementSet.contains(Integer.parseInt(s))) {
                intersectionFound = true;
                resultStr.append(s).append(",");
            }
        }

        if(!intersectionFound) {
            return "false";
        }

        resultStr = new StringBuilder(resultStr.substring(0, resultStr.length() - 1));
        return resultStr.toString();
    }
    public static void main(String[] args) {
        String[] strArr = {"1, 3, 4, 7, 13", "1, 2, 4, 13, 15"};
        System.out.println(findIntersection(strArr));
    }
}