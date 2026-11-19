// Find the equilibrium index of an array.

// class equlibrium{
// 	public static void main(String[] args) {
// 		int arr[]={1,2,3,4,2,2,2};

// 		int leftSum=0;
		

// 		for (int i=0;i<arr.length;i++){
//            int rightSum=0;
// 			for(int j=i+1;j<arr.length;j++){
// 				rightSum=rightSum+arr[j];
// 			}

// 			if(leftSum==rightSum){
// 				System.out.println("equlibrium index of  a array is " + i);
// 				break;
// 			}


// 		  leftSum=leftSum +arr[i];

// 		}
// 	}
// }




class equlibrium {
    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 2, 2, 2};

        int totalSum = 0;

        // Calculate total sum
        for (int i = 0; i < arr.length; i++) {
            totalSum = totalSum + arr[i];
        }

        int leftSum = 0;

        for (int i = 0; i < arr.length; i++) {

            int rightSum = totalSum - leftSum - arr[i];

            if (leftSum == rightSum) {
                System.out.println("Equilibrium index = " + i);
                return;
            }

            leftSum = leftSum + arr[i];
        }

        System.out.println("No equilibrium index found");
    }
}
