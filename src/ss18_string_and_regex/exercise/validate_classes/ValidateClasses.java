package ss18_string_and_regex.exercise.validate_classes;

import java.util.Scanner;

public class ValidateClasses {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhập vào lớp kiểm tra");
        String classes=scanner.nextLine();
        System.out.println(testClass(classes));
    }
    public static boolean testClass(String classes){
        String regexClasses="^(A|C|P)\\d{4}(G|H|I|K)$";
        return classes.matches(regexClasses);
    }
}
