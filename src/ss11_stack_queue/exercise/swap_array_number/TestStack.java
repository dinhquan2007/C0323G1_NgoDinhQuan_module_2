package ss11_stack_queue.exercise.swap_array_number;

import java.util.Arrays;
import java.util.Stack;

public class TestStack {
    public static void main(String[] args) {
        int[] arrayNumber = {1, 2, 3, 4, 5, 6, 7, 8};
        Stack<Integer> stack = new Stack<>();
        for (int j : arrayNumber) {
            stack.push(j);
        }
        for (int i = 0; i < arrayNumber.length; i++) {
            arrayNumber[i] = stack.pop();
        }
        System.out.println(Arrays.toString(arrayNumber));
        String string= "Ngô Đình Quân";
        String[] arrays=string.split(" ");
        Stack<String> stackString = new Stack<>();
        for (String array : arrays) {
            stackString.push(array);
        }
        for (int i = 0; i < arrays.length; i++) {
            arrays[i]=stackString.pop();
        }
        System.out.println(Arrays.toString(arrays));
    }
}
