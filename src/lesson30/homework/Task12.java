package lesson30.homework;

import java.util.ArrayDeque;
import java.util.Iterator;

/*
12. Создать ArrayDeque, добавить в него несколько элементов с каждой стороны,
извлечь элементы с одной из сторон и вывести на экран.

 */
public class Task12 {
    public static void main(String[] args) {

        ArrayDeque<Integer> array = new ArrayDeque<>();

        array.addFirst(9);
        array.addLast(1);
        array.addFirst(8);
        array.addFirst(7);
        array.addLast(1);

        System.out.println(array);

        while (!array.isEmpty()){
            Integer element = array.pollLast();
            System.out.println(element);
        }






    }
}
