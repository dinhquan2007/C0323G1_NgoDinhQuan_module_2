package ss2_loop.bai_tap;

import java.util.Scanner;

public class Drawing {
    public static void main(String[] args) {
        System.out.println("1.Print the rectangle\n" +
                "\n" +
                "2.Print the square triangle\n" +
                "\n" +
                "3.Print isosceles triangle\n" +
                "\n" +
                "4.Exit");
        Scanner scanner = new Scanner(System.in);
        int select = Integer.parseInt(scanner.nextLine());
        switch (select) {
            case 1:
                System.out.println("input height");
                int height = Integer.parseInt(scanner.nextLine());
                System.out.println("input width");
                int width = Integer.parseInt(scanner.nextLine());
                drawRectangle(height, width);
                break;
            case 2:
                System.out.println("input height");
                int heightTriangle = Integer.parseInt(scanner.nextLine());
                System.out.println(" Select one in four different angles:\n" +
                        "1.top-left\n" +
                        "2.top-right\n" +
                        "3.bottom-left\n" +
                        "4.bottom-right");
                int selectOne = Integer.parseInt(scanner.nextLine());
                switch (selectOne) {
                    case 1:
                        drawSquareTriangle(heightTriangle);
                        break;
                    case 2:
                        drawSquareTriangle2(heightTriangle);
                        break;
                    case 3:
                        drawSquareTriangle3(heightTriangle);
                        break;
                    case 4:
                        drawSquareTriangle4(heightTriangle);
                        break;
                }

            case 3:
                System.out.println("input height");
                int heightTriangle2 = Integer.parseInt(scanner.nextLine());
                drawSquareTriangleIsosceles(heightTriangle2);
                break;
        }
    }

    public static void drawRectangle(int height, int width) {
        for (int i = 1; i <= height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void drawSquareTriangle(int height) {
        for (int i = height; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void drawSquareTriangle2(int height) {
        for (int i = 0; i <= height; i++) {
            for (int j = 0; j <= height; j++) {
                if (j >= i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }

            }
            System.out.println();
        }
    }

    public static void drawSquareTriangle3(int height) {
        for (int i = 1; i <= height; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void drawSquareTriangle4(int height) {
        for (int i = 0; i <= height; i++) {
            for (int j = 0; j <= height; j++) {
                if (j >= i) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }

            }
            System.out.println();
        }
    }

    public static void drawSquareTriangleIsosceles(int height) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < 2 * height; j++) {
                if (height - i > j || j > height + i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
