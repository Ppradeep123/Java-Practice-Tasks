import java.util.*;
class Harshad{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int a = sc.nextInt();

		harshad(a);



	}

        void harshad(int a){
		int sum=0;
		int num=a;
		while(a!=0){
             int dig=a%10;
             sum+=dig;
              a/=10;

		}
		if(num%sum==0){
			System.out.println("Harshad Number");
		}
		else{
			System.out.println("Not harshad number");
		}

	}
}