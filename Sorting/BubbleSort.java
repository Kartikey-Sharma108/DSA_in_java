

import java.util.Arrays;

public class BubbleSort {

    public static void bubble(int[] arr){
       for (int i = 0; i < arr.length - 1; i++) {
          boolean swap = false;
          for (int j = 0; j < arr.length - 1; j++) {
             if (arr[j] > arr[j+1]) {
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
                swap = true;
             }
          }
          if (!swap) {
            break;
          }
       }
    }
    public static void main(String[] args) {
        int[] arr = {2,1,6,45,3};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
}
