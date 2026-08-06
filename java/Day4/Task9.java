package Day4;

public class Task9 {
    static void reverse(int num) {
        int rev = 0;

        for (; num != 0; num /= 10) {
            int digit = num % 10;
            rev = rev * 10 + digit;
        }
        System.out.println(rev);
    }

    public static void main(String args[]) {

        reverse(5655);
    }
}
