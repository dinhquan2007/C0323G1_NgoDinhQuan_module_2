package ss7_abtract_class_and_interface.exercise.interface_resizeable;

public class Square implements Resizeable {
    private double edge;

    public Square(double edge) {
        this.edge = edge;
    }

    @Override
    public void resize(double percent) {
        this.edge = edge * percent / 100;
    }

    public double getEdge() {
        return edge;
    }

    @Override
    public String toString() {
        return "Square{" +
                "edge=" + getEdge() +
                '}';
    }
}
