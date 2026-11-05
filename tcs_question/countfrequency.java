package tcs_question;

public class countfrequency {
    public static void main(String[] args) {

        int arr[] = {22, 5, 8, 4, 9, 6, 52, 5, 8, 4, 9, 6, 52};

        for (int i = 0; i < arr.length; i++) {

            int count = 1;

            // Check if this number appeared before
            boolean alreadyCounted = false;

            for (int k = 0; k < i; k++) {
                if (arr[i] == arr[k]) {
                    alreadyCounted = true;
                    break;
                }
            }

            if (alreadyCounted) {
                continue;
            }

            // Count frequency
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            System.out.println("Frequency of " + arr[i] + " is: " + count);
        }
    }
}