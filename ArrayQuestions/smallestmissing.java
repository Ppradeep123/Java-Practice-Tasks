// Find the smallest missing positive number.
class smallestmissing{
	public static void main(String[] args) {
		int arr[]={1,6,3,8,5};

		smallestmissing(arr);

		cyclicSort(arr);

	}

	   public static void smallestmissing(int arr[]) {

        int missing = 1;

        while (true) {

            boolean found = false;

            for (int i = 0; i < arr.length; i++) {

                if (arr[i] == missing) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Smallest missing positive: " + missing);
                break;
            }

            missing++;
        }
    }

    public static void cyclicSort(int arr[]){

    	int i=0;

    	while(i<arr.length){

    		int currentIndex=arr[i]-1;

    		if(arr[i]>=1 && arr[i]<=arr.length && arr[i]!=arr[currentIndex]){

    			int temp=arr[i];
    			arr[i]=arr[currentIndex];
    			arr[currentIndex]= temp;
    		}
    		else{
    			i++;
    		}
    	}
    	 for (int j = 0; j < arr.length; j++) {

            if (arr[j] != j + 1) {
                System.out.println("Smallest missing: " + (j + 1));
                return;
            }
        }

        System.out.println("Smallest missing: " + (arr.length + 1));
    
    }
}