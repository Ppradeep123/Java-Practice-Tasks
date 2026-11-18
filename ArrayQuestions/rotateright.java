// Rotate an array right by one position

// Rotate an array left by one position.

class rotateright{
	public static void main(String[] args) {
		int arr[]={1,2,3,4,5,6};
        int last=arr[arr.length-1];
		int arr2[]=new int[arr.length];
        
        arr2[0]=last;
		for(int i=0;i<arr.length-1;i++){
			arr2[i+1]=arr[i];

		}
		

		for(int num:arr2){
			System.out.print(num+" ");
		}
	}
}