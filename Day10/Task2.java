package Day10;

// exceeption handling using try and catch in array out of index
public class Task2 {
    public static void main(String args[]) {
        try {
            int arr[] = { 10, 55, 55, 5, 8, 88, 4, 5 };
            System.out.println(arr[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("please enter valid index");

        }
        finally{
            System.out.println("program is completed");
        }
    }
}
