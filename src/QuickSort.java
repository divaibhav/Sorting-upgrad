import java.util.Arrays;

public class QuickSort {
    public void quickSort(int[] arr, int lower, int upper){
        //base case
        if(lower >= upper){
            return;
        }
        //step 2
        int pivotIndex = partition(arr, lower, upper);
        //step 3 left
        quickSort(arr, lower, pivotIndex - 1);
        //step 4 right
        quickSort(arr, pivotIndex + 1, upper);
    }

    public int partition(int[] arr, int lower, int upper) {
        //step 1
        int pivot = arr[lower];

        //step 2
        int down = lower;
        // step 3
        int up = upper;
        //step 4
        while(down < up){
            //step 4.a
            while(arr[down] <= pivot){
                down = down + 1;
            }
            // step 4.b
            while (arr[up] > pivot){
                up = up - 1;
            }
            //step 4.c
            if(down < up){
                //swap

                int temp = arr[down];
                arr[down] = arr[up];
                arr[up] = temp;

            }
        }
        //step 5

        arr[lower] = arr[up];
        arr[up] = pivot;


        //step 6
        return up;
    }

    public static void main(String[] args) {
        int[] arr = {45,23,11,89,77,4};
        System.out.println(Arrays.toString(arr));
        int lower = 0;
        int upper = arr.length - 1;
        QuickSort sort = new QuickSort();
        sort.quickSort(arr, lower, upper);
        System.out.println(Arrays.toString(arr));

    }
    void print(int[] arr, int start, int end) {
        System.out.print("[");
        for (int i = start; i <= end ; i++) {
            System.out.print(arr[i] + ", ");

        }
        System.out.print("]");
        System.out.println();
    }
}
