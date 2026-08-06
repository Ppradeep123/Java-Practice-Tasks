package Day2;
//Check if a number is positive or negative.

import java.util.*;

public class Task1 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Number");
        int num=sc.nextInt();

        if(num>0){
            System.out.println(num+ " "+"is positve number");

        }
        else {
            System.out.println(num + " "+": is negative number");
        }
        sc.close();
    }

}
