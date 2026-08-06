package Day4;

public class Task8 {
    static void factorial(int a) {
        int fact = 1;
        for (int i = 1; i <= a; i++) {
            fact = fact * i;
        }
        System.out.println(fact);
    }

    public static void main(String args[]) {
        factorial(5);
    }

}
