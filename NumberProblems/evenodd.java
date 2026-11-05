//Write a Java program to count even and odd digits in a number.
import java.util.*;
class evenodd{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

		System.out.println("Enter a number ");
		int num = sc.nextInt();

		check(num);

	}

	static void check (int num){

		int evencount=0;
		int oddcount=0;

		while(num!=0){
			int dig= num%10;
			if(dig%2==0){
				evencount++;

			}
			else{
				oddcount++;
			}
        num=num/10;
		}
System.out.println("even digit count"+ evencount);
System.out.println("odd digit count"+ oddcount);
	}
}