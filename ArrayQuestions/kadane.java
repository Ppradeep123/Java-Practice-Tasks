

// find the maximum sum of a contiguous subarray (Kadane's Algorithm).

class kadane{

	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4, 5};

		int currentSum=arr[0];
		int maxSum=arr[0];

		for(int i=1;i<arr.length;i++){

			if(arr[i]>currentSum+arr[i]){
				currentSum=arr[i];
			}
			else{
				currentSum=currentSum+arr[i];
			}

			if(currentSum>maxSum){
				maxSum=currentSum;
			}

		}
		System.out.println(maxSum);

	}
}