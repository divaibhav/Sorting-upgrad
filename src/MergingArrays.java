import java.util.Arrays;

public class MergingArrays {
    // write a program to merge two given sorted arrays
    // into a single sorted array
    // int [] arr1 = {2,8,15,25,30};
    // int[] arr2 = { 3, 7, 11,14,17, 18};
    // output = {2,3,7,8,11,14,15,17, 18,25,30}

    public static void main(String[] args) {
        int [] arr1 = {2,8,15,25,30};
        int[] arr2 = { 3, 7, 11,14,17, 18, 32, 36, 39};

        int[] merge = merge(arr1, arr2);
        System.out.println(Arrays.toString(merge));
    }
    public static int[] merge(int[] arr, int[] brr){
        int[] crr = new int[arr.length + brr.length];
        int i = 0; // index for arr
        int j = 0; // index for brr
        int k = 0; // index for crr
        for (k = 0; k < crr.length && i < arr.length && j < brr.length; k++) {
            if(arr[i] < brr[j]){
                crr[k] = arr[i];
                i++;
            }else{
                crr[k] = brr[j];
                j++;
            }
        }
        // in some cases, either arr or brr's elements are not processed
        //check
        if(i < arr.length){
            System.out.println("arr");
            // arr is not processed
            for( ; i < arr.length; i++){
                crr[k] = arr[i];
                k++;
            }
        }else if(j < brr.length){
            //processing brr
            System.out.println("brr");
            for(; j < brr.length; j++){
                crr[k] = brr[j];
                k++;
            }
        }
        return crr;
    }
}
