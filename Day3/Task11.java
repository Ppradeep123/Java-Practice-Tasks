package Day3;

import java.util.*;

public class Task11 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your number");
        int num = sc.nextInt();
        int sum = 0;
        int original = num;
        int count = 0;
        while (num != 0) {
            count++;
            num /= 10;
        }
        num = original;
        while (num != 0) {
            int digit = num % 10;
            sum += (int) Math.pow(digit, count);
            num /= 10;
        }
        if (sum == original) {
            System.out.println("armstrong");
        } else {
            System.out.println("not armstrong");
        }
        sc.close();

    }
}
