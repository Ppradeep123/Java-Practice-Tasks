//Write a Java program to check whether a number is an automorphic number.
import java.util.*;
class automorphic{
	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
System.out.println("enter a no");
		int num = sc.nextInt();
		check(num);

	}
// a natural number whose square ends with the digits of the number itself ex 6^2 =36 the last digit is 6 so it is automorphic no
	public static void check (int num){

      int sqr= num*num;

      int temp=num;
       int count=0;
     while(temp!=0){
     	count++;
     	temp=temp/10;

     }
int div =1;
     for(int i=1;i<=count;i++){
       div = div *10;
     }

     int last=sqr%div;
     if(num==last){
     	System.out.println("it is automorphic no ");
     }
     else{
     	System.out.println("it is not");
     }
	}
}