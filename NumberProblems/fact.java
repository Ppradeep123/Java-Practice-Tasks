//Write a Java program to print all factors of a given number.
import java.util.*;

class fact{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter an no");

		int num = sc.nextInt();

		fact(num);

	}
	public static void fact(int num){

		int result = 1;

		for(int i=1;i<=num;i++){

			
			result=result*i;

		}
		System.out.println("fact"+result);

	}
}