package lesson8.homework.task2;


import java.util.Arrays;
import java.util.Random;

/*
2. **Проверка на уникальность элементов:** Напишите функцию, которая проверяет,
все ли элементы в массиве уникальны. Функция должна возвращать `true`,
если все элементы уникальны, и `false`, если найдены дубликаты.
 */
public class Task2Demo {
    public static void main(String[] args) {

        Random random = new Random();
    int [] arrayTask2 = new int[20];

        for (int i = 0; i < arrayTask2.length; i++) {
            arrayTask2[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(arrayTask2));

        Task2Service task2Service = new Task2Service();

        System.out.println(task2Service.isUnique(arrayTask2));





    }
}
