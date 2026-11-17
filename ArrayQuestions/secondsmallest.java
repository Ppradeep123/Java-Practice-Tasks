class secondsmallest {
    public static void main(String[] args) {

        int arr[] = {1, 2, 5, 4, 70, 8, 2};

        int smallest = Integer.MAX_VALUE;
        int secondsmallest = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < smallest) {
                secondsmallest = smallest;
                smallest = arr[i];
            }
            else if (arr[i] < secondsmallest && arr[i] != smallest) {
                secondsmallest = arr[i];
            }
        }

        if (secondsmallest == Integer.MAX_VALUE) {
            System.out.println("Second smallest distinct element does not exist");
        } else {
            System.out.println("Second smallest number is " + secondsmallest);
        }
    }
}