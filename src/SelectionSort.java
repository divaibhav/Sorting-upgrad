import java.util.Arrays;

public class SelectionSort {
    public static void sort(int[] arr){
        int minIndex = 0;
        for (int i = 0; i <= arr.length - 2; i++) {
            minIndex = i;
            for (int j = i + 1; j < arr.length; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            System.out.println("arr[minIndex] = " + arr[minIndex]);
            //swap
            if(minIndex != i){

                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 14,5,8,16,4,3};
        System.out.println(Arrays.toString(arr));
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
