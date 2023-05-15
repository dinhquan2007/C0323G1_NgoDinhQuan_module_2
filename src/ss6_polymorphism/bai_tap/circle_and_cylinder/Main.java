package ss6_polymorphism.bai_tap.circle_and_cylinder;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhập vào bán kính của hình tròn đáy");
        double radius=Integer.parseInt(scanner.nextLine());
        Circle circle=new Circle(radius,"red");
        System.out.println("diện tích của hình tròn đáy là :"+circle.getArea());
        System.out.println("nhập vào chều cao của hình trụ có cùng bán kính");
        double height=Integer.parseInt(scanner.nextLine());
        Cylinder cylinder=new Cylinder(radius,"red",height);
        System.out.println("thể tích hình trụ có cùng bán kính là :"+cylinder.getVolume());

    }
}
