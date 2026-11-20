class maxproduct {
    public static void main(String[] args) {
        int arr[] = {1, 2, 8, 6, 7, 9, 2};
        maxproduct(arr);            // Brute Force approach

        maxproductoptimedsoln(arr); // optimized solution
    }

    public static void maxproduct(int arr[]) {
        int max = Integer.MIN_VALUE;
        int num1 = 0;
        int num2 = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                int product = arr[i] * arr[j];

                if (product > max) {
                    max = product;

                    num1 = arr[i];
                    num2 = arr[j];
                }
            }
        }

        System.out.println("(" + num1+","+num2+")");
  
        System.out.println("Maximum product: " + max);
    }

    public static void maxproductoptimedsoln(int arr[]){

        int largest=Integer.MIN_VALUE;
        int secondlg=Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        int secondsmallest = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){

            if(arr[i]>largest){
                secondlg=largest;
                largest=arr[i];
            }
            else if(arr[i]>secondlg){
                secondlg=arr[i];
            }

            if(arr[i]<smallest){
                secondsmallest=smallest;
                smallest=arr[i];
            }
            else if (arr[i] < secondsmallest) {
            secondsmallest = arr[i];
        }
        }


       int maxproduct = Math.max(largest*secondlg,smallest*secondsmallest);
    	System.out.println(maxproduct);

    }
}