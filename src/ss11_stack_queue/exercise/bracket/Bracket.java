package ss11_stack_queue.exercise.bracket;

import java.util.Scanner;
import java.util.Stack;

public class Bracket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào biểu thức cần kiểm tra: ");
        String string = scanner.nextLine();
        if(!string.contains("(")&&!string.contains(")")){
            System.out.println("biểu thức không chứa dấu ngoặc");
        }else if (checkBracket(string)){
            System.out.println("biểu thức đúng");
        }
    }
    public static boolean checkBracket(String string) {
        Stack<Character> symStack = new Stack<>();
        Stack<Character> leftStack = new Stack<>();

        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == '(') {
                symStack.push(string.charAt(i));
            }
            if (string.charAt(i) == ')') {
                leftStack.push(string.charAt(i));
            }
        }
        return symStack.size() == leftStack.size();
    }
}
