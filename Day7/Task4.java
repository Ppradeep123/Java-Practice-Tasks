package Day7;

//Create a Rectangle class with methods to calculate area and perimeter.
public class Task4 {
    static class Rectangle {
        int length;
        int width;

        void CalculateArea() {
            System.out.println("area of rectangle is " + (width * length));
        }

        void CalculatePerimeter() {
            System.out.println("perimeter of rectangle is " + (2 * (length + width)));
        }

    }

    public static void main(String args[]) {
        Rectangle r1 = new Rectangle();
        r1.length = 45;
        r1.width = 58;

        r1.CalculateArea();
        r1.CalculatePerimeter();
    }
}
