package File_Handling_in_java;
import java.io.FileReader;
import java.io.BufferedReader;
public class bufferedreading {
    
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(
                new FileReader("pradip.txt"));

        String line;

        while ((line = br.readLine()) != null) {

            System.out.println(line);

        }

        br.close();

    }
}
