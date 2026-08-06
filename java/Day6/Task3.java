package Day6;

//Check if a string is a palindrome.
public class Task3 {
    public static void main(String args[]) {
        String check = "madam";
        String rev="";
        for (int i = check.length() - 1; i >= 0; i--) {
            rev = rev+ check.charAt(i);
        }
        if (check.equals(rev)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
