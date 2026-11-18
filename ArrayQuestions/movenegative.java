// Move all negative elements to the left side.

class movenegative{
	public static void main(String[] args) {
		int arr[]={8,5,6,4,-2,6,-4,5,-9};

		movenegative(arr);
	}
	public static void movenegative(int arr[]){

		int start=0;

		 for (int i = 0; i < arr.length; i++) {

            if (arr[i] < 0) {

                int temp = arr[i];
                arr[i] = arr[start];
                arr[start] = temp;

                start++;
            }
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }
    
	}
}