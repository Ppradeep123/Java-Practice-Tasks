package Day8;

// create a constructor class with constructor overloading
public class Task2 {
    static class Employee {
        int Id;
        String name;
        int salary;

        Employee() {
            System.out.println("default constructor is called");
        }

        Employee(String name, int salary) {
            this.name = name;
            this.salary = salary;

        }

        void display() {
            System.out.println(name);
            System.out.println(salary);
        }
    }

    public static void main(String args[]) {
        Employee e1 = new Employee();
        e1.name = "pradip";
        e1.salary = 5200;
        Employee e2 = new Employee("Rahul", 8000);

        System.out.println("\nEmployee 1");
        e1.display();

        System.out.println("\nEmployee 2");
        e2.display();
    }
}
