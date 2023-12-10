package lesson15.homework;

import java.util.Arrays;
import java.util.Random;

/*
5. Создайте массив из 12 случайных целых чисел из отрезка [-15;15].
Определите какой элемент является в этом массиве максимальным и
сообщите индекс его последнего вхождения в массив.
 */
public class Task5 {

    public static void main(String[] args) {
        int[] array = new int[12];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
        array[i] = random.nextInt(-15 , 15);
        }
        System.out.println(Arrays.toString(array));

        int counter = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] >= array[counter]){
                counter = i;
            }
        }
        System.out.println(" The biggest number in array is " + array[counter] + " and his index is " + counter);
    }
}