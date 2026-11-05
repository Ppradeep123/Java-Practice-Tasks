// Write a Java program to find the second-largest digit in a number.
import java.util.*;
class secondlargest{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no");
		int num = sc.nextInt();

		int largest=find(num);
        second(num,largest);
	}

	public static int find(int num){
		int largest=0;
		

		while(num!=0){
			int dig = num%10;
			if(dig>=largest){
				largest = dig;
			}
			num= num/10;
		}
		return largest;

	}
	public static void second(int num,int largest){
         
         int secondlg=0;
         while(num!=0){
         	int dig = num%10;

         	if(dig>=secondlg && dig<largest){
         		secondlg=dig;

         	}
         	num= num/10;
         }

         System.out.println(secondlg+" is second largest digit");
	}
}