public class MergeSort {

    public static void merge(int[] leftArr,int[] rightArr, int[] arr,int leftSize, int rightSize){

        int i =0;
        int j =0;// keeping track of left array
        int k = 0; // keeping track of right array

        while(j<leftSize && k<rightSize){

            if(leftArr[j]<rightArr[k]){
                arr[i++] = leftArr[j++];
            }
            else{
                arr[i++] = rightArr[k++];
            }
        }
        while(j<leftSize){
            arr[i++] = leftArr[j++];
        }
        while(k<rightSize){
            arr[i++] = rightArr[k++];
        }
    }

    public static void mergeSort(int [] arr, Integer size){
        if (arr == null || size < 2)
        {
            return;
        }

        int middle = size / 2;
        int [] leftArr = new int[middle];
        int [] rightArr = new int[size-middle];

        int j = 0;
        for(int i = 0;i<size;i++){
            if(i<middle){
                leftArr[i] = arr[i];
            }
            else{
                rightArr[j] = arr[i];
                j++;
            }
        }

        mergeSort(leftArr, middle);
        mergeSort(rightArr,size-middle);
        merge(leftArr, rightArr, arr, middle, size-middle);
    }


    public static void main(String[] args) {

        int [] array = {12, 1, -10, 50, 5, -15, 45};
        mergeSort(array,array.length);
        for(int i =0; i< array.length;++i){
            System.out.print(array[i]+ " ");
        }

        System.out.println();
        int [] array2 = {6, 20, 8, 19, 56, 23, 87, 41, 49, 53};
        mergeSort(array2,array2.length);
        for(int i =0; i< array2.length;++i){
            System.out.print(array2[i]+ " ");
        }
    }
}