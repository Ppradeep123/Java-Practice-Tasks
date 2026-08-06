package File_Handling_in_java.miniproject;

import java.io.*;
import java.util.Scanner;

public class Student {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n===== Student Record System =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Delete File");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    try {

                        FileWriter file = new FileWriter("Students.txt", true);
                        System.out.print("Enter Student ID: ");
                        int id = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Enter Student Name: ");
                        String name = sc.nextLine();

                        file.write(id + " - " + name + "\n");
                        file.close();
                        System.out.println("Student Added Successfully.");
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }

                    break;
                case 2:
                    try {
                        BufferedReader read = new BufferedReader(new FileReader("Students.txt"));
                        while (true) {
                            String data = read.readLine();
                            if (data == null) {
                                break;
                            }
                            System.out.println(data);
                        }
                        read.close();
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }

                    break;
                case 3:

                    File file = new File("students.txt");

                    if (file.exists()) {

                        if (file.delete()) {
                            System.out.println("File Deleted Successfully.");
                        } else {
                            System.out.println("Unable to delete file.");
                        }

                    } else {
                        System.out.println("File does not exist.");
                    }

                    break;

                case 4:

                    System.out.println("Thank You");
                    sc.close();
                    System.exit(0);

                default:

                    System.out.println("Invalid Choice");

            }
           
        }
    }
}
