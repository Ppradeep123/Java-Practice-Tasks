// Write a Java program to convert a decimal number into binary without using built-in conversion methods.
import java.util.*;
class binary{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no");
		int num = sc.nextInt();

		binary(num);
	}
	public static void binary(int num){
      int binary=0;
      int place=1;

      while(num>0){
      	int rem = num%2;
      	binary = binary +(rem*place);
      	num= num/2;
      	place = place * 10 ;
      }
      System.out.println(binary);

	}
}