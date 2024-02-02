package lesson30.homework;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.ArrayList;

/*
3. * В классе IntegerListDemo создайте список целых чисел.
    Продемонстрируйте как:
   - добавить в список элемент (в начало и в конец)
   - узнать длину списка
   - удалить элемент из списка (по индексу и без)
   - узнать пустой список или нет
   - обойти список и вывести на консоль каждый элемент.

 */
public class Task3IntegerListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        System.out.println(numbers);

        numbers.addFirst(6);
        numbers.addLast(7);
        System.out.println(numbers);

        System.out.println(" The length of the List " + numbers.size());

        numbers.remove(6);
        System.out.println("remove 6 element "+ numbers);

        numbers.removeLast();
        System.out.println("remove last element " + numbers);

        System.out.println(" list is Empty - " + numbers.isEmpty());

        for (Integer number : numbers){
            System.out.println(number);
        }
    }
}
