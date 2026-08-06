package Day8;
//Create a Rectangle class that calculates area using constructor values.
public class Task3 {
    static class Rectangle{
            int length;
            int width;

            Rectangle(int length,int width){
                this.length=length;
                this.width=width;
            }

            void display(){
                System.out.println(length*width);
            }
    }
    public static void main(String args[]){
        Rectangle r1 = new Rectangle(20,5);
        
        r1.display();

    }
}
