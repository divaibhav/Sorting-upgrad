import java.util.Arrays;
//WAP to find the minimum number of iteration to sort the given array {98,45,2,18,1} using bubble sort
public class BubbleSort {
    public void bubbleSort(int[] arr){
        if(arr!= null) {
            int swapCount = 0;
            //step1
            for (int i = 0; i < arr.length - 1; i++) {
                //step a
                swapCount = 0;
                for (int j = 0; j < arr.length - 1 - i; j++) {
                    //step i
                    System.out.println("Comparing " + arr[j] + " with " + arr[j + 1]);
                    if (arr[j] > arr[j + 1]) {
                        //step ii -> swap
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                        System.out.println("Swapped ->" + Arrays.toString(arr));
                        swapCount++;
                    }

                }
                if (swapCount == 0) {
                    System.out.println("-".repeat(50));
                    System.out.println(i);
                    System.out.println("-".repeat(50));
                    break;
                }
                System.out.println("-".repeat(50));
                System.out.println("After ith pass " + (i + 1) + " -> " + Arrays.toString(arr));

            }
        }
    }

    public static void main(String[] args) {
        BubbleSort obj = new BubbleSort();
        int[] arr = {98,45,2,18,6};
        if(arr.length != 0) {
            obj.bubbleSort(null);
        }
        System.out.println("Sorted");
        System.out.println(Arrays.toString(arr));
    }
}
