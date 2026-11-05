// Write a Java program to find the LCM of two numbers.
import java.util.*;
class lcm{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("enter first number ");
		int a= sc.nextInt();
		System.out.println("enter second number ");
		int b= sc.nextInt();

		lcm(a,b);
	}

	public static void lcm(int a, int b){
int tempa= a;
int tempb=b;
		while(b!=0){

	int rem = a%b;       // a%b rem will be absolute if 12 and 18 we use then rem will be 12 

	a=b;              // a=b means a=18 and b=12 
	b= rem;           // then in second iteration 18%12 rem will be 6 
	                 // a= 12 and b=6 in third iteration 12%6 == 0 then loops stops and a=6 which is answer finally 
}
System.out.println(a);
int gcd = a;

int lcm = (tempa*tempb)/gcd;
System.out.println(lcm);

	}
}