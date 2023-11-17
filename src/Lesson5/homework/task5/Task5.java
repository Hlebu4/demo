package Lesson5.homework.task5;
/*
. Задание №5
Реализовать программу, выводящую на экран результаты сложения,
вычитания, умножения и деления двух чисел, введенных пользователем.
Каждая из арифметических операций должна быть реализована как отдельный метод.
Ввод пользователем данных реализуйте отдельным классом с соответствующим методом.
 */
public class Task5 {

    private int x;
    private int y;


    public Task5(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int sum() {
        int resultSum = x + y;
        return resultSum;
    }

    public int sub() {
        int resultSub = x - y;
        return resultSub;
    }

    public int mul() {
        int resultMul = x * y;
        return resultMul;
    }

    public double div() {
        double resultDiv = (double) x / y;
        return resultDiv;
    }

}



