package org.targetindia.day2.circle_cylinder;

public class Main {
        public static void main(String[] args) {
            Circle[] circles = {
                    new Cylinder(12.34),
                    new Cylinder(12.34, 10.0),
                    new Cylinder(12.34, 10.0, "blue")
            };

            for (Circle circle : circles) {
                System.out.println(circle);
                if (circle instanceof Cylinder) {
                    Cylinder cylinder = (Cylinder) circle;
                    System.out.println("Area: " + cylinder.getArea());
                    System.out.println("Volume: " + cylinder.getVolume());
                }
                System.out.println();
            }
        }
    }


