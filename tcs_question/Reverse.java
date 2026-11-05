package tcs_question;

public class Reverse {
    public static void main(String[] args) {

        int arr[] = {22, 5, 8, 4, 9, 6, 52};

        int n = arr.length;

        for (int i = 0; i < n / 2; i++) {

            int temp = arr[i];
            arr[i] = arr[n - 1 - i];
            arr[n - 1 - i] = temp;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}