package ss7_abtract_class_and_interface.exercise.interface_resizeable;

public class Circle implements Resizeable {
    private double radius;

    @Override
    public void resize(double percent) {
        this.radius = radius * percent / 100;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + getRadius() +
                '}';
    }
}
