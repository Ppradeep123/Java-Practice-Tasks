package Day3;
import java.util.*;
//Reverse a number (e.g., 1234 → 4321).
public class Task8 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your number");
        int num =sc.nextInt();
        int rev=0;
        for(; num!=0 ; num /=10){
            int digit=num%10;
            rev=rev*10+digit;


        }
        System.out.println(rev);
        sc.close();

    }
}
