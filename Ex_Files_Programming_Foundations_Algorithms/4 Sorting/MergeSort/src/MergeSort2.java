public class MergeSort2 {
    public static int[] merge(int[] arr1, int[] arr2) {
        int[] result  = new int[arr1.length+arr2.length];

        int i = 0;
        int l = 0;
        int r = 0;

        while (l < arr1.length && r < arr2.length) {
            if (arr1[l] < arr2[r]) {
                result[i] = arr1[l];
                l++;
                i++;
            } else {
                result[i] = arr2[r];
                r++;
                i++;
            }
        }

        while (l < arr1.length) {
            result[i] = arr1[l];
            l++;
            i++;
        }

        while (r < arr2.length) {
            result[i] = arr2[r];
            r++;
            i++;
        }
        return result;
    }

    public static int[] mergeSort(int[] arr, int firstIdx, int lastIdx) {
        if (firstIdx == lastIdx) {
            int[] sortedArr = new int[1];
            sortedArr[0] = arr[firstIdx];
            return sortedArr;
        }

        int mid = (firstIdx+lastIdx)/2;
        int[] left = mergeSort(arr, firstIdx, mid); // sorting left
        int[] right = mergeSort(arr, mid+1 , lastIdx); // sorting right

        return merge(left, right);
    }


    public static void main (String[] args) {
        int[] arr1 = new int[] {5,3,1,8,7,2,4,2,5,1,2,3,6};
        int[] mergedArr1 = mergeSort(arr1, 0, arr1.length-1);

        for (int num : mergedArr1) {
            System.out.print(num + " ");
        }

        System.out.println();

        int [] arr2 = {6, 20, 8, 19, 56, 23, 87, 41, 49, 53};
        int[] mergedArr2 = mergeSort(arr2, 0, arr2.length-1);

        for (int num : mergedArr2) {
            System.out.print(num + " ");
        }
    }
}
