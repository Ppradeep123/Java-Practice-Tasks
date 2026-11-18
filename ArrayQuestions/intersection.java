// Find the intersection of two arrays.
class intersection {
	public static void main(String[] args) {
		 int arr1[] = {1, 2, 3, 3, 4, 6};
        int arr2[] = {3, 4, 8, 6, 8, 9, 45};
		for(int i = 0; i < arr1.length; i++) {
			boolean found = false;
			for(int j = 0; j < arr2.length; j++) {
				if(arr1[i] == arr2[j]) {
					found = true;
					break;
				}
			}
			boolean alreadychecked = false;
			for(int k = 0; k < i; k++) {
				if(arr1[i] == arr1[k]) {
					alreadychecked = true;
					break;
				}
			}
			if(found && !alreadychecked) {
				System.out.println(arr1[i]);
			}
		}
	}
}