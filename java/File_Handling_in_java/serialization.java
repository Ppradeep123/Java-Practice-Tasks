package File_Handling_in_java;

import java.io.*;

public class serialization  {

    static class Students implements Serializable {

        int id;
        String name;

        Students(int id, String name) {
            this.id = id;
            this.name = name;
        }
    }

    public static void main(String[] args) throws Exception {

        Students s = new Students(101, "Pradeep");

        FileOutputStream file = new FileOutputStream("student.ser");
        ObjectOutputStream out = new ObjectOutputStream(file);

        out.writeObject(s);

        out.close();
        file.close();

        System.out.println("Object Serialized Successfully");
    }
}