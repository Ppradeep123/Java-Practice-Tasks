package File_Handling_in_java;
//Creating a File 

import java.io.File;
import java.io.IOException;
public class create {
    public static void main(String args[]){
        try{
            File file =new File ("demo.txt");
            if (file.createNewFile()){
                System.out.println("File is created");
            }
            else{
                System.out.println("File already exists");
            }
        }
        catch(IOException e){
                 System.out.println(e.getMessage());

        }
    }
}
