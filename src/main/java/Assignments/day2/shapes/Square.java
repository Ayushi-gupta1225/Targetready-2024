package Assignments.day2.shapes;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Square extends Rectangle {
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    @Override
    public String toString() {
        return "A Square with side=" + getWidth() + ", which is a subclass of " + super.toString();
    }
}
