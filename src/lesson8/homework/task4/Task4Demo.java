package lesson8.homework.task4;

import java.util.Arrays;

/*
4. **Определение диапазона чисел в массиве:** Разработайте программу на Java,
которая анализирует массив целых чисел и определяет разницу между наибольшим и наименьшим значениями.
Например, для массива `[3, 7, 2, 9, 4]` программа должна сообщить,
что разница между максимальным (9) и минимальным (2) значениями равна 7.
 */
public class Task4Demo {
    public static void main(String[] args) {

        Task4Service task4Service = new Task4Service();

        int [] arrayTask4 = task4Service.arrayRandom();
        System.out.println(Arrays.toString(arrayTask4));

        task4Service.differenceMaxMin(arrayTask4);
        System.out.println("difference = " + task4Service.difference);
    }
}
