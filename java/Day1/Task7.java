package Day1;
//Swap two numbers.
import java.util.*;

public class Task7 {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number for swapping:");

        int a = sc.nextInt();
        int b = sc.nextInt();

        int temp = a;
        a = b;
        b = temp;


        System.out.println("After swapping first number a is :" + a + "\n second number b is "+ b);

        sc.close();

//second method 
int x=2;
int y=4;
y=x+y;
x=y-x;
y=y-x;

System.out.println("x :"+x + "\n y is "+y);
    }
}
