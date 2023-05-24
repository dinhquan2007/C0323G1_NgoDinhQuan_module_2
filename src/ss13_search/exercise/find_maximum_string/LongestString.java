package ss13_search.exercise.find_maximum_string;

import java.util.LinkedList;
import java.util.Scanner;

public class LongestString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Character> max = new LinkedList<>();
        LinkedList<Character> list = new LinkedList<>();
        System.out.println("nhập chuỗi :");
        String string = scanner.nextLine();

        for (int i = 0; i < string.length(); i++) {
            if (list.size() > 1 && string.charAt(i) <= list.getLast()) {
                list.clear();
            }
            list.add(string.charAt(i));
            if (list.size() > max.size()) {
                max.clear();
                max.addAll(list);
            }

        }
        for (Character c : max) {
            System.out.print(c);
        }
    }
}
