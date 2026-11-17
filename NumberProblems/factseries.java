
import java.util.*;

class factseries {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        long num = 0;
        long sum = 0;

        for (int i = 1; i <= n; i++) {
               int fact=1;
            for (int j=1;j<=i;j++){
                fact=fact*j;
            
            }

            System.out.print(i+"!");

            sum = sum + fact;

            if (i < n) {
                System.out.print(" + ");
            }
        }

        System.out.println();
        System.out.println("Sum = " + sum);

        sc.close();
    }
}
