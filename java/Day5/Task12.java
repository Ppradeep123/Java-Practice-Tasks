package Day5;
// print duplicate and array without duplicates
public class Task12 {
    public static void main(String args[]) {
        int arr[] = {
                10, 12, 16, 5, 5, 8, 6, 3, 10
        };
        int copy[] = new int[arr.length];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean duplicate = false;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    duplicate = true;
                    copy[count] = arr[i];
                    count += 1;
                    break;
                }

            }
            if (!duplicate) {
                System.out.println(arr[i]);
            }
        }

        for (int i = 0; i < count; i++) {
            System.out.println("duplicates elements from array is :" + " " + copy[i]);
        }
    }
}
