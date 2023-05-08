package ss1_introduction_in_java.bai_tap;

import java.util.Scanner;

public class ReadNumber {
    public static void main(String[] args) {
        String word = " ";
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String string = Integer.toString(number);
        String[] numberWord = string.split("");
        String[] arrayNumberUnits = new String[]{" ", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] arrayNumberTeens = new String[]{"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        String[] arrayNumberTens = new String[]{" ", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
        if (number < 100 && number > 0) {
            if (number < 10) {
                word = arrayNumberUnits[number];
            } else if (number < 20) {
                word = arrayNumberTeens[number - 10];
            } else {
                word = arrayNumberTens[Integer.parseInt(numberWord[0])] + " " + arrayNumberUnits[Integer.parseInt(numberWord[1])];
            }
        } else if (number < 1000) {
            if (number%100<10){
                word = arrayNumberUnits[Integer.parseInt(numberWord[0])] + " hundred and "+arrayNumberUnits[number%100];
            }else if (number%100<20){
                word = arrayNumberUnits[Integer.parseInt(numberWord[0])] + " hundred and " +arrayNumberTeens[number%100 - 10];
            }else {
                word = arrayNumberUnits[Integer.parseInt(numberWord[0])] + " hundred and " + arrayNumberTens[Integer.parseInt(numberWord[1])] + " " + arrayNumberUnits[Integer.parseInt(numberWord[2])];
            }
          }
        System.out.println(word);
    }
}
