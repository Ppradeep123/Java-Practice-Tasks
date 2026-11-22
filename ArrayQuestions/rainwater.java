// Find the trapped rainwater between array elements.

class rainwater{
	public static void main(String[] args) {
		int arr[] = {3, 0, 2, 0, 4};

		rainwater(arr);
		optimizedsoln(arr);

	}
	public static void rainwater(int arr[]){
             
int watertrapped=0;
		for(int i=1;i<arr.length-1;i++){
             
           int leftmax=0;
           for(int j=0;j<i;j++){
           	if(arr[j]>leftmax){
           		leftmax=arr[j];
           	}

           }
           int rightmax=0;
           for(int j=arr.length-1;j>i;j--){
           	if(arr[j]>rightmax){
           		rightmax=arr[j];

           	}
           }

         int min = Math.min(leftmax,rightmax)-arr[i];

         watertrapped=watertrapped+min;

		}

		System.out.println( "water trapped is "+ watertrapped +" units");
	}


	public static void optimizedsoln(int arr[]){
        int watertrapped=0;
		int left=0;
		int right=arr.length-1;
		int leftmax=0;
		int rightmax=0;

		while (left<right) {
			  
			  leftmax = Math.max(leftmax,arr[left]);
			  rightmax = Math.max(rightmax,arr[right]);

			  if(leftmax<rightmax){
			  	watertrapped += leftmax-arr[left];
			  	left++;
			  }	
			  else{
			  	watertrapped  += rightmax-arr[right];
			  	right--;
			  }
		}
		System.out.println(watertrapped);
	}
}