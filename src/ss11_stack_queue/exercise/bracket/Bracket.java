package ss11_stack_queue.exercise.bracket;

import java.util.Scanner;
import java.util.Stack;

public class Bracket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào biểu thức cần kiểm tra: ");
        String string = scanner.nextLine();
        if (!string.contains("(") && !string.contains(")")) {
            System.out.println("biểu thức không chứa dấu ngoặc");
        } else if (checkBracket(string)) {
            System.out.println("biểu thức đúng");
        } else {
            System.out.println("biểu thức chưa dấu ngoặc không hợp lệ");
        }
    }

    public static boolean checkBracket(String string) {
        Stack<Character> bracketStack = new Stack<>();

        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == '(') {
                bracketStack.push(string.charAt(i));
            } else if (string.charAt(i) == ')' && bracketStack.isEmpty()) {
                return false;
            } else if (string.charAt(i) == ')') {
                bracketStack.pop();
            }
        }
        return bracketStack.isEmpty();
    }
}
