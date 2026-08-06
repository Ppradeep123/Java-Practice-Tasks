package Day10;

public class Task3 {
    static class InvalidAgeException extends Exception {
        InvalidAgeException(String message) {
            super(message);
        }
    }

    public static void main(String args[]){
        try {
            int age=15;
                if(age<18){
                    throw new InvalidAgeException("Age is not valid");
                }
                else{
                    System.out.println("Age is valid");
                }
        }    
        catch(InvalidAgeException e){
            System.out.println(e.getMessage());
        }
}
}