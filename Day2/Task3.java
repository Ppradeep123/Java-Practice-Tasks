package Day2;
//Find the larger of two numbers.
import java.util.*;

public class Task3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two  Number");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        if (num1 > num2) {
            System.out.println(num1 + "is greater than" + num2);

        } else {
            System.out.println(num2 + "is greater than" + num1);
        }
        sc.close();
    }
}
