
//Write a Java program to find the largest digit in a given number
import java.util.*;

class largestdig {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number");
		int num = sc.nextInt();

		int result=largest(num);
		System.out.println(result);
	}

	static int largest(int num){
		int max=0;

		while(num!=0){
			int dig = num%10;
			if(dig>max){
				max=dig;
			}
			num=num/10;
		}
       return max;
	}
}