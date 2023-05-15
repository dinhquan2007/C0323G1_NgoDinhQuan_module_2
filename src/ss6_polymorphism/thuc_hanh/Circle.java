package ss6_polymorphism.thuc_hanh;

public class Circle extends Shape {
    double radius;

    public Circle(String color, boolean filled) {
        super(color, filled);
    }

    public Circle() {
        this.radius = 1.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return super.getColor();
    }

    public double getRadius() {
        return radius;
    }

    public static double getArea(double radius) {
        return radius * radius * 3.14;
    }

    public static double getPerimeter(double radius) {
        return radius * 2 * 3.14;
    }

    @Override
    public String toString() {
        return "A Circle winh radius = "+getRadius()+"which is a subclass of "+ super.toString();
    }
}
