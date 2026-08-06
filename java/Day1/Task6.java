package Day1;
// Print addition of two number by taking inputs from users 
import java.util.*;

public class Task6 {
    public static void main(String arg[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number for addition:");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("addition of two number is :" + (a + b));
        sc.close();
    }
}
