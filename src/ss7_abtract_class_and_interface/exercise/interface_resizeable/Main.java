package ss7_abtract_class_and_interface.exercise.interface_resizeable;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 10);
        rectangle.resize(60);
        System.out.println(rectangle);
        Circle circle = new Circle(5);
        circle.resize(80);
        System.out.println(circle);
        Square square = new Square(5);
        square.resize(40);
        System.out.println(square);
    }
}
