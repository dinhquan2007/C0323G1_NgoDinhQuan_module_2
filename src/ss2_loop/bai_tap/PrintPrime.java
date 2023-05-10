package ss2_loop.bai_tap;

import java.util.Scanner;

public class PrintPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int count = 0;
        int num = 2;
        int times = 0;
        while (count < number) {

            for (int i = 1; i < num; i++) {
                if (num % i == 0) {
                    times++;
                }
            }
            if (times == 1) {
                System.out.println(num + ",");
                count++;
            }
            num++;
        }
    }
}
