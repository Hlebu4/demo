package lesson15.homework;

import java.util.Scanner;

/*
3. Напишите программу, которая определит, сколько слов Вы ввели с консоли.
 */
public class Task3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text");
        String words = scanner.nextLine();
        int counter = 0;
        if (words.length() != 0){
            counter++;
            for (int i = 0; i < words.length(); i++) {
                if (words.charAt(i) ==' '){
                    counter++;
                }
            }
        }
        System.out.println(counter);
    }
}
