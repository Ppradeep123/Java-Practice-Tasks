import java.util.*;
class neon {

	public static void main(String arg[]){
		Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number");
		int a = sc.nextInt();
		neon(a);
	}

	public static void neon(int a){

		int sum=0;
		int sqr=a*a;

System.out.println(sqr);
// neon number :
		// square a given number ex 9*9 = 81 
		// sum of digit of product ex 8+1 = 9 so it matches the given value so it is an NEON number 

		while(sqr!=0){
			int dig= sqr%10;
			sum = sum+ dig;
			sqr/=10;
		}
		if(sum==a){
			System.out.println("it is neon number");

		}
		else{
			System.out.println("it is not neon number");
		}

	}
}