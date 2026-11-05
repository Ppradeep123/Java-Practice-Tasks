package JDBC;
import java.sql.*;

public class connection {
    public static void main(String args[]){
        String url ="jdbc:mysql://localhost:3306/java_db";

        String username="root";
        String password="";

        try{
            Connection con = DriverManager.getConnection(url,username,password);
            System.out.println("Connected");
            con.close();
        }
        catch(Exception e){
           e.printStackTrace();
        }
    }
}
