
import java.util.*;

class armstrong {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number:");
        int num = sc.nextInt();

        check(num);
    }

    public static void check(int num) {

        int temp = num;
        int count = 0;
        int sum = 0;

        // Count digits
        while(temp != 0) {
            count++;
            temp = temp / 10;
        }

        temp = num; // Reset number

        // Calculate Armstrong sum
        while(temp != 0) {

            int dig = temp % 10;
            int power = 1;

            for(int i = 1; i <= count; i++) {
                power = power * dig;
            }

            sum = sum + power;

            temp = temp / 10;
        }

        System.out.println("Sum = " + sum);

        if(sum == num) {
            System.out.println("Armstrong number");
        }
        else {
            System.out.println("Not an Armstrong number");
        }
    }
}
