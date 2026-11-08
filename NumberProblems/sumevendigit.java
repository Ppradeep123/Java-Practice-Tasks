// Write a Java program to find the sum of even-position digits in a number.
import java.util.*;

class sumevendigit{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number ");
		int num = sc.nextInt();
  
		sum_of_even_digit(num);

		sumofevenpositon_no(num);
       
	}
// there is two question in this same question sum of digit in number which is even ex input:2403  then output = 2+4=6 .....
	public static void sum_of_even_digit(int num){

		int sum=0;

		while(num>0){
			int dig= num%10;
			if(dig%2==0){
				sum=sum+dig;

			}
			num=num/10;
		}
		System.out.println("sum of even digit in number  = " + sum);
	}


// another question is to find the sum of even position digit in number 

	public static void sumofevenpositon_no(int num){

		int sum = 0;
        int count=0;
		while(num>0){
			int dig=num%10;
			if(count%2!=0){
				sum=sum+dig;
			}
			count++;
			num=num/10;
		}

System.out.println("sum of digit at even postion is " + sum);
		
	}
}