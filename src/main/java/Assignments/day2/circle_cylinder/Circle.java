package Assignments.day2.circle_cylinder;

public class Circle {
        protected double radius;
        protected String color;

        public Circle() {
            this.radius = 1.0;
            this.color = "red";
        }

        public Circle(double radius) {
            this.radius = radius;
            this.color = "red";
        }

        public Circle(double radius, String color) {
            this.radius = radius;
            this.color = color;
        }

        public double getRadius() {
            return radius;
        }

        public void setRadius(double radius) {
            this.radius = radius;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public double getArea() {
            return Math.PI * radius * radius;
        }

        @Override
        public String toString() {
            return "A Circle with radius=" + radius + ", which is a subclass of Shape";
        }
    }

