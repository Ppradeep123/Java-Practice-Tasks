// Find the second-largest element without sorting

class secondlargest{
	public static void main(String[] args) {
		int arr[] = {10, 10, 5, 8, 3};

		int largest=Integer.MIN_VALUE;
		int secondlg=Integer.MIN_VALUE;

		for(int i=0;i<arr.length;i++){
			if(arr[i]>largest){
			 secondlg=largest;
			 largest=arr[i];

			}
			else if(arr[i]>secondlg  && arr[i]!=largest){
				secondlg=arr[i];
			}
		}
		if(secondlg==Integer.MIN_VALUE){
			System.out.println("there is no second largest no in array");
		}
		else{
		System.out.println("Second largest no in array is " + secondlg);}
	}
}