package Lesson6.homework.task1;

import java.util.Scanner;

public class UserInput {

    Scanner scanner = new Scanner(System.in);

    public String userInputText(){
        String input = scanner.nextLine();
        return input;
    }
}
