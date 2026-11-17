
import java.util.*;

class primeinrange {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the starting range");
        int start = sc.nextInt();

        System.out.println("Enter the ending range");
        int end = sc.nextInt();

        prime(start, end);

        sc.close();
    }

    public static void prime(int start, int end) {

        for (int i = start; i <= end - 2; i++) {

            boolean prime1 = true;
            boolean prime2 = true;

            for (int j = 2; j <= i / 2; j++) {

                if (i % j == 0) {
                    prime1 = false;
                    break;
                }
            }

            for (int j = 2; j <= (i + 2) / 2; j++) {

                if ((i + 2) % j == 0) {
                    prime2 = false;
                    break;
                }
            }

            if (prime1 && prime2) {
                System.out.println(i + " and " + (i + 2));
            }
        }
    }
}
