package Day5.sorting;

public class bubblesort {
    public void main(String args[]) {
        int arr[] = { 10, 5, 2, 2, 9, 8 };

        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }

            }
        }
        System.out.println("Sorted Array in accending order:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
        System.out.println("Sorted Array in decending order:");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        int max = arr[arr.length - 1];
        System.out.println("");
        System.out.println("larget number in array");
        System.out.println(max);

        int min = arr[0];
        System.out.println("");
        System.out.println("Smallest number is: " + min);

        int secondlarger = arr[arr.length - 2];
        System.out.println("");
        System.out.println("second largest number is: " + secondlarger);

    }
}
