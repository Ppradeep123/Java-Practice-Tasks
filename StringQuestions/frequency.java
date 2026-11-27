// Find the frequency of each character.
import java.util.*;
class frequency{
	public static void main(String[] args) {
		String a = "abacchanbhhhhh";

		frequency(a);
        hashmap(a);

	}

	public static void frequency(String a){

		for (int i=0;i<a.length();i++){
			int count=1;
			boolean alreadychecked=false;
             
             for(int k=0;k<i;k++){
             	if(a.charAt(i)==(a.charAt(k)))
				{
					alreadychecked=true;
					break;
				}
             }

             if(alreadychecked){
             	continue;
             }
			for(int j=i+1;j<a.length();j++){
				if(a.charAt(i)==(a.charAt(j)))
				{
					count++;
				}
			}
			System.out.println("frequency of "+a.charAt(i)+"=="+count);
		}
	}
	public static void hashmap(String a){
     
     HashMap<Character,Integer> result=new HashMap<>();

     for(int i=0;i<a.length();i++){

        char ch = a.charAt(i);

     	result.put(ch,result.getOrDefault(ch,0)+1);
     }
		
		for(Map.Entry<Character,Integer>entry:result.entrySet()){
			    System.out.println(entry.getKey() + " = " + entry.getValue());
		}
	}
}