package addHomeWork.add1;

import java.util.Scanner;

/*
Напишите программу, которая запрашивает у пользователя три целых числа и выводит их среднее арифметическое
(складывает все числа и делит на их количество).
 */
public class Task5Demo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter firths number ");
        double firthsNumber = scanner.nextDouble();
        System.out.println("Enter second number ");
        double secondNumber = scanner.nextDouble();
        System.out.println("Enter third number ");
        double thirdNumber = scanner.nextDouble();
        double result = (firthsNumber + secondNumber + thirdNumber) / 3;
        System.out.println(" Arithmetic mean = " + result);
    }
}
