package ss11_stack_queue.exercise.decimal_to_binary;

import java.util.Scanner;
import java.util.Stack;

public class Convert {
    int decimal;

    public Convert() {
    }

    public Convert(int decimal) {
        this.decimal = decimal;
    }


    static int surplus;

    public static Stack<Integer> binary(int decimal) {
        Stack<Integer> binary = new Stack<Integer>();
        while (decimal > 0) {
            surplus = decimal % 2;
            binary.push(surplus);
            decimal /= 2;
        }
        return binary;
    }
}
