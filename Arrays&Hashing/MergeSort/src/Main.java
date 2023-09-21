public class Main {
    /**
     * @param nums1 - an array of numbers
     * @param nums2 - an array of numbers
     * @return array - a sorted array of nums1 and nums2 combined
     */
    public static int[] merge(int[] nums1, int[] nums2) {
        int[] sortedArr = new int[nums1.length + nums2.length];
        int i = 0, j = 0, k = 0;

        while (j < nums1.length && k < nums2.length) {
            if (nums1[j] <= nums2[k]) {
                sortedArr[i] = nums1[j];
                j++;
            } else {
                sortedArr[i] = nums2[k];
                k++;
            }

            i++;
        }

        while (j < nums1.length) {
            sortedArr[i] = nums1[j];
            i++;
            j++;
        }

        while (k < nums2.length) {
            sortedArr[i] = nums2[k];
            k++;
            i++;
        }

        return sortedArr;
    }

    /**
     * @param arr - an array of numbers that is unsorted
     * @param startIndex - the start index
     * @param endIndex - the end index
     * @return array - a sorted array
     */
    public static int[] mergeSort(int[] arr, int startIndex, int endIndex) {
        if (arr.length == 0) {
            return new int[] {};
        }
        if (startIndex == endIndex) {
            int[] sortedMergeArr = new int[1];
            sortedMergeArr[0] = arr[startIndex];
            return sortedMergeArr;
        }

        int middle = (endIndex+ startIndex)/2;
        int[] leftArr = mergeSort(arr, startIndex, middle);
        int[] rightArr = mergeSort(arr, middle+ 1, endIndex);
        return merge(leftArr, rightArr);
    }

    public static void main(String[] args) {
        int[] nums1 = {17, 20, 31};
        int[] nums2 = {5, 19, 29};
        int[] merge1 = merge(nums1, nums2);
        for (int num: merge1) {
            System.out.print(num + " ");
        }

        System.out.println();

        int[] arr1 = {6, 20, 8, 19, 56, 23, 87, 41, 49, 53};
        int[] mergedSortArr1 = mergeSort(arr1, 0, arr1.length-1);
        for (int x : mergedSortArr1) {
            System.out.print(x + " ");
        }

    }
}