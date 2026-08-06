package Day8;

// create a Student class with parameterized constructor
public class Task1 {
    static class Student {
        String name;
        int mob;
        int age;

        Student(String name,int mob,int age) {
            this.name=name;
            this.age=age;
            this.mob=mob;
        }
        void Display(){
            System.out.println(name);
            System.out.println(age);
            System.out.println(mob);
        }
    }

    public static void main() {
        Student s1 = new Student("pradip", 558565, 25);

       s1.Display();

    }

}
