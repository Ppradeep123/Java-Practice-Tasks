// 1. Find the index of a given element in an array.

import java.util.*;
class findindex{
	public static void main(String[] args) {
		int arr[]={
			10,20,30,40,50,60
		};

		Scanner sc= new Scanner(System.in);
		System.out.println("enter the target");
		int target=sc.nextInt();

		int result = findindex(arr,target);
		if(result != -1){
			System.out.println(result);
		}
		else{
			System.out.println("not found");
		}

	}

	public static int findindex(int arr[] ,int target){

		

		for(int i=0;i<arr.length;i++){
			if(arr[i]==target){

                return i;
				
			}
		}
		return -1;
		
	}
}