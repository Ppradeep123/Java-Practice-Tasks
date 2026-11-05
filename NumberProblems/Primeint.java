import java.util.*;
class Primeint {

	public static void main(String arg[]){
		Scanner sc = new Scanner (System.in);
		

		System.out.println("Enter the number ");
int a = sc.nextInt();
		int result=prime(a);
		if (result==0){
			System.out.println("it is not a prime number ");
		}
		else {
			System.out.println("it is prime number ");
		}

	}

	public static int prime(int a){
int count = 0;
	     if(a<=1){

	     	return 0;

	     }
for (int i=1;i<=a;i++){
       if(a%i==0){
       	count++;

       }

	}
	if(count==2){
		return 1;

	}
	else{
		return 0;
	}
}

}