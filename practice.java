import java.util.Arrays;
import java.util.Scanner;

public class practice {

    public static void bubbles(int[] arr){
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
           }
    }
    public static void main(String[] args) {
//         int n = 5;
//         Scanner sc = new Scanner(System.in);
//         String[] arr = {"volvo","mazda","toyota","honda"};
//         int index = sc.nextInt();
//        for (int i = 0; i < arr.length - 1; i++) {
//           if(arr.equals(index)){
//           System.out.print(arr[i]);
//           }
//        }
   
         
//         for (int i = 0; i < n ; i++) {
//             System.out.println(i);
//             for (int j = 0; j <= i; j++) {
//                 System.out.print("*");
//             }
//             System.out.println("");
//         }

//         for (int i = 0; i < n; i++) {
//             for (int j = i; j < n; j++) {
//                 System.out.print("*");
//             }
//             System.out.println("");
//         }

//         for (int i = 0; i < n; i++) {
//         for (int k = 0; k < n - i; k++) { //k is for equal spacing 
//             System.out.print(" ");
//         }
//             for (int j = 0; j <= 2*i ; j++) {
//                 System.out.print("*");
//             }
        
//             System.out.println("");
//     }

//     int[] maths = new int[20];
//     int[] phy = new int[20]; //value1 12,13,15,10,18,7,32,26,24,3,10,17,30,10,50,13,9,11,21,20
//     int[] chem = new int[20];

//     int[] arr2 = {12,13,15,10,18,7,32,26,24,3,10,17,30,10,50,13,9,11,21,20};
//     for (int i = 0; i < arr2.length; i++) {
//         phy[i] = arr2[i];
//     }
//     for (int i = 0; i < phy.length; i++) {
//         System.out.println(phy[i]);
//     }
   
//     for (int i = 0; i < chem.length; i++) {
//         chem[i] = sc.nextInt();
//     }
//     for (int i = 0; i < chem.length; i++) {
//         System.out.print(chem[i]);
//     }

//     System.out.println("please enter the number/marks");
//      int num = sc.nextInt();
//     for (int i = 0; i < phy.length; i++) {
//         if(phy[i] <= num){
//             System.out.println(i);
//         }
//     }

//  int[] arr3 = new int[10];
//         for (int i = 0; i < arr3.length; i++) {
//             arr3[i] = sc.nextInt();
//         }
//         for (int i = 0; i < arr3.length - 1 ; i++) {
//             if(arr3[i] > arr3[i+1]  ){ 
//                 int temp = arr3[i];
//                 arr3[i] = arr3[i+1];
//                 arr3[i+1] = temp;
//             }
//         }
//             System.out.println(arr3[9]);

       int[] arr = {3,5,1,2,8};
       bubbles(arr);
       System.out.println(Arrays.toString(arr));
    }}

