package Task4;

public class Maintask_4 {
    public static void main(String[] args) {


        Shape circle = new Circle(5.0);
        Shape square = new Square(5.0);
        System.out.println("Area of circle: " + circle.getArea());
        System.out.println("Area of rectangle: " + square.getArea());


        ShapeBuilder.addShape(circle);
        ShapeBuilder.addShape(square);


        System.out.println("Total area of objects. " + ShapeBuilder.getTotalArea());
    }
}
