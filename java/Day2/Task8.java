package Day2;

import java.util.*;

public class Task8 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1 = sc.nextInt();
        System.out.println("enter the operator +,-,*,/");
        char operator = sc.next().charAt(0);
        System.out.println("Enter the second number");
        int num2 = sc.nextInt();

        switch (operator) {
            case '+':
                System.out.println(num1 + num2);
                break;

            case '-':
                System.out.println(num1 - num2);
                break;
            case '*':
                System.out.println(num1 * num2);
                break;
            case '/':
                System.out.println(num1 / num2);
                break;
            default:
                System.out.println("Invalid Input");
        }
        sc.close();
    }
}
