package cons04.service;

import java.util.Scanner;

public class UserInput {

    Scanner scanner = new Scanner(System.in);
    public int userInputInt(String s){
        int input = scanner.nextInt();
        return input;
    }

    public double userInputDouble(){
        double input = scanner.nextDouble();
        return input;
    }
    public String userInputText(String s ){
        String input = scanner.nextLine();
        return input;
    }
}
