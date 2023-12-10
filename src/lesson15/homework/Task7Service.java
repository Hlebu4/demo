package lesson15.homework;

import java.util.Arrays;
import java.util.Random;

/*
7. Создайте 2 массива из 5 случайных целых чисел из отрезка [0;5] каждый
   Выведите массивы на экран в двух отдельных строках.
   Посчитайте среднее арифметическое элементов каждого массива и сообщите,
   для какого из массивов это значение оказалось больше (либо сообщите, что их средние арифметические равны)
 */
public class Task7Service {

        int [] array = new int[5];
        public int[] arrayRandom (int length) {
            for (int i = 0; i < length; i++) {
                array[i] = new Random().nextInt(0, 5);
            }
            System.out.println(Arrays.toString(array));
            return array;
        }

        public int sumArray (int [] array){
            int sumArray = 0;
            for (int i = 0; i < array.length; i++) {
                sumArray += array[i];
            }
            System.out.println(sumArray);
            return sumArray;
        }

        public double arithmeticMeanArray (int sumArray){
            double arithmeticMeanArray = (double) sumArray / array.length;
            System.out.println(arithmeticMeanArray);
            return arithmeticMeanArray;
        }

        public void result (double arithmeticMeanArray1 , double arithmeticMeanArray2 ){
            if (arithmeticMeanArray1 > arithmeticMeanArray2){
                System.out.println(" Arithmetic mein array1 biggest and equal " + arithmeticMeanArray1 );
            } else if (arithmeticMeanArray2 > arithmeticMeanArray1) {
                System.out.println(" Arithmetic mein array2 biggest and equal " + arithmeticMeanArray2 );
            }else   System.out.println(" Arithmetic mein array1 equal Arithmetic mein array2 " + arithmeticMeanArray1 + " = " + arithmeticMeanArray2  );
        }
}
