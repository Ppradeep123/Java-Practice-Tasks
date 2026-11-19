// Find the longest consecutive sequence.

class concesutive{

	public static void main(String[] args) {
		int arr[]={12,2,5,6,8,9,10,11};

		bruteForceApproach(arr);


	}
	public static void bruteForceApproach(int arr[]){

		int longest=0;

		for(int i=0;i<arr.length;i++){

			int current=arr[i];
			int count=1;

			while(true){
				boolean found=false;

				for(int j=0;j<arr.length;j++){
					if(arr[j]==current+1){
						current++;
						count++;
						found=true;
						break;

					}
				}

				if(!found){
					break;
				}
			}
			if (count > longest) {
                longest = count;
            }

		}
		
        

        System.out.println("Longest consecutive sequence length: " + longest);


	}
}