import java.util.Scanner;
class EvenOddCt{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter no");
		int num = sc.nextInt();
		int count=0;
		int ld=0;

		while(num!=0){
			ld = num%10 ;
			if(ld % 2==0){
				count++;

			}
			num=num/10;
		}

			if(count%2==0){
				System.out.println("even");
			}
			else{
				System.out.println("odd ");
			}


		
	}
}