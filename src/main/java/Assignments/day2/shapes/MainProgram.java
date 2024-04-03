package Assignments.day2.shapes;


public class MainProgram {
    public static void main(String[] args) {
        // Create an array of Shape references
        Shape[] shapes = new Shape[10];
        shapes[0] = new Circle(5.0, "Red", true);
        shapes[1] = new Rectangle(3.0, 4.0, "Blue", false);
        shapes[2] = new Square(6.0, "Green", true);
        shapes[3]=new Circle(90,"Green", true);

        try{
        for (Shape shape : shapes) {
            System.out.println(shape.toString());
            if (shape instanceof Circle) {
                Circle circle = (Circle) shape;
                System.out.println("Perimeter: " + circle.getPerimeter());
                System.out.println("Area: " + circle.getArea());
            } else if (shape instanceof Rectangle) {
                Rectangle rectangle = (Rectangle) shape;
                System.out.println("Perimeter: " + rectangle.getPerimeter());
                System.out.println("Area: " + rectangle.getArea());
            } else if (shape instanceof Square) {
                Square square = (Square) shape;
                System.out.println("Perimeter: " + square.getPerimeter());
                System.out.println("Area: " + square.getArea());
            }
            System.out.println();
            }
        }
        catch (Exception e){

        }
    }
}


