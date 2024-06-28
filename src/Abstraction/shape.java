package Abstraction;

abstract class shape {
    public abstract void draw();
}

class Rectangle extends shape{

    @Override
    public void draw() {
        System.out.println("drawing the shape of Rectangle");
    }
}
class Circle extends  shape{

     @Override
     public void draw() {
         System.out.println("Draw the shope of the circle");
     }
}

