package Day5.searching;

public class Binary_search {
    public static void main(String args[]) {

        int arr[] = { 10, 20, 30, 40, 50, 60, 70, 80 };

        int target = 80;
        int low = 0;
        int high = arr.length - 1;
        boolean found = false;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                System.out.println("target is found");
                found = true;
                break;
            } else if (arr[mid] < target) {
                low = mid + 1;

            } else {
                high = mid - 1;
            }
        }
        if (!found) {
            System.out.println("out of array");
        }
    }

}
