package Day7;

//Create an Employee class with id, name, and salary.
public class Task2 {
    static class Employee {
        int id;
        String name;
        int salary;

    }

    public static void main(String[] args) {

        Employee e1 = new Employee();
        e1.id = 1;
        e1.name = "pradip patil";
        e1.salary = 1500;

        System.out.println(e1.id);
        System.out.println(e1.name);
        System.out.println(e1.salary);

    }
}
