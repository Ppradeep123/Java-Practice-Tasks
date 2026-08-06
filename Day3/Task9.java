package Day3;

import java.util.*;

// count number of digits
public class Task9 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your number");
        int num = sc.nextInt();
        int count = 0;

        for (; num != 0; num /= 10) {

            count++;

        }
        System.out.println(count);
        sc.close();

    }
}
