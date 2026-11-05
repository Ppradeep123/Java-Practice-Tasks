//fibonacci no program

import java.util.Scanner;
class Fibo{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter how many fib no you want ");
		int num= sc.nextInt();


	  fibo(num);

	}
	public static void fibo(int num){

		int a=0;
		int b=1;
		for (int i=0;i<=num;i++){
			System.out.println(a+" ");
			int	c=a+b;
			a=b;
		
			b=c;
		}

	}
}