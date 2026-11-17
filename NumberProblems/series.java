
import java.util.*;

class series {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        long num = 0;
        long sum = 0;

        for (int i = 1; i <= n; i++) {

            num = num * 10 + 1;

            System.out.print(num);

            sum = sum + num;

            if (i < n) {
                System.out.print(" + ");
            }
        }

        System.out.println();
        System.out.println("Sum = " + sum);

        sc.close();
    }
}
