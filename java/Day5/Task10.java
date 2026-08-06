package Day5;

public class Task10 {
    public static void main(String args[]) {
        int arr[] = { 45, 88, 964, 4, 54, 2, 5, 1 };
        int max = 0;
        int min = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > min && arr[i] < max) {
                min = arr[i];
            }
        }
        System.out.println(min);

    }
}
