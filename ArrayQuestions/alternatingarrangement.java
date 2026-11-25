// earrange an array in alternating positive and negative order.
import java.util.*;

class alternatingarrangement{
	public static void main(String[] args) {
		int arr[] = {1, 2, 3, -4, -1, 4};

		alternatingarrangement(arr);    	//new array and rwo pointer appraoch


	}

	public static void alternatingarrangement(int arr[]){
 
       List<Integer> pos = new ArrayList<>();
       List<Integer> neg = new ArrayList<>();

       for(int num:arr){
       	if(num>=0){
       		pos.add(num);
       	}
       	else{
       		neg.add(num);
       	}
       }
    
     int index=0;
     int p=0;
     int n=0;
      while(p<pos.size() && n<neg.size()){

      	System.out.println(pos.get(p));
      	System.out.println(neg.get(n));

      	p++;
      	n++;


      }
      while(p<pos.size()){
      	System.out.println(pos.get(p));
      	p++;
      }
       while(n<neg.size()){
      	System.out.println(neg.get(n));
      	n++;
      }

	}
}