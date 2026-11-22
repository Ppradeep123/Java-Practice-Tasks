class container{
	public static void main(String[] args) {
		int arr[]={1,8,6,2,5,4,8,3,7};

		twopointer(arr);

	}

	public static void twopointer(int arr[]){

		int left=0;
		int right=arr.length-1;
        int max=0;
		while(left<right){

			int width=right-left;

			 int min = Math.min(arr[left],arr[right]);

			int area=width*min;

			if(arr[left]<arr[right]){
				left++;
			}
			else{
				right--;
			}

			if(area>max){
				max=area;
			}

		}
System.out.println(max);
	}
}