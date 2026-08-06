package Day1;
public class Task10 {
    public static void main(String args[]) {
        // rectangle pattern
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // triangle pattern
        System.out.println();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");

            }
            System.out.println();
        }

        // reverse triangle pattern
        System.out.println();
        for (int i = 5; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
        // number pattern
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();
        // reverse pattern number
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();

        // pattern of same number
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }

        // alphabets pattern

        for (int i = 0; i <= 5; i++) {
            char ch = 'A';
            for (int j = 0; j <= i; j++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
        //Floyd's Triangle pattern
System.out.println();
        int num=1;
        for(int i=0; i<=5 ;i++){
            for(int j=0;j<=i;j++){
                System.out.print(num);
                num++;
            }
            System.out.println();
        }

    }
}
