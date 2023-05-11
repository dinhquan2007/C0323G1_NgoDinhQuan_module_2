package ss4_class_and_object.bai_tap.exercise_2;

import ss2_loop.bai_tap.PrintPrimeLimited;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        int count = 0;
        int num = 2;
        int times;
        while (count < 500) {
            times = 0;
            for (int i = 1; i < num; i++) {
                if (num % i == 0) {
                    times++;
                }
            }
            if (times == 1) {
                System.out.println(num + ",");
                count++;
            }
            num++;
        }
        stopWatch.stop();
        System.out.println("thời gian chạy là :" + stopWatch.getElapsedTime() + " milliseconds");
    }
}
