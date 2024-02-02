package lesson24.homework.task6;

import java.util.ArrayList;
import java.util.HashSet;

/*
Удаление дубликатов из списка:**
    - Создайте `ArrayList` с дублирующимися элементами.
    - Преобразуйте `ArrayList` в `HashSet`, чтобы автоматически удалить дубликаты.
    - Выведите новый список без дубликатов.
    - Добавьте новые элементы в `HashSet` и снова преобразуйте его обратно в `ArrayList`.
 */
public class Task6 {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(1);
        numbers.add(2);

        System.out.println(" ArrayList - " + numbers);

        HashSet<Integer> numberSet = new HashSet<>(numbers);

        System.out.println(" HashSet - " + numberSet);

        numberSet.add(5);

        ArrayList<Integer> newNumbers = new ArrayList<>(numberSet);

        System.out.println(" new ArrayList - " + newNumbers);
    }
}


