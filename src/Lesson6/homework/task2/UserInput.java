package Lesson6.homework.task2;

import java.util.Scanner;

public class UserInput {

    Scanner scanner = new Scanner(System.in);

    public double userInputDouble(){
        double input = scanner.nextDouble();
        return input;
    }
}
