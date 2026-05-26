import java.util.Arrays;

public class InsertionSortt {

    public static void insertion(int[] arr){
        //it is an important technique to remember
        for (int i = 1; i < arr.length ; i++) {
            int j= i - 1;

            int key = arr[i];
            //we are using while becoz we want it to try while the conditon is true 
            while (j>=0 && arr[j] > key ) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }
    public static void main(String[] args) {
        int[] arr = {2,44,67,5};
       insertion(arr);
       System.out.println(Arrays.toString(arr));
    }
}
