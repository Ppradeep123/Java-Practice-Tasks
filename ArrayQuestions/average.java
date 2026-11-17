// Calculate the average of array elements.


class average{
	public static void main(String[] args) {
		int arr[]={4,2,3,8};

		int sum=0;

		for(int i=0;i<arr.length;i++){
			sum=sum+arr[i];

		}
		double average=(double) sum/arr.length;

		System.out.println("average of elements in array = "+ average );
	}
}