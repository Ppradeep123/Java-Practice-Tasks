package Day8;

public class Task4 {
    static class circle{
        int radius;
        circle(int radius){
            this.radius=radius;


        }
        void display(){
            System.out.println(3.14*radius*radius);
        }
    }
    public static void main(String args[]){
        circle c1 = new circle(7);
        c1.display();
    }
}
