// Write a Java program to check whether a number is a Keith number.
import java.util.*;
class keith{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number");
		int num = sc.nextInt();
keith(num);

	}


	public static void keith(int num){
		int original=num;
		int count=0;
		int temp=num;

		while(num>0){
			count++;
			num/=10;
		}System.out.println(count);
	}
}