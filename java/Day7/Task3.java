package Day7;

//Create a Car class with brand, model, and price
public class Task3 {
    static class Car {
        String brand;
        String model;
        int price;

    }

    public static void main(String args[]) {
        Car c1 = new Car();
        c1.brand = "audi";
        c1.model = "audi2345mg";
        c1.price = 500000;
        Car c2 = new Car();
        c2.brand = "merccedz";
        c2.model = "45mg";
        c2.price = 500000;
        System.out.println(c1.brand + "\n" + c1.model + "\n" + c1.price);
        System.out.println("\n" + c2.brand + "\n" + c2.model + "\n" + c2.price);
    }
}
