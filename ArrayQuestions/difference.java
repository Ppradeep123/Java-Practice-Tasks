// Find the maximum difference between two array elements where the larger element comes after the smaller element

class difference{
	public static void main(String[] args) {
		int arr[] = {2, 3, 10, 6, 4, 8, 1};

		difference(arr);
		diff(arr);

	}

	public static void difference(int arr[]){
int max=0;
		for(int i=0;i<arr.length;i++){

			
			for(int j=i+1;j<arr.length;j++){
                
                if(arr[j]>arr[i]){
                	int diff= arr[j]-arr[i];
                	if(diff>max){
                		max=diff;
                	}
                }
			}

		}
		System.out.println(max);

	}
	public static void diff(int arr[]) {

    int min = arr[0];
    int maxDiff = Integer.MIN_VALUE;

    for (int i = 1; i < arr.length; i++) {

        int diff = arr[i] - min;

        if (diff > maxDiff) {
            maxDiff = diff;
        }

        if (arr[i] < min) {
            min = arr[i];
        }
    }

    System.out.println(maxDiff);
}
}