package Day9;

public class TAsk2 {
    static class vehicle{
        vehicle(){
            System.out.println("it is vehicle");
        }
    }
    static class car extends vehicle{

        car(){
            System.out.println("it is car");
        }
        void start(){
            System.out.println("car is starting");
        }
    }
    static class bike extends vehicle{
        bike(){
            System.out.println("it is bike");
        }
        void start(){
            System.out.println("bike is starting");
        }
    }

    public static void main(String args[]){
        
        car c1 = new car();
        bike b1 = new bike();
          c1.start();
          b1.start();

    }
}
