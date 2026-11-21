// Find the product of array elements except self without division.

class product{

	public static void main(String[] args) {
		int arr[]={1,2,3,4,5};
		product(arr);
		prefixAndSuffix(arr);
	}
	public static void product(int arr[]){

		for(int i=0;i<arr.length;i++){
			int result=1;
			for(int j=0;j<arr.length;j++){

				if(i!=j){

					result=result*arr[j];

				}
			}
			System.out.println(result);
		}
	}
	public static void prefixAndSuffix(int arr[]){

              int result[]= new int[arr.length];
               int prefix=1;
              for(int i=0;i<arr.length;i++){
                  
                  result[i]=prefix;
                  prefix=prefix*arr[i];

              }

              int suffix=1;
              for(int i=arr.length-1;i>=0;i--){

              	result[i]=result[i]*suffix;
              	suffix=suffix*arr[i];
              }

            for(int num:result){
            	System.out.print(num+" ");
            }
	}
}