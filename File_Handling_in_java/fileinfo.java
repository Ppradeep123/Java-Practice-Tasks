package File_Handling_in_java;

import java.io.File;

public class fileinfo {
    // all information about file

    public static void main(String args[]) {
        File file = new File("pradip.txt");
        System.out.println(file.getName());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.canRead());
        System.out.println(file.exists());
        System.out.println(file.length());
    }
}
