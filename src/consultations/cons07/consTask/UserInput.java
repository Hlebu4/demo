package consultations.cons07.consTask;

import lesson15.lessoncode.service.utils.InputData;

import java.util.Scanner;

public class UserInput {

    Scanner scanner = new Scanner(System.in);

    public String userInputText(){
        System.out.println(" Enter Text ");
        String input = scanner.nextLine();
        return input;
    }

}
