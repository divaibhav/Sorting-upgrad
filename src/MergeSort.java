import java.util.Arrays;

public class MergeSort {
    static int count, mergeCount;
    public void mergeSort(int[] arr, int low, int high){
        count++;
        //step1 base case
        if(low >= high){
            return;
        }
        //step2 calculate mid
        int mid = (low + high) / 2;
        //step3 sort the left half
        mergeSort(arr, low, mid);
        //print(arr, low, mid, true);
        //step4 sort the right half
        mergeSort(arr, mid + 1, high);
        //print(arr, mid + 1, high, false );
        //step5
        merge(arr, low, mid, high);
    }



    public void merge(int[] arr, int low, int mid, int high) {
       /* mergeCount++;
        System.out.println("-".repeat(50));
        System.out.println("Before Merge");
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
        System.out.println("-".repeat(50));*/
        //step1 create a resulting array
        int[] crr = new int[high + 1];
        //step 2 declare and initialize indexes
        int i = low;
        int j = mid + 1;
        int k = 0;
        //step3 repeat
        while (i <= mid && j <= high){
            //compare
            if(arr[i] <= arr[j]){
                crr[k] = arr[i];
                k = k + 1;
                i = i + 1;
            } else{
                crr[k] = arr[j];
                k = k + 1;
                j = j + 1;
            }
        }
        //step3 check which half is left to fill into crr
        if( i > mid){
            // left partition is completed
            //process right partition
            while( j <= high){
                crr[k] = arr[j];
                k = k + 1;
                j = j + 1;
            }
        } else {
            // right partition is completed
            //process left partition
            while (i <= mid){
                crr[k] = arr[i];
                k = k + 1;
                i = i + 1;
            }
        }
        //step 5 copy crr elements to arr
        int p = 0; // to process crr array

        for (int x = low; x <= high ; x++) {
            arr[x] = crr[p];
            p = p + 1;
        }

      /*  System.out.println("-".repeat(50));
        System.out.println("After Merge");
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
        System.out.println("-".repeat(50));*/

    }

    public static void main(String[] args) {
        int[] arr = SampleData.getIntegerArray(20);
        int low = 0;
        int high = arr.length - 1;
        int[] original = Arrays.copyOf(arr,arr.length);
        MergeSort object = new MergeSort();
        object.mergeSort(arr, low, high);
        System.out.println(Arrays.toString(original));
        System.out.println(Arrays.toString(arr));
        System.out.println("count = " + count);
        System.out.println("mergeCount = " + mergeCount);
    }
    private void print(int[] arr, int start, int end, boolean isLeft) {
        if (isLeft){
            System.out.print("Left => [");
        }
        else {
            System.out.print("Right => [");

        }
        for (int i = start; i <= end ; i++) {
            System.out.print(arr[i] + ", ");

        }
        System.out.print("]");
        System.out.println();
    }
}
//left => []
//right=> []
