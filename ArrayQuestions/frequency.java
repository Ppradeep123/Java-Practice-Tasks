// Find the frequency of each element.
import java.util.*;
class frequency{
	public static void main(String[] args) {
		int arr[]={10,20,3,22,3,10,20,20,20};

		frequency(arr);

		hashmap(arr);

	}

	public static void frequency(int arr[]){

		for(int i=0;i<arr.length;i++){
			boolean alreadychecked=false;
			int count=1;

           for(int k=0;k<i;k++){
           	if(arr[i]==arr[k]){
           		alreadychecked=true;
           	}
           }
           if(alreadychecked){
           	continue;
           }
			for(int j=i+1;j<arr.length;j++){

				if(arr[i]==arr[j]){
					count++;
				}

			}
			System.out.println("freauency of "+ arr[i] +"   ==   "+ count);
		}

	}
	public static void hashmap(int arr[]){

		HashMap<Integer,Integer> map =new HashMap<>();

		for(int num:arr){

			if(map.containsKey(num)){
				map.put(num,map.get(num)+1);
			}
			else{
				map.put(num,1);
			}
		}
		for (int key : map.keySet()) {
            System.out.println("Frequency of " + key + " = " + map.get(key));
        }
	}
}