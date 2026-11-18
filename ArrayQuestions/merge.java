// Merge two arrays into a third array.


class merge {
	public static void main(String[] args) {
		int arr1[] = {1, 2, 3};
        int arr2[] = {4, 5, 6};
        int arr3[] = new int[arr1.length+arr2.length];
        int index=0;
        for(int i=0;i<arr1.length;i++){
        	arr3[index]=arr1[i];
        	index++;
        }
        for(int i=0;i<arr2.length;i++){
        	arr3[index]=arr2[i];
        	index++;
        }


        for(int num:arr3){
        	System.out.println(num+" ");
        }
	}
}