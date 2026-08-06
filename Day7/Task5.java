package Day7;

//Create a Calculator class with add, subtract, multiply, and divide methods.
public class Task5 {
    static class Calculator {
        int a;
        int b;

        void Add() {
            System.out.println(a + b);

        }

        void sub() {
            System.out.println(a - b);

        }

        void mul() {
            System.out.println(a * b);

        }

        void divide() {
            System.out.println(a / b);
        }
    }
    public static void main(String args[]){
        Calculator c1 = new Calculator();
        c1.a=45;
        c1.b=5;

        c1.Add();
        c1.sub();
        c1.mul();
        c1.divide();
    }
}
