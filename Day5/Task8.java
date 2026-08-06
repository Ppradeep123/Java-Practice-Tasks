package Day5;

public class Task8 {
    public static void main() {
        int arr[] = { 10, 4, 55, 44, 56, 41 };

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                count += 1;
            }
        }
        System.out.println("count of even number is" + count);
        // System.out.print(arr[0]);
    }
}
