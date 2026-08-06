package Day7;

//Create a Student class with name and age
public class Task1 {
    static class Student {
        String name;
        int age;
    }

    public static void main(String args[]) {
        Student s1 = new Student();
        s1.name = "pradip";
        s1.age = 45;
        System.out.println(s1.name);
        System.out.println(s1.age);
    }

}
