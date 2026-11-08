// Write a Java program to remove all zeroes from a given number.

import java.util.*;
class removezeros{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number ");
		int num = sc.nextInt();

		removezeros(num);

	}

	public static void removezeros(int num){
int result = 0;
int place =1;

while(num>0){

int dig = num%10;
if(dig!=0){
	result = result +(place*dig);
	place= place*10;

}
num=num/10;

}


System.out.println("Number after removing zeros " +  result);		
	}
}