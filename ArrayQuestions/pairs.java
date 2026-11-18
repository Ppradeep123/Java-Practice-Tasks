// Find all pairs whose sum equals a given target.
import java.util.*;

class pairs{
	public static void main(String[] args) {
		int arr[]={2, 4, 3, 5, 7, 8, 1};
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the target");
		int target=sc.nextInt();

		pairs(arr,target);
		System.out.println("below answer is using hashset collection methods");
		hashset(arr,target);
}
 
   public static void pairs(int arr[],int target){

   	for(int i=0;i<arr.length;i++){
   		for(int j=i+1;j<arr.length;j++){

   		    int sum=arr[i]+arr[j];
   		    if(sum==target){
   		    	System.out.println("("+arr[i]+","+arr[j]+")");
   		    	
   		    }
   		}
   	}
   }

   public static void hashset(int arr[],int target){

   	HashSet<Integer> set = new HashSet<>();

   	for(int num:arr){
   		int compliment= target - num;

   		if(set.contains(compliment)){

   			System.out.println("("+ num +","+compliment+")");

   		}
   		set.add(num);
   	}
   }
}