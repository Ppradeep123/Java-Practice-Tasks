package File_Handling_in_java;
import java.io.File;
// reading data of file 
import java.util.Scanner;
public class read {
    public static void main(String args[]){
        try{
            File file =new File ("pradip.txt");
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()){
                String data = sc.nextLine();
                System.out.println(data);
            }
            sc.close();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
