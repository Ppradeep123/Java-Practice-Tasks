import java.util.*;
class Prime {

	public static void main(String arg[]){
		Scanner sc = new Scanner (System.in);
		

		System.out.println("Enter the number ");
int a = sc.nextInt();
		prime(a);

	}

	public static void prime(int a){
int count = 0;
	     if(a<=1){
	     	System.out.println("this is not a prime number ");
	     	return;

	     }
for (int i=1;i<=a;i++){
       if(a%i==0){
       	count++;

       }

	}
	if(count==2){
		System.out.println("it is a prime number ");

	}
	else{
		System.out.println("it is not prime no");
	}
}

}