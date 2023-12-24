package lesson7.homework.dop.taskProg;

import java.util.Random;

/*
Задача 1
- **Цель**: Получить n-ую степень числа и среднее арифметическое последовательности из n чисел.
 */
public class Task1 {

    public int degree (int number, int degree) {
        System.out.println(" число " + number + " в " + degree + " степени ");
        int numberDegree = number;
        for (int i = 1; i < degree; i++) {
            numberDegree *=number;
        }
        return numberDegree;
    }

    public double arithmeticMean (int number){
        System.out.println( " среднее арифметическое последовательности из " + number + " чисел ");
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            System.out.println( sum + " + " + i );
            sum += i;
            System.out.println( " = " + sum);
        }
        System.out.println( sum + " / " + number + " = ");
        return (double) sum / number;
    }

    public static void main(String[] args) {

        Task1 task1 = new Task1();
        Random random = new Random();

        System.out.println(task1.degree(random.nextInt(0,10), random.nextInt(0,10) ));
        System.out.println(" ====================== ");
        System.out.println(task1.arithmeticMean(random.nextInt(0,10)));
    }
}
