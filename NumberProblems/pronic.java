// write a program to checck pronic number 
// 6 then check in this nuber is the product of any consecutive like 2*3 consecutive means 2 then 3 then 4 like it 
import java.util.*;
class pronic {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int num = sc.nextInt();
		pronic(num);
	}
	public static void pronic(int num) {
		int temp = num;
		for(int i = 0; i <= num; i++) {
			int product = i * (i + 1);
			if(product == temp) {
				System.out.println("it is pronic number ");
				return;
			}
		}
		System.out.println("not pronic");
	}
}