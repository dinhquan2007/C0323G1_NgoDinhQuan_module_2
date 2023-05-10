package ss3_method.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class AddOnArray {
    public static void main(String[] args) {
        int[] array = new int[10];
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào số muốn chèn ");
        int number = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập vào chỉ số muốn chèn lớn hơn hoặc bằng không và nhỏ hơn 10");
        int index = Integer.parseInt(scanner.nextLine());
        while (index < 0 || index > 10) {
            System.out.println("nhập vào chỉ số muốn chèn lớn hơn hoặc bằng không và nhỏ hơn 10");
            index = Integer.parseInt(scanner.nextLine());
        }
        for (int i = array.length - 1; i > index; i--) {
            array[i] = array[i - 1];
        }
        array[index] = number;
        System.out.println(Arrays.toString(array));
    }
}
