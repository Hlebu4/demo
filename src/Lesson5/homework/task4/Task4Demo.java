package Lesson5.homework.task4;

import java.util.Scanner;

public class Task4Demo {
    public static void main(String[] args) {

        Task4 myName = new Task4("Andrey");

        System.out.println("=========Конкатенация ========");

        String yourName = "Vasiliy";
        String hiYourName = "Hi your name is - ";
        hiYourName = hiYourName.concat(yourName );
        System.out.println(hiYourName);


        Scanner scan1 = new Scanner(System.in);
        System.out.println("Enter your name");
        String scan1String = scan1.next();
        System.out.println( " Hello username " + scan1String);


    }

}
