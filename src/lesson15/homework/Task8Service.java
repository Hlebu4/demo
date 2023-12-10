package lesson15.homework;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
8. Пользователь должен ввести с клавиатуры размер массива - натуральное число больше 3.
Введенное пользователем число сохраняется в переменную n.
Если пользователь ввёл не подходящее число, то программа должна просить пользователя повторить ввод.
Создать массив из n случайных целых чисел из отрезка [0;n] и вывести его на экран.
Создать второй массив только из чётных элементов первого массива, если они там есть, и вывести его на экран.
 */
public class Task8Service {

    public int arrayLength (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array size > 3");
        int n = scanner.nextInt();
        while (n <= 3){
            System.out.println("Enter array size > 3 ");
            n = scanner.nextInt();
        }
        return n;
    }
     public void arrayRandom (int length){
         Random random = new Random();
         int [] array = new int[length];
         for (int i = 0; i < array.length; i++) {
             array[i] = random.nextInt(0,length);
         }
         System.out.println(Arrays.toString(array));
     }



}
