package Assignments.day2.shapes;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter


public class Rectangle extends Shape {
    private double width;
    private double length;

//    public Rectangle(String color, boolean filled) {
//        super(color, filled);
//    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
       this.width = width;
        this.length = length;
   }

    @Override
    public String toString() {
        return "A Rectangle with width=" + width + " and length=" + length + ", which is a subclass of " + super.toString();
    }

    public double getPerimeter() {
        return 2 * (width + length);
    }

    public double getArea() {
        return width * length;
    }
}
