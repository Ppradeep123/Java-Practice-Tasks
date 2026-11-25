// Replace every element with the greatest element on its right side.

class replace{
	public static void main(String[] args) {
		int arr[]={16, 17, 4, 3, 5, 2};

		replace(arr);

	}

	public static void replace(int arr[]){

		int right=-1;

		for(int i=arr.length-1;i>=0;i--){

			int temp=arr[i];
			arr[i]=right;

			if(temp>right){
				right=temp;
			}
		}

		for(int num:arr){
			System.out.println(num);
		}
	}
}