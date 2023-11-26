package homework.dop;

import java.util.Scanner;

/*
Task 4
- **Цель**: Программа просит пользователя ввести произвольное число и выводит сумму его цифр.
- **Пример**: Для числа 567432 результат будет 5+6+7+4+3+2 = 27.

 */
public class Task5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Pleas enter number - ");
        int [] input = new int[scanner.nextInt()];
        int sum=0;
        for (int i = 0; i < input.length; i++) {
            sum = sum + input[i];
            System.out.println( input[i] +" + ");
        }
        System.out.println(sum);

    }
}
