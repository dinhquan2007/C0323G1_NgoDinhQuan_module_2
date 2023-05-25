package ss15_exception_and_debug.exercise;

import java.util.Scanner;

public class IllegalTriangleException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float edgeFirst;
        float edgeSecond;
        float edgeThirst;
        float sum;
        do {
            do {
                System.out.println("nhập vào cạnh thứ nhất tam giác");
                try {
                    edgeFirst = Float.parseFloat(scanner.nextLine());
                    break;
                } catch (NumberFormatException numberFormatException) {
                    System.out.println("không hợp lệ vui lòng nhập lại");
                }
            } while (true);
            do {
                System.out.println("nhập vào cạnh thứ hai tam giác");
                try {
                    edgeSecond = Float.parseFloat(scanner.nextLine());
                    break;
                } catch (NumberFormatException numberFormatException) {
                    System.out.println("không hợp lệ vui lòng nhập lại");
                }
            } while (true);
            do {
                System.out.println("nhập vào cạnh thứ ba tam giác");
                try {
                    edgeThirst = Float.parseFloat(scanner.nextLine());
                    break;
                } catch (NumberFormatException numberFormatException) {
                    System.out.println("không hợp lệ vui lòng nhập lại");
                }
            } while (true);
        } while (!checkEdgeTriangle(edgeFirst,edgeSecond,edgeThirst));
    }
    public static boolean checkEdgeTriangle(float a, float b, float c) {
        if (a + b <= c) {
            return false;
        } else if (a + c <= b) {
            return false;
        } else return !(b + c <= a);
    }
}
