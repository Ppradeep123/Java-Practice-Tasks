package Day2;
//Check if a number is even or odd.

import java.util.*;
public class Task2 {
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter Your Number");
        int num=sc.nextInt();
        if(num%2==0){
            System.out.println(num + " "+"is even number");
        }
        else{
            System.out.println(num + " "+": is odd number");
        }
        sc.close();
    }
}
