package ss6_polymorphism.bai_tap.circle_and_cylinder;

public class Circle {
    private double radius;
    private String color;

    final double PI = 3.14;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public double getArea() {
        return radius * radius * PI;
    }


}

