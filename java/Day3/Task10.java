package Day3;

//
import java.util.*;

public class Task10 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your number series");
        int num = sc.nextInt();
        int rev = 0;
        int original=num;
        for (; num != 0; num /= 10) {
            int digit = num % 10;
            rev = rev * 10 + digit;
        }
        if (rev == original) {
            System.out.println("palindrome");
        } else {
            System.out.println("not palindrome");
        }
        sc.close();
    }
}
