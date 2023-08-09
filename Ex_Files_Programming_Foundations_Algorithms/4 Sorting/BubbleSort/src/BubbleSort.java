public class BubbleSort {
    public static void bubbleSort(int[] dataSet) {
        if (dataSet == null || dataSet.length <= 1 ) {
            return;
        }
        int size = dataSet.length;
       for (int i = 0; i < size-1; i++) {
           for (int j = 0; j < size-i-1; j++) {
               if (dataSet[j] > dataSet[j+1]) {
                   int temp = dataSet[j];
                   dataSet[j] = dataSet[j+1];
                   dataSet[j+1] = temp;
               }
           }
           System.out.println("\nCurrent dataset: ");
           for (int elem: dataSet) {
               System.out.print(elem + " ");
           }
       }
    }

    public static void main(String[] args) {
        int[] data = { -2, 45, 0, 11, -9 };
        bubbleSort(data);
        System.out.println();
        int[] data2 = {6, 20, 8, 19, 56, 23, 87, 41, 49, 53};
        bubbleSort(data2);
    }
}