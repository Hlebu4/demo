package lesson8.homework.task3;

import java.util.Arrays;

/*
3. **Поиск часто встречающегося элемента:** Создайте метод,
который находит элемент, который встречается чаще всего в массиве целых чисел.
Если таких элементов несколько, метод может вернуть любой из них.
 */
public class Task3Demo {
    public static void main(String[] args) {

        homework.task3.Task3Service tak3service = new homework.task3.Task3Service();
        int [] arrayTask3 = tak3service.arrayTask3random();
        System.out.println(Arrays.toString(arrayTask3));

        tak3service.elementMeetsMax(arrayTask3);
       // System.out.println(result);
    }
}
