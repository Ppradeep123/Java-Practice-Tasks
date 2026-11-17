 import java.util.*;

 class perfectinrange{

public static void main(String[] args) {
	Scanner sc= new Scanner (System.in);
	System.out.println("enter the range start");
	int start=sc.nextInt();

	System.out.print("enter the end range");
	int end = sc.nextInt();

	perfect(start,end);
}

public static void perfect(int start,int end ){

	for(int i=start;i<=end;i++){

		int sum=0;
		for(int j=1;j<i;j++){
			if(i%j==0){
				sum=sum+j;
			}
		}
		
		if(sum==i){
			System.out.println(i);
		}
	}
}
}