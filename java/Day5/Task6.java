package Day5;

// reversed array 
public class Task6 {
    public static void main(String args[]) {
        int arr[] = { 10, 52, 45, 86 };

        int j = 0;
        int rev[] = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            rev[j] = arr[i];
            j++;

        }
        System.out.println("Reversed Array:");

        for (j = 0; j < rev.length; j++) {
            System.out.print(rev[j] + " ");
        }

    }
}
