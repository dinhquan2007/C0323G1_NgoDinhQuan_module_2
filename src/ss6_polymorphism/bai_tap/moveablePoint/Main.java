package ss6_polymorphism.bai_tap.moveablePoint;

public class Main {
    public static void main(String[] args) {
        Point point = new Point(1, 2);
        MovablePoint movablePoint = new MovablePoint(1, 2, 2, 3);
        System.out.println(point);
        System.out.println(movablePoint);

        System.out.println(movablePoint.move());
    }
}

