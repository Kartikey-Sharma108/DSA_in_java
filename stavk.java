import java.util.Scanner;
import java.util.Stack;

public class stavk {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the input value");
        int input = sc.nextInt();
        
    
        for (int i = 0; i < input; i++) {
            s.push(sc.nextInt());
        }

          if (s.indexOf(sc.nextInt()) == 2) {
              s.pop();
              System.out.println("enter the replaceabelle value");
              s.push(sc.nextInt());
           }
        
        // s.push( sc.nextInt());
        // s.push( sc.nextInt());
        // s.push( sc.nextInt());
        // s.push( sc.nextInt());

        System.out.println("dekho pop ho gaya😍😍");
        //pop the element
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
}
