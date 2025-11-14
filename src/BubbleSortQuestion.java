public class BubbleSortQuestion {
    /*
    //WAP to find the minimum number
     of iteration to sort the given array {98,45,2,18,1}
      using bubble sort
     */
    public static int minCount(int[] arr){
        if(arr == null || arr.length == 0){
            System.out.println("null");
            return -1;
        }
        int swapCount = 0;
        for (int i = 0; i < arr.length; i++) {
            swapCount = 0;
            for (int j = 0; j < arr.length - 1; j++) {
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapCount++;
                }
            }
            if(swapCount == 0){
                System.out.println("hello");
                return i;
            }
        }
        return arr.length - 1;
    }

    public static void main(String[] args) {
        int[] arr = new int[0];
        if(arr == null){
            System.out.println(" arr is null");
        }
        int minCount = minCount(arr);
        System.out.println("minCount = " + minCount);
    }
}
