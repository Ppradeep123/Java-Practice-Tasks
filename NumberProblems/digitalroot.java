import java.util.*;

class digitalroot{
	public static void main(String[] args) {
		
	
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the number to find digital root");
	int num= sc.nextInt();

	digitalroot(num);

}

public static void digitalroot(int num){
int n=num;

   while (n >= 10) {

            int sum = 0;

            while (n > 0) {
                int digit = n % 10;
                sum = sum + digit;
                n = n / 10;
            }

            n = sum;
        }

        System.out.println("Digital Root: " + n);
}
}