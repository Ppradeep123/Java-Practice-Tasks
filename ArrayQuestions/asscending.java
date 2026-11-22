// Check whether an array is sorted in ascending order.

class asscending{

	public static void main(String[] args) {
		int arr[]={1,2,8,4,5};
		check(arr);

	}

	public static void check(int arr[]){

		
          
		for(int i=0;i<arr.length-1;i++){
            
            if(arr[i]>arr[i+1]){
            	System.out.println("not asscending");
            	return;
            }			
		}
		System.out.println("asscending");
		
	}
}