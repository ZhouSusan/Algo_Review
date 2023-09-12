public class Solution {

    /**
     * Given an array of ints representing page numbers
     * return a string with the page numbers formatted as page ranges when the nums
     * span a consecutive range.
     * @param pages<number> - an array of numbers, Page numbers
     * @return string - the given page numbers as comma separated hyphenated pages ranges.
     */
    public static String bookIndex(int[] pages) {
        if (pages == null || pages.length == 0) {
            return "";
        }

        if (pages.length == 1) {
            return String.valueOf(pages[0]);
        }

        StringBuilder sb = new StringBuilder();
        int start = pages[0];
        for (int i = 1; i < pages.length; i++) {
            if (pages[i] != pages[i - 1] + 1) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                if (start == pages[i - 1]) {
                    sb.append(start);
                } else {
                    sb.append(start).append("-").append(pages[i - 1]);
                }
                start = pages[i];
            }
        }
        if (sb.length() > 0) {
            sb.append(", ");
        }
        if (start == pages[pages.length - 1]) {
            sb.append(start);
        } else {
            sb.append(start).append("-").append(pages[pages.length - 1]);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 13, 14, 15, 37, 38, 70};
        System.out.println(bookIndex(nums1));
        int[] nums2 = {5, 6, 7, 8, 9};
        System.out.println(bookIndex(nums2));
    }
}