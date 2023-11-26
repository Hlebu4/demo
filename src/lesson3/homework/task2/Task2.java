package lesson3.homework.task2;
/*
**Задача 2.**
Объявите 10 переменных типа int со значениями 0, 1, 2, 3, 4, 5, 6, 7, 8, 9.
Объявите ещё одну переменную int и сохраните в неё сумму этих переменных, деленную на 10.
Получается, у вас будет среднее арифметическое этих чисел в одной переменной.
Распечатайте её через println. Сколько программа отбросила в дробной части?

 */
public class Task2 {
    public static void main(String[] args) {

        int x  = 0;
        int x1 = 1;
        int x2 = 2;
        int x3 = 3;
        int x4 = 4;
        int x5 = 5;
        int x6 = 6;
        int x7 = 7;
        int x8 = 8;
        int x9 = 9;

        int sum = (x+x1+x2+x3+x4+x5+x6+x7+x8+x9) % 10;

        System.out.println("Remainder = " + sum);


    }


}
