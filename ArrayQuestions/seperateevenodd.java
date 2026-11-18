// Separate even and odd elements.


class seperateevenodd{

	public static void main(String[] args) {
		int arr[]={1,2,3,4,5,6,7,8,9};

		seperate(arr);

	}
	public static void seperate(int arr[]){

int start=0;
		for(int i=0;i<arr.length;i++){

			if(arr[i]%2==0){
				int temp=arr[i];
				arr[i]=arr[start];
				arr[start]=temp;

				start++;
			}
		}

		for(int num:arr){
			System.out.println(num+ " ");
		}
	}
}