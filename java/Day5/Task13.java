package Day5;
// print occerance of elements
public class Task13 {
    static void main() {
        int arr[] = { 10, 88, 7, 7, 4, 10 };
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            boolean duplicate = false;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    duplicate = true;
                }

            }
            if (duplicate) {
                continue;
            }
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count += 1;
                }
            }
            System.out.println(arr[i] + " -->" + count);
        }
    }
}
