package lesson15.homework;

import java.util.Arrays;

/*
1. Напишите программу, которая меняет местами элементы одномерного массива из String в обратном порядке.
Не используйте дополнительный массив для хранения результатов.
 */
public class Task1 {
    public static void main(String[] args) {
        String counter;

        String[] array = { "one" , "two" , "three" , "four" , "five" };
        System.out.println(Arrays.toString(array));
        int n = array.length-1;
        for (int i = 0; i < array.length /2; i++) {
        counter = array[i];
        array[i] = array[n];
        array[n]=counter;
        n--;
        }
        System.out.println(Arrays.toString(array));
    }
}
