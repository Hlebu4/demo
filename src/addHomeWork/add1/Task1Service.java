package addHomeWork.add1;

import java.util.Scanner;

/*
Написать консольную программу, которая запрашивает у пользователя два вещественных
числа (числа с запятой) и выводит на консоль результаты: сложения, вычитания,
умножения и деления.
Вещественные числа можно запрашивать с консоли используя объект Scanner
 */
public class Task1Service {

    public double firstNumber (){
        Scanner scanner = new Scanner(System.in);
        System.out.println( "enter number " );
        double fistNumber = scanner.nextDouble();
        return fistNumber;
    }
    public double secondNumber () {
        Scanner scanner = new Scanner(System.in);
        System.out.println( "enter second number " );
        double secondNumber = scanner.nextDouble();
        return secondNumber;
    }
}
