// Count positive, negative and zero elements.
class countpositive{
	public static void main(String[] args) {
		int arr[]={1,2,5,6,3,7,8,9,-8,-9,-5,0,0,0,0,0,0};

		count(arr);

	}

	public static void count(int arr[]){

		int countPositive=0;
		int countNegative=0;
		int countZero=0;

		for(int i=0;i<arr.length;i++){
			if(arr[i]>0){
				countPositive++;
			}
			else if(arr[i]<0){
				countNegative++;

			}
			else if(arr[i]==0){
				countZero++;
			}
		}
		System.out.println("positive count = " + countPositive);
		System.out.println("negative count = " + countNegative);
		System.out.println("zero count = " + countZero);
	}
}