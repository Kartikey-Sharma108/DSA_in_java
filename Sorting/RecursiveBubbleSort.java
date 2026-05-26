import java.util.Arrays;
public class RecursiveBubbleSort {

    public static void recursiveBubble(int[] arr,int n){
        boolean swap = false;
        for(int j=0; j<arr.length -1; j++){
            if(arr[j] > arr[j+1]){
            int temp = arr[j+1];
            arr[j+1] = arr[j];
            arr[j] = temp;

            swap = true;
        }
    }
      if (!swap) {
        return;
    }
     recursiveBubble(arr, n - 1);
    }
    public static void main(String[] args) {
        int[] arr = {3,5,22,4,78};
        int n = arr.length;
        recursiveBubble(arr, n);
        System.out.println(Arrays.toString(arr));
    }
}
