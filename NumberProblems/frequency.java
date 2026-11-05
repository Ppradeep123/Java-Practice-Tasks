
import java.util.*;

class frequency {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = sc.nextInt();

        int temp = num;

        for (int i = 0; i <= 9; i++) {

            int count = 0;
            temp = num;

            while (temp != 0) {

                int dig = temp % 10;

                if (dig == i) {
                    count++;
                }

                temp = temp / 10;
            }

            if (count > 0) {
                System.out.println(i + " appears " + count + " times");
            }
        }
    }
}
