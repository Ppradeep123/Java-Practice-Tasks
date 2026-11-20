// Find the subarray with a given sum.

class subarray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 8, 6, 7, 9, 2,3};
        subarray(arr);            // Brute Force approach
        
        slidingWindow(arr);   // using sliding Window approach

        
    }

    public static void subarray(int arr[]) {
        
       int target = 14;

        for (int i = 0; i < arr.length; i++) {

        	int sum=0;

             for(int j=i;j<arr.length;j++){


             	sum+=arr[j];

             	if(sum==target){
                    
                    for(int k=i;k<=j;k++){
                    	System.out.println(arr[k]);
                    }

             	System.out.println();

             	}

             }
        }

        
    }

    public static void slidingWindow(int arr[]){

    	int target=14;
        int left = 0;
        int sum=0;

    	for(int i=0;i<arr.length;i++){
             
             sum+=arr[i];

               while(sum > target && left<=i){
               	sum-=arr[left];
               	left++;
               }

               if(sum==target){
               	for(int k=left;k<=i;k++){
               		System.out.println(arr[k]);
               	}
               	System.out.println();
               }
    		

    	}
    }

  
}