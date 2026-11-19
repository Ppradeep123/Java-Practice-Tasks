
// Find the leaders in an array
class leaders {
	public static void main(String[] args) {
		int arr[]={5,6,4,2,8,2,4,1,5};
        
        nested(arr);
        System.out.println();
        righttoleftTraversal(arr);

	}
	public static void nested(int arr[]){

		for(int i = 0; i < arr.length; i++) {
			boolean found = false;
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[j] > arr[i]) {
					found = true;
					break;
				}
			}
			if(!found) {
				System.out.println(arr[i]);
			}
		}
	}

	public static void righttoleftTraversal(int arr[]){

		int max=arr[arr.length-1];

		for (int i=arr.length-1;i>=0;i--){

			if (arr[i]>=max){
				max=arr[i];
				System.out.println(arr[i]);
				
			}

		}

	}
}