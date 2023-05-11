package ss4_class_and_object.bai_tap.exercise_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập lần lượt các tham số a,b,c của phương trình bậc hai");
        System.out.println("nhập vào tham số a");
        double a = Integer.parseInt(scanner.nextLine());
        while (a == 0) {
            System.out.println("nhập vào tham số a khác 0");
            a = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("nhập vào tham số b");
        double b = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập vào tham số c");
        double c = Integer.parseInt(scanner.nextLine());
        QuadraticEquation equation = new QuadraticEquation(a, b, c);
        if (equation.getDiscriminant() > 0) {
            System.out.println("ngiệm của phương trình là " + equation.getRoot1() + " và " + equation.getRoot2());
        } else if (equation.getDiscriminant() == 0) {
            System.out.println("phương trình có nghiệm kép là :" + equation.getRoot1());
        } else {
            System.out.println("phương trình vô nghiệm");
        }
    }
}
