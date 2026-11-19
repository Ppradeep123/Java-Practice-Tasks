// Find the majority element in this array:

// majority means the element that occurs more than arr lenghts of half 
// for example 

//if arr has 6 elements and it has 2 in array for 4 times then 4 is output ......
// if it 6/2 = 3 is any elemnt presnt 3 times then it not coorect it should be greater that 3 

class majority{
	public static void main(String[] args) {
	int arr[] = {7, 7, 7, 2, 3, 7, 4};

	majority(arr);

	boyerMooreVotingAlgorithm(arr);
        

	}

	public static void majority(int arr[]){
		
        int max=(arr.length)/2;
		for(int i=0;i<arr.length;i++){

			int count=1;
			for(int j=i+1;j<arr.length;j++){
                    
                    if(arr[i]==arr[j]){
                    	count++;
                    }
			}
			if(count>max){
				System.out.println("majority element is " + arr[i]);
				   break;
			}

		}

	}

	public static void boyerMooreVotingAlgorithm(int arr[]){

		int candidate=0;
		int count=0;
                                // candidate = The number we currently support.
                                // count = How many votes that number has.
		for(int i=0;i<arr.length;i++){

			if(count==0){
				candidate=arr[i];                                   
			}

			if(arr[i]==candidate){
				count++;
			}
			else{
				count--;

			}
		}
          
         count=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]==candidate){
				count++;
			}
		}
		if(count>arr.length/2){
			System.out.println("majority element is "+ candidate);
		}
		else{
			System.out.println("not found");
		}
	}
}

// Condition	What we do
// count == 0	Select the current number as candidate
// Current number == candidate	Increase count by 1
// Current number != candidate	Decrease count by 1