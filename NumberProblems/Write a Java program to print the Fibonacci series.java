// Write a Java program to print the Fibonacci series up to N terms.
//First numbers in the series: \(0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144
// starting from 0 and 1 second no is sum of prevous two no ex 0+1=1 next 1+1= 2 next 2+1= 3 


class fib{
	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("enter a how many numbers");
		int n = sc.nextInt();

		

		show(n);
	}

	public static void show(int n){
        int a=0;
        int b=1;
        int result=0;

		for(int i=1;i<=n;i++){
			System.out.println(a+ " " );
		}
	}
}