

// find the maximum sum of a contiguous subarray (Kadane's Algorithm).

class kadane{

	public static void main(String[] args) {
		int arr[] = {2, -1, 3, -5, 4, 6};

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