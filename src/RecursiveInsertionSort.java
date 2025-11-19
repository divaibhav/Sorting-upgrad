import java.util.Arrays;

public class RecursiveInsertionSort {
    public static void insertionSort(int[] arr, int n){
        //base case
        if(n <= 1){
            return;
        }
        insertionSort(arr, n - 1);
        int last = arr[n - 1];
        int j = n - 2;

        while( j >= 0 && arr[j] > last){
            arr[j+1] = arr[j];
            j = j - 1;
        }
        arr[j+1] = last;
    }

    public static void main(String[] args) {
        int[] arr = {8,12,5,7,1};
        System.out.println(Arrays.toString(arr));
        insertionSort(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
