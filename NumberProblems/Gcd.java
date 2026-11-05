// Write a Java program to find the GCD (HCF) of two numbers.
import java.util.*;
class Gcd{
	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter the first number");
		int a = sc.nextInt();
System.out.println("Enter the number second");
int b= sc.nextInt();
		check(a,b);
         othermethod(a,b);
	}
	public static void check(int a,int b){
		int min = (a<b)?a:b;
		int gcd = 1;

		for(int i=1;i<=min;i++){
			if(a%i==0 && b%i==0){
                gcd=i;
			}
		}
		System.out.println(gcd);
	}

// this is first method using for loop 
//check mininum first from two number then add it to minimunm then use loop iteration upto that minimum value 
//beacuse the gcd is not greater than minimun 
// value and use if for both i is that i divide both no with remainder 0 then add it to gcd and result we get Gcd

//.........using while loop and using remainder 
// Eculidean Method .........
public static void othermethod(int a , int b){

while(b!=0){

	int rem = a%b;
	a=b;
	b= rem;
}
System.out.println(a);

}
}