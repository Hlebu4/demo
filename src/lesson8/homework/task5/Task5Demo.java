package homework.task5;

import java.util.Arrays;

/*
 **Вычисление среднего значения элементов массива:** Напишите метод на Java,
 * который принимает массив целых чисел и возвращает их среднее значение. Если массив пуст,
 * метод должен возвращать 0. Например, для массива `[1, 2, 3, 4, 5]` среднее значение будет 3.

 */
public class Task5Demo {
    public static void main(String[] args) {

        Task5Service task5Service = new Task5Service();
        int [] arrayTask5 = task5Service.arrayRandom();
        System.out.println(Arrays.toString(arrayTask5));

        double result = task5Service.middleValue(arrayTask5);
        System.out.println(result);

    }
}
