package ss2_loop.bai_tap;

import java.util.Scanner;

public class PrintPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int count = 0;
        int num = 2;
        while (count < number) {
            int count2 = 0;
            for (int i = 1; i < num; i++) {
                if (num % i == 0) {
                    count2++;
                }
            }
            if (count2 == 1) {
                System.out.println(num + ",");
                count++;
            }
            num++;
        }
    }
}
