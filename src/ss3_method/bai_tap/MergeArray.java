package ss3_method.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arrayFirst = new int[10];
        int[] arrayLast = new int[5];
        int[] arrayFull = new int[15];
        for (int i = 0; i < arrayFirst.length; i++) {
            System.out.println("nhập vào phần tử mảng đầu");
            arrayFirst[i] = Integer.parseInt(scanner.nextLine());
        }
        for (int i = 0; i < arrayLast.length; i++) {
            System.out.println("nhập vào phần tử mảng cuối");
            arrayLast[i] = Integer.parseInt(scanner.nextLine());
        }
        for (int i = 0; i < arrayFirst.length; i++) {
            arrayFull[i] = arrayFirst[i];
        }
        for (int i = arrayFirst.length; i < (arrayLast.length + arrayFirst.length); i++) {
            arrayFull[i] = arrayLast[i - arrayFirst.length];
        }
        System.out.println(Arrays.toString(arrayFull));
    }
}
