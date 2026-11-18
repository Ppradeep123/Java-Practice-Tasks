// Find the missing number from an array containing numbers from 1 to N.

class missingno{

	public static void main(String[] args) {
		int arr[]={1,2,3,4,5,6,8,9};

		missingno(arr);

	}

	public static void missingno(int arr[]){

		int target = 0;
		int total_sum=0;
		int n=arr.length+1;
		int actual_sum= n*(n+1)/2;

		for(int i=0;i<arr.length;i++){

			total_sum=total_sum+arr[i];
		}

		target=actual_sum-total_sum;
		
		System.out.println("the missing no is "+ target);
	}
}