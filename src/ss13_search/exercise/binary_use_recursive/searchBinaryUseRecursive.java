package ss13_search.exercise.binary_use_recursive;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class searchBinaryUseRecursive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = Integer.parseInt(sc.nextLine());
        }
        System.out.println("nhập vào số muốn tìm");
        int x = Integer.parseInt(sc.nextLine());
        System.out.println(binarySearch(array, 0, array.length, x));
    }

    public static int binarySearch(int[] array, int left, int right, int value) {
        Arrays.sort(array);
        left = 0;
        right = array.length - 1;
        int middle;
        while (left <= right) {
            middle = (left + right) / 2;
            if (value == array[middle]) {
                return middle;
            } else if (value < array[middle]) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }

        }
        return -1;
    }
}
