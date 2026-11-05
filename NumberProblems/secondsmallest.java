
import java.util.*;

class secondsmallest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number:");
        int num = sc.nextInt();

        find(num);
    }

    public static void find(int num) {

        int smallest = 10;
        int secondsm = 10;

        while (num != 0) {

            int dig = num % 10;

            if (dig < smallest) {
                secondsm = smallest;
                smallest = dig;
            }
            else if (dig > smallest && dig < secondsm) {
                secondsm = dig;
            }

            num = num / 10;
        }

        if (secondsm == 10) {
            System.out.println("Second smallest distinct digit does not exist");
        } else {
            System.out.println("Second smallest digit = " + secondsm);
        }
    }
}
