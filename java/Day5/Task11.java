package Day5;
// print duplicate from array 
public class Task11 {
    public static void main(String args[]) {

        int arr[] = { 10, 15, 2, 2, 2, 2, 55, 15, 10, 89 };

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                    break;
                }
            }
        }

    }
}
