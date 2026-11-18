// Find the union of two arrays without duplicates.
import java.util.*;
class union{
	public static void main(String[] args) {
		int arr1[] = {1, 2, 3, 3, 4, 6};
        int arr2[] = {3, 4, 8, 6, 8, 9, 45};
        System.out.println("using nestned loop");
        union(arr1,arr2);
        System.out.println();
        System.out.println("using hashset ");
        hashset(arr1,arr2);

     }
  public static void union(int arr1[],int arr2[]){

  	   for(int i = 0; i < arr1.length; i++) {
  	boolean duplicates = false;
  	for(int j = 0; j < i; j++) {
  		if(arr1[i] == arr1[j]) {
  			duplicates = true;
  			break;
  		}
  	}
  	if(!duplicates) {
  		System.out.print(arr1[i] + " ");
  	}
  }
  for(int i = 0; i < arr2.length; i++) {
  	boolean found = false;
  	for(int j = 0; j < arr1.length; j++) {
  		if(arr1[j] == arr2[i]) {
  			found = true;
  			break;
  		}
  	}
  	boolean duplicate = false;
  	for(int j = 0; j < i; j++) {
  		if(arr2[i] == arr2[j]) {
  			duplicate = true;
  			break;
  		}
  	}
  	if(!found && !duplicate) {
  		System.out.print(arr2[i] + " ");
  	}
  }
  }
  

 
public static void hashset(int arr1[],int arr2[]){

	HashSet<Integer> set = new HashSet<>();

	for(int num:arr1){
		set.add(num);
	}
	for(int num:arr2){
		set.add(num);
	}

	for(int num:set){
		System.out.print(num + " ");
	}
}





}