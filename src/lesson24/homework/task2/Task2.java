package lesson24.homework.task2;

import java.util.*;

/*
Операции с числовым списком:**
    - Создайте `LinkedList` для хранения целых чисел.
    - Добавьте в список случайные числа в диапазоне от 1 до 100.
    - Найдите и выведите максимальное и минимальное числа в списке.
    - Отсортируйте список в порядке возрастания и выведите его.

 */
public class Task2 {
    public static void main(String[] args) {

        Random random = new Random();
        LinkedList<Integer> numbers = new LinkedList<>();

        for (int i = 0; i < 30; i++) {
            numbers.add(i, random.nextInt(100));
        }
        System.out.println(numbers);

        Iterator<Integer> iterator = numbers.listIterator();
        Integer maxnumber = iterator.next();
        Integer minnumber = iterator.next();
        while (iterator.hasNext()){
            Integer element = iterator.next();
            if (maxnumber<element){
                maxnumber = element;
            } else if (minnumber >element) {
                minnumber = element;
            }
        }
        System.out.println("max number = " + maxnumber);
        System.out.println("min number = " + minnumber);


        Collections.sort(numbers);
        System.out.println(numbers);


    }
}
