package ss18_string_and_regex.exercise.validate_phone_number;

import java.util.Scanner;

public class ValidatePhoneNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhập vào số điện thoại việt nam xem có hợp lệ");
        String phoneNumber=scanner.nextLine();
        System.out.println(testRegexPhone(phoneNumber));
    }
    public static boolean testRegexPhone(String phoneNumber){
        String regexPhone="^\\d{2}0\\d{9}$";
        return phoneNumber.matches(regexPhone);
    }
}
