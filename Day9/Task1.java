package Day9;

public class Task1 {

    static class Animal {
        Animal() {
            System.out.println("I am an animal");
        }
    }

    static class Dog extends Animal {
        Dog() {
            System.out.println("I am a dog");
        }
        void bark() {
            System.out.println("Woof Woof");
        }
    }

    public static void main(String args[]) {
        Dog d1 = new Dog();

        d1.bark();
    }
}