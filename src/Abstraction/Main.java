package Abstraction;

public class Main{
    public static void main(String[] args) {
        Circle circle=new Circle();
        System.out.println("Circle ");
        circle.draw();

        Rectangle rectangle=new Rectangle();
        System.out.println("Rectangle");
        rectangle.draw();
    }
}
