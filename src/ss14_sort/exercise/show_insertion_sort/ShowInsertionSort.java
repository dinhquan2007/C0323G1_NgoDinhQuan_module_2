package ss14_sort.exercise.show_insertion_sort;

import java.util.Arrays;

public class ShowInsertionSort {
    public static void main(String[] args) {
        int[] arrayNumber = new int[]{5, 4, 6, 3, 7, 3, 2, 8, 1, 9, 11, 10};
        insertionSort(arrayNumber);
    }

    public static void insertionSort(int[] array) {
        int index;
        int x;
        for (int i = 0; i < array.length; i++) {
            x = array[i];
            index = i;
            while (index > 0 && x < array[index - 1]) {  //so sánh nếu số sau nỏ hơn số trước
                array[index] = array[index - 1];//thực hiện đổi chỗ tuần tự
                System.out.println("dịch chuyển giá trị " + x + " từ vị trí " + index + " qua " + (index - 1));
                index--;
            }
            array[index] = x;  //gán lại giá trị cho phần tử trước nó hoặc chính nó nếu không lớn hơn
            System.out.println("gán lại phần tử vị trí " + index + " bằng giá trị " + x);
            System.out.println(Arrays.toString(array));//in ra mảng sau mỗi vòng sắp xếp

            System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");

        }
    }
}