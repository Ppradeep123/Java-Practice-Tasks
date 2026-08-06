package Day10;
// exception handling using exception e 
public class Task1 {
    public static void main(String args[]) {
    try {
        int a=10;
        int b=0;
        System.out.println(a/b);
    }
    catch(Exception e){
        System.out.println("Exception handled : cannot divide by 0");
    }
}
}