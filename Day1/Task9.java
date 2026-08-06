package Day1;
//Calculate simple interest.
import java.util.*;

public class Task9 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter principle amount");
        float p = sc.nextFloat();
        System.out.println("Enter rate of Interest");
        float r = sc.nextFloat();
        System.out.println("Enter time in years");
        float t = sc.nextFloat();

        float si = (p * r * t) / 100;
        System.out.println("Simple Interest is :" + si);
        sc.close();
    }
}
