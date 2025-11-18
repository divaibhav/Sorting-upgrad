import java.util.Arrays;

public class InsertionSort {
    public static void insertionSort(int[] arr){
        int count = 0;
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];//selecting the next element
            int j = i - 1;// start of sorted partition
            //repeat

            while( j >= 0 && arr[j] > key){
                //System.out.println("Before swap" + Arrays.toString(arr));
                //shift
                arr[j+1] = arr[j];
                count++;
                j = j - 1;

                /*

                //swap logic
                int temp = arr[j + 1];
                arr[j+1] = arr[j];
                arr[j] = temp;
                j = j - 1;


                 */
                System.out.println("After swap" + Arrays.toString(arr));


            }
            arr[j + 1] = key;
        }
        System.out.println("Shift = " + count);
        System.out.println("compare = " + count);

    }
    //count how many swap/shift and comparison happen

    public static void main(String[] args) {
        int[] arr = {8,12,5,7,1};
        System.out.println(Arrays.toString(arr));
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
