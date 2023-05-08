package ss1_introduction_in_java.bai_tap;

import java.util.Scanner;

public class ChangeMoney {
    public static void main(String[] args) {
        double rate = 23000;
        double vnd;
        double usd;
        Scanner scanner = new Scanner(System.in);
        System.out.println("mời nhập vào USD");
        usd = scanner.nextDouble();
        vnd = usd * rate;
        System.out.println("số tiền VND là " + vnd + " VND");
    }
}
