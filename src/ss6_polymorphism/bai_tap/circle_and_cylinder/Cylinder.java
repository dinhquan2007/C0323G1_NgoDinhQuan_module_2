package ss6_polymorphism.bai_tap.circle_and_cylinder;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getRadius() {
        return super.getRadius();
    }

    public double getVolume() {
        return super.getArea() * height;
    }

    public String getColor() {
        return super.getColor();
    }

    public double getHeight() {
        return height;
    }
}
