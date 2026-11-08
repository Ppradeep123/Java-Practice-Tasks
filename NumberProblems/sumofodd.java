// Write a Java program to find the sum of odd-position digits in a number.

import java.util.*;

class sumofodd{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number ");
		int num = sc.nextInt();
  
		sum_of_odd_digit(num);

		sumofoddpositon_no(num);
       
	}
// there is two question in this same question sum of digit in number which is odd ex input:2403  then output = 2+4=6 .....
	public static void sum_of_odd_digit(int num){

		int sum=0;

		while(num>0){
			int dig= num%10;
			if(dig%2!=0){
				sum=sum+dig;

			}
			num=num/10;
		}
		System.out.println("sum of odd digit in number  = " + sum);
	}


// another question is to find the sum of odd position digit in number 

	public static void sumofoddpositon_no(int num){

		int sum = 0;
        int count=0;
		while(num>0){
			int dig=num%10;
			if(count%2==0){
				sum=sum+dig;
			}
			count++;
			num=num/10;
		}

System.out.println("sum of digit at odd postion is " + sum);
		
	}
}