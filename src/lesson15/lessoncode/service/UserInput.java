package lesson15.lessoncode.service;


import java.util.Scanner;

public class UserInput {

    Scanner scanner = new Scanner(System.in);
    public int userInputInt(){
        int input = scanner.nextInt();
        return input;
    }
    public String userInputText(){
        String input = scanner.nextLine();
        return input;
    }
}
