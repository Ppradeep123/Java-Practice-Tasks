

// Rotate an array right  by k  position.
import java.util.*;
class rotaterightbyk{
	public static void main(String[] args) {
		int arr[]={1,2,3,4,5,6};
		Scanner sc = new Scanner (System.in);
		System.out.println("enter to rotate by position ");
		int k = sc.nextInt();

		int arr2[]=new int[arr.length];

		for(int i=0;i<arr.length-k;i++){
			arr2[i+k]=arr[i];

		}

		for(int i=0;i<k;i++){
			arr2[i]=arr[arr.length-k+i];

		}


		for(int num:arr2){
            System.out.print(num+" ");
		}
	}
}