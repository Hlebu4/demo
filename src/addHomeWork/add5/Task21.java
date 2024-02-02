package addHomeWork.add5;

import java.util.Random;

/*
Создайте класс TwoDimensionalArray и в нём напишите программу в которой:
  - создайте двумерный массив;
  - заполните двумерный массив случайными числами;
  - посчитайте сумму всех чисел в двумерном массиве.
 */
public class Task21 {

    Random random = new Random();

    public Integer [][] arrayRandom (Integer [][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array [i][j] = random.nextInt(99);
            }
        }
        return array;
    }

    public void printArray (Integer [][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.println( array [i][j] + " ");
            }
            System.out.println();
        }
    }

    public Integer sumArrayNumber (Integer [][] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                sum+= array[i][j];
            }
        }
        return sum;
    }


}
