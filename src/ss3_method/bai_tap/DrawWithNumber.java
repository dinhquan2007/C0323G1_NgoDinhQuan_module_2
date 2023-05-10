package ss3_method.bai_tap;

public class DrawWithNumber {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < 11; j++) {
                if (j == 5 - i || j == 5 + i) {
                    System.out.print(i);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i = 4; i > 0; i--) {
            for (int j = 10; j > 0; j--) {
                if (j == 5 - i || j == 5 + i) {
                    System.out.print(i);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
