import java.util.Scanner;
class Primee{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no");
		int num = sc.nextInt();
		int count=0;

	    for (int i=1;i<=num ;i++ ) {
	       if (num%i ==0) {
	       	   count++ ;
	        	
	        } 
	    }
	    if (count==2) {
	    	System.out.println("its a prime number");
	    	
	    }
	    else {
	    	System.out.println("its not a prime no");
	    }
	}
}