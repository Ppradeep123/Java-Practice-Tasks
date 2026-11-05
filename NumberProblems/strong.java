//Write a Java program to check whether a number is a strong number.
import java.util.*;

class  strong{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("enter a no");
		int num = sc.nextInt();

		check(num);

	}

	public static void check(int num){
		int a = num;
		int sum=0;
       
		while(num!=0){
			int dig = num%10;
			 int fact=1;
			for(int i=1;i<=dig;i++){
				fact = fact*i;
				
			}
			sum=fact+sum;
			num=num/10;

		}
		System.out.println(sum);
		if(sum==a){
			System.out.println("it is a strong number ");
		}
		else{
			System.out.println("it is not strong number");
		}
	}
}