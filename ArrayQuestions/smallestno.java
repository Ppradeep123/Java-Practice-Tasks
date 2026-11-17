// Find the smallest element in an array.

class smallestno{
	public static void main(String[] args) {
		int arr[]={2,5,1,8,9,55};

		int min=arr[1];

		for(int i=0;i<arr.length;i++){
			if(arr[i]<min){
				min=arr[i];

			}
		}
		System.out.println(min);
	}
}