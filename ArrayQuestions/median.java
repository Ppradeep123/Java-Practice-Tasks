// Find the median of two sorted arrays.
import java.util.*;
class median{
	public static void main(String[] args) {
		int arr1[]={
			1,2,8
		};
		int arr2[]={4,5,6};

		bruteForceApproach(arr1,arr2);

	}

	public static void bruteForceApproach(int arr1[] ,int arr2[]){

        int arr3[] = new int[arr1.length + arr2.length];

        int k = 0;

        for(int i = 0; i < arr1.length; i++) {
            arr3[k] = arr1[i];
            k++;
        }

        for(int i = 0; i < arr2.length; i++) {
            arr3[k] = arr2[i];
            k++;
        }

        Arrays.sort(arr3);

        int n = arr3.length;
        double median;

        if(n % 2 == 0) {
            median = (arr3[n/2 - 1] + arr3[n/2]) / 2.0;
        } else {
            median = arr3[n/2];
        }

        System.out.println("Median: " + median);
	}
}