public class QuickSort {

    public static void quickSort(int[] arr, int start, int end) {
        if (start < end) {
            int partitionIdx = partition(arr, start, end);

            quickSort(arr, start, partitionIdx-1);
            quickSort(arr,partitionIdx+1, end);
        }
    }

    public static int partition(int[] arr, int start, int end) {

        int pivot = arr[end];

        int k = (start-1); // pointer for greater elems

        for(int i = start; i < end; i++) {
            if (arr[i] <= pivot) {
                k++;

                int temp = arr[k];
                arr[k] = arr[i];
                arr[i] = temp;
            }
        }

        int swap = arr[k+1];
        arr[k+1] = arr[end];
        arr[end] = swap;

        return (k+1);
    }

    public static void main(String[] args) {
        int[] arr1 = new int[] {20, 6, 8, 53, 56, 23, 87, 41, 49, 19};
        quickSort(arr1, 0, arr1.length-1);

        for (int x : arr1) {
            System.out.print(x + " ");
        }
    }
}