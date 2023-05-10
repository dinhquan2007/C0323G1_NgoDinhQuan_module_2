package ss3_method.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteInArray {
    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3, 4, 5, 6, 8, 8};
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        if (includes(array, number) != -1) {
            while (includes(array, number) != -1) {
                int index = includes(array, number);
                for (; index < array.length - 1; index++) {
                    array[index] = array[index + 1];
                }
                if (array[array.length - 1] != 0) {
                    array[array.length - 1] = 0;
                }
            }

        }
        System.out.println(Arrays.toString(array));
    }

    public static int includes(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return i;
            }
        }
        return -1;
    }
}
