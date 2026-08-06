package Day4;

public class Task10 {
    static int palidrome(int num){
        int reversed=0;
        while(num!=0){
            int digit=num%10;
            reversed=reversed*10+digit;
            num/=10;
        }
        return reversed;
    }

    public static void main (String args[]){
        int number=121;
    
        if (palidrome(number)==number){
            System.out.print("number is palidrome");
        }
        else{
            System.out.println("not palidrome");
        }
    }
}
