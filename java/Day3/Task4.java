
package Day3;
import java.util.*;
// print factorial of number 
public class Task4 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = sc.nextInt();
        int fact = 1;
        for (int i = a; i >= 1; i--) {

            fact = fact * i;
        }
        System.out.println(fact);
        sc.close();
    }
}
