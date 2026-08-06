package File_Handling_in_java;
import java.io.FileWriter;
import java.io.IOException;
public class write {
    public static void main(String args[]){
        try{
            FileWriter file = new FileWriter("pradip.txt");
            file.write("i am a java develope ");
            file.close(
            );
            System.out.println("Successfully wrote to the file.");
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
