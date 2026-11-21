// Find the maximum profit from buying and selling a stock once. 

class maxprofit{

	public static void main(String[] args) {
		int arr[]={7,5,1,6,8,2};

		maxprofit(arr);
		optimizedsoln(arr);
	}

	public static void maxprofit(int arr[]){

		int max=0;

		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
                  
                  int profit = arr[j]-arr[i];
                  if(profit>max){
                       
                       max=profit;
                  }      

			}
		}
		System.out.println(max);
	}
	public static void optimizedsoln(int arr[]){

		int min=arr[0];
		int maxprofit=0;

		for(int i=1;i<arr.length;i++){

			int profit=arr[i]-min;
			if(profit>maxprofit){
                  
                maxprofit=profit;
			}
			if(arr[i]<min){

				min=arr[i];

			}

		}
		System.out.println(maxprofit);
	}
}