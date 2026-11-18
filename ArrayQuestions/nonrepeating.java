// Find the first non-repeating element.
import java.util.*;
class nonrepeating{
	public static void main(String[] args) {
		int arr[]={1,1,2,3,5,4,8,2,5};

		nonrepeating(arr);
		hashMap(arr);
	}

	public static void nonrepeating(int arr[]){
       
       for(int i=0;i<arr.length;i++){
       	boolean found = false;
       	for(int j=0;j<arr.length;j++){

       		if( i!=j && arr[i]==arr[j]){
       			found = true ;
       			break;

       		}

       	}
if(!found){
          System.out.println("first non repeating element is "+arr[i]);
          return;
}
       }

	}


	public static void hashMap(int arr[]) {

    HashMap<Integer, Integer> map = new HashMap<>();

    for (int num : arr) {
        map.put(num, map.getOrDefault(num, 0) + 1);
    }

    for (int num : arr) {

        if (map.get(num) == 1) {
            System.out.println(num + " is first non repeating element");
            return;
        }
    }
}
}