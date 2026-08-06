package Day5;

public class Task4 {
    static int findmax(int arr[]) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String args[]) {
        int marks[] = { 10, 54, 86, 75, 95, 2 };
        int result = findmax(marks);
        System.out.print(result);
    }

}
