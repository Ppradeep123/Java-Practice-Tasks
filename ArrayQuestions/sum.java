// Calculate the sum of all array elements

class sum{
	public static void main(String[] args) {
		int arr[]={4,5,6,2,3,1};

		int sum=0;

		for(int i=0;i<arr.length;i++){
			sum=sum+arr[i];
		}

		System.out.println("sum of elements in array = "+ sum );
	}
}