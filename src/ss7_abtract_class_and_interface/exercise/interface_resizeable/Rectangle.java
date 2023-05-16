package ss7_abtract_class_and_interface.exercise.interface_resizeable;

public class Rectangle implements Resizeable {
    private double width;
    private double length;

    @Override
    public void resize(double percent) {
        this.length = length * percent / 100;
        this.width = width * percent / 100;
    }

    public Rectangle(double width, double length) {
        this.length = length;
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + getWidth() +
                ", length=" + getLength() +
                '}';
    }
}

