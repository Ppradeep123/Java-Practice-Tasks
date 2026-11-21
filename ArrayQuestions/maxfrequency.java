//Find the maximum frequency element. 
import java.util.*;
class maxfrequency {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,4,2,13,5,21,2,3,5,9,1,2,1,3,5,4,2,3,5,4,2,5};
        maxfrequency(arr);
        hashmap(arr);
    }
    public static void maxfrequency(int arr[]) {
        int max = 0;
        int maxElement = 0;
        for(int i = 0; i < arr.length; i++) {
            int count = 1;
            boolean alreadychecked = false;
            for(int k = 0; k < i; k++) {
                if(arr[i] == arr[k]) {
                    alreadychecked = true;
                }
            }
            if(alreadychecked) {
                continue;
            }
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] == arr[j]) {
                    count++;
                }
            }
            if(count > max) {
                max = count;
                maxElement = arr[i];
            }
        }
        System.out.println("Maximum frequency element: " + maxElement);
        System.out.println("Frequency: " + max);
    }

    public static void hashmap(int arr[]){

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num :arr){

            map.put(num,map.getOrDefault(num,0)+1);
        }
int max=0;
int maxElement=0;

for(Map.Entry<Integer,Integer> entry : map.entrySet()){

    if(entry.getValue()> max){

        max=entry.getValue();
        maxElement=entry.getKey();

    }
}

System.out.println("max frequency element is " + maxElement );
System.out.println("frequency is "+max);

    }


}