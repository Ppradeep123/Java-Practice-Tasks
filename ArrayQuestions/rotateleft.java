// Rotate an array left by one position.

class rotateleft{
	public static void main(String[] args) {
		int arr[]={1,2,3,4,5,6};
        int first=arr[0];
		int arr2[]=new int[arr.length];
        
		for(int i=0;i<arr.length-1;i++){
			arr2[i]=arr[i+1];

		}
		arr2[arr.length-1]=first;

		for(int num:arr2){
			System.out.print(num+" ");
		}
	}
}