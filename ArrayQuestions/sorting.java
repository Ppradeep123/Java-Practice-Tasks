// Sort an array containing only 0s, 1s and 2s without using built-in sorting.

class sorting{
	public static void main(String[] args) {
		int arr[]={1,0,2,0,1,0,2,0,1,1,0,2};

		sorting(arr);System.out.println();
		dutch(arr);

	}

	public static void sorting(int arr[]){
           
          int count0=0;
          int count1=0;
          int count2=0;

          for(int i=0;i<arr.length;i++){

          	if(arr[i]==0){
          	count0++;
          	}
          	else if(arr[i]==1){
          		count1++;
          	}
          	else if(arr[i]==2){
          		{count2++;}
          	}
          }
         
             // Place 0s
        int index = 0;

        while (count0 > 0) {
            arr[index] = 0;
            index++;
            count0--;
        }

        // Place 1s
        while (count1 > 0) {
            arr[index] = 1;
            index++;
            count1--;
        }

        // Place 2s
        while (count2 > 0) {
            arr[index] = 2;
            index++;
            count2--;
        }

        // Print sorted array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

	
}



// dutch National flag Algorithm 
// use low mid and high 
// low for first element mid for current element and high for last 

public static void dutch(int arr[]){

	int low=0;
	int mid=0;
	int high = arr.length-1;

	while(mid<=high){

		if(arr[mid]==0){
			int temp = arr[low];
			arr[low]=arr[mid];
            arr[mid]=temp;

            low++;
            mid++;
		}
		else if(arr[mid]==1){
			mid++;

		}
		else{

			int temp=arr[high];
			arr[high]=arr[mid];
			arr[mid]=temp;

			high--;
		}
	}

	for(int num:arr){
		System.out.print(num+" ");
	}
}
}