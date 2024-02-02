package lesson30.homework;

import java.util.ArrayDeque;
import java.util.Stack;

/*
11. Создать Stack, добавить в него несколько элементов. Проверить есть ли в коллекции заданный элемент.
Если есть, то найти его глубину и вывести на экран.

 */
public class Task11 {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.add(1);
        stack.add(2);
        stack.add(13);
        stack.add(41);
        stack.add(5);

        System.out.println(stack);

        System.out.println("contains 2 in stack " + stack.contains(2));

        System.out.println(" depth " + stack.search(2));
    }
}
