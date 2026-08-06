//Convert Celsius to Fahrenheit.
package Day1;
import java.util.*;

public class Task8 {
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Temperature in Celcius");
        float value=sc.nextFloat();

        float fahrenhiet=(value*9/5)+32;
        System.out.println("Temperature in Fahrenheit is :"+fahrenhiet);

        sc.close();
    }
}
