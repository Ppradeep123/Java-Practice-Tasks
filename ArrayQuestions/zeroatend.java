// Move all zeros to the end of an array.

class zeroatend{
	public static void main(String[] args) {
		int arr[]={0,1,2,0,1,8,6,0,7,2};

		moveZeroAtEnd(arr);

	}

	public static void moveZeroAtEnd(int arr[]){

		int start = 0;

		for(int i=0; i<arr.length;i++){

			if(arr[i]!=0){
				int temp=arr[i];
				arr[i]=arr[start];
				arr[start]=temp;


				start++;
			}
		}

		for(int num:arr){
			System.out.println(num);
		}
	}
}