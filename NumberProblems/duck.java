// Write a Java program to check whether a number is a Duck number.
import java.util.*;

class duck{
	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter the number ");
	    int num = sc.nextInt();
	    int result =duck(num);
	    if(result==1){
	    	System.out.println("It is not a Duck no");
	    }
	    else{
	    	System.out.println("IT is an Duck NO");
	    }
	}

	public static int duck(int num){

		int count=0;
		int temp= num;

		while(num>0){
			int dig= num%10;
			if(dig==0){
				count++;
			}
			num=num/10;

		}
		while(temp>10){
			temp=temp/10;
		}

		if(count>0 && temp!=0){
			return 1;

		}
		else{
			return 0;
		}
	}
}