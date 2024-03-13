package org.targetindia.day2.shapes;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Shape {
    private String color;
    private boolean filled;

//    public Shape(String color, boolean filled) {
//        this.color = color;
//        this.filled = filled;
//    }

    @Override
    public String toString() {
        return "A Shape with color of " + color + " and " + (filled ? "filled" : "Not filled");
    }
}
