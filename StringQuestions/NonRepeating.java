// Find the first non-repeating character.
import java.util.*;
class NonRepeating{
	public static void main(String[] args) {
		String a ="pradip";

		NonRepeating(a);
		hashmap(a);
	}
	public static void NonRepeating(String a){
		for(int i=0;i<a.length();i++){
			int count=0;
			 for(int j = 0; j < a.length(); j++) {

                if(i != j && a.charAt(i) == a.charAt(j)) {
                    count++;
                    break;
                }
            }
			if(count==0){System.out.println(a.charAt(i));
			break;}
		}
	}
	public static void hashmap(String a ){

		HashMap<Character,Integer> map=new HashMap<>();

		for(int i=0;i<a.length();i++){
           char ch = a.charAt(i);
			map.put(ch,map.getOrDefault(ch,0)+1);
		}

		for(int i = 0; i < a.length(); i++) {

        char ch = a.charAt(i);

        if(map.get(ch) == 1) {
            System.out.println("first repeating character is "+ch);
            return;
        }
    }

		
	}
}