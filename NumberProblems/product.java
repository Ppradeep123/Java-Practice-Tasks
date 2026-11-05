//Write a Java program to find the product of all digits of a number

import java.util.*;
class product{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		product(num);
}
    static void product(int num){
    	int result=1;

    	while(num!=0){
    		int dig = num%10;
    		result = result * dig;
            num/=10;
    	}

    	System.out.println(result);

    }
}