package lesson7.homework.dop.taskProg;

import java.util.Random;

public class Task4Demo {
    public static void main(String[] args) {

        Random random = new Random();
        Task4 task4 = new Task4();
        System.out.println("Is leap year - " + task4.leapYear(random.nextInt(0,3000)));
    }
}
