package addHomeWork.add3;

import java.util.Scanner;

public class UserInput {

    Scanner scanner = new Scanner(System.in);
    public double userInputDouble(){
        double input = scanner.nextDouble();
        return input;
    }
    public int userInputInt(String message){
        System.out.println(message);
        int input = scanner.nextInt();
        return input;
    }
}
