import java.util.*;

class mindifference {
	public static void main(String[] args) {
		int arr[] = {
			4,
			6,
			8,
			12,
			45,
			85
		};
		mindifference(arr);
		bestapproach(arr); // if array is already sorted then check only the adjacent elements
		optimizedsoln(arr); // if array is not sorted then 
	}
	public static void mindifference(int arr[]) {
		int min = Integer.MAX_VALUE;
		for(int i = 0; i < arr.length; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				int diff = Math.abs(arr[i] - arr[j]);
				if(diff < min) {
					min = diff;
				}
			}
		}
		System.out.println(min);            // time complexity is o(n^2)
	}
	public static void bestapproach(int arr[]) {
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length - 1; i++) {

            int diff = arr[i + 1] - arr[i];

            if (diff < min) {
                min = diff;
            }
        }
	System.out.println("mininum diiference is " + min);         // time complexity is O(n)
	}

	public static void optimizedsoln(int arr[]){
		int min=Integer.MAX_VALUE;

		Arrays.sort(arr);
          for (int i = 0; i < arr.length - 1; i++) {

            int diff = arr[i + 1] - arr[i];

            if (diff < min) {
                min = diff; 
            }
        }
	    System.out.println("mininum diiference is " + min);        // time complexity is O(n log n)
	

	}
}