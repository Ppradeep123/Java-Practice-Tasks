// Write a Java program to check whether a number is a Spy number.

import java.util.*;
class spy{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

		System.out.println("enter the number");
		int num = sc.nextInt();
		spy(num);

	}

	public static void spy(int num){

		int sum=0;
		int product=1;

		while (num>0){

			int digit= num%10;
			sum=sum+digit;
			product=product*digit;
			num/=10;
		}

		if(sum==product){
			System.out.println("correct , this is a spy no");

		}
		else{
			System.out.println("not correct, this is not spy no");
		}
	}
}