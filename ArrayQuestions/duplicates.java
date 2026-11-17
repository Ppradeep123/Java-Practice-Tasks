// Find duplicate elements in an array.
import java.util.*;
class duplicates{
	public static void main(String[] args) {
		int arr[]={1,2,2,3,4,4,4,5,6};
        
        nestedloop(arr);
        hashset(arr);
	}

	public static void nestedloop(int arr[]){
		for(int i=0;i<arr.length;i++){

             boolean alreadychecked=false;

             for(int k=0;k<i;k++){
             	if (arr[i]==arr[k]){
             		alreadychecked=true;
             	}
             }

             if(alreadychecked){
             	continue;
             }
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]==arr[j]){
					System.out.println("duplicate element = "+ arr[i]);
					break;
				}
			}
		}
	}

	public static void hashset(int arr[]){

		HashSet<Integer> seen = new HashSet <>();
		HashSet<Integer> printed = new HashSet<>();


		for(int num : arr){
			if (!seen.add(num)){
				if(printed.add(num)){
					System.out.println(num);
				}
			}
		}
	}
}