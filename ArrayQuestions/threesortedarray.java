
class threesortedarray {

    public static void main(String[] args) {

        int arr1[] = {1, 5, 10, 20, 40, 80};
        int arr2[] = {6, 7, 20, 80, 100};
        int arr3[] = {3, 4, 15, 20, 30, 70, 80};

        threesortedarray(arr1, arr2, arr3);
    }

    public static void threesortedarray(
        int arr1[], int arr2[], int arr3[]) {

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < arr1.length &&
               j < arr2.length &&
               k < arr3.length) {

            if (arr1[i] == arr2[j] &&
                arr2[j] == arr3[k]) {

                System.out.println(arr1[i]);

                i++;
                j++;
                k++;
            }
            else {

                int min = Math.min(arr1[i],
                          Math.min(arr2[j], arr3[k]));

                if (min == arr1[i]) {
                    i++;
                }
                else if (min == arr2[j]) {
                    j++;
                }
                else {
                    k++;
                }
            }
        }
    }
}
