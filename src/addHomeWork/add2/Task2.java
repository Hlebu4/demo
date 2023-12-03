package addHomeWork.add2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        String myName = "Andrey";
        System.out.println(myName);

        String name = myName;
        System.out.println(" Hy your name is " + name);

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Plies enter your name");
        String userName = scanner.nextLine();

        System.out.println("Hello " + userName);


    }
}
