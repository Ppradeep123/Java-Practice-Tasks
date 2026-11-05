//Write a Java program to check whether a number is a perfect number.

import java.util.Scanner;
class perfect{
	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("enter no");
		int num = sc.nextInt();

		perfect(num);
	}


	public static void perfect(int num){

		int result =0;

		for(int i=1;i<=num;i++){

			if(num%i==0){
				result=result+i;
			}

		}
		if(result==num ){
			System.out.println("perfect");
		}
		else{
			System.out.println("not");
		}
	}
}