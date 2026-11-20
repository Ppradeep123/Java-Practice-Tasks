// Find the smallest missing positive number.
class smallestmissing{
	public static void main(String[] args) {
		int arr[]={1,6,3,8,5};

		smallestmissing(arr);

	}

	   public static void smallestmissing(int arr[]) {

        int missing = 1;

        while (true) {

            boolean found = false;

            for (int i = 0; i < arr.length; i++) {

                if (arr[i] == missing) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Smallest missing positive: " + missing);
                break;
            }

            missing++;
        }
    }
}