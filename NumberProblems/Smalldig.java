//Write a Java program to find the smallest digit in a given number.

import java.util.*;
class Smalldig {

	public static void main(String[] args) {
	
	   Scanner sc= new Scanner (System.in);
	   System.out.println("Enter the number");
	   int num = sc.nextInt();

	   smallest(num);
	}

	public static void smallest(int num){
		int min=9;

		while(num!=0){

			int dig = num%10;
			if(dig<min){
				min=dig;
			}
			num=num/10;
		}

		System.out.println("smallest digit is " + min);
	}
}