import java.util.*;
class firstrepeating {

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5, 3, 9, 5,5};

        firstRepeating(arr);
        hashset(arr);
    }

    public static void firstRepeating(int arr[]) {

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] == arr[j]) {

                    System.out.println(arr[i] + " is first repeating element");
                    return;
                }
            }
        }
    }

    public static void hashset(int arr[]){

    	HashSet<Integer> set = new HashSet<>();

    	for(int num : arr){
    		if(!set.add(num)){
    			System.out.println(num + " is first repeating element");
    			return;
    		}
    	}
    }
}