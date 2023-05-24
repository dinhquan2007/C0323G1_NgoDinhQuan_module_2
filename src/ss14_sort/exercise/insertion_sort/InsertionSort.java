package ss14_sort.exercise.insertion_sort;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arrayNumber = new int[]{5, 4, 6, 3, 7, 3, 2, 8, 1, 9, 11, 10};
        System.out.println("mảng trước khi sắp xếp là ");
        System.out.println(Arrays.toString(arrayNumber));
        insertionSort(arrayNumber);
    }

    public static void insertionSort(int[] array) {
        int index;
        int x;
        for (int i = 0; i < array.length; i++) {
            x = array[i];
            index = i;
            while (index > 0 && x < array[index - 1]) {
                array[index] = array[index - 1];
                index--;
            }
            array[index] = x;
        }
        System.out.println("mảng sau khi sắp xếp là :");
        System.out.println(Arrays.toString(array));
    }
}
