package lesson8.homework.task1;
/*
**Перевернуть массив:** Создайте метод, который принимает массив целых чисел и
    возвращает его в перевернутом порядке.
    Например, если входной массив `[1, 2, 3, 4]`, то результат должен быть `[4, 3, 2, 1]`.
 */
import java.util.Arrays;
import java.util.Random;

public class Task1Demo {
    public static void main(String[] args) {

        Random random = new Random();
        int[] arrayTask1 = new int[20];
        for (int i = 0; i < arrayTask1.length; i++) {
            arrayTask1[i] = random.nextInt(100);
        }

        System.out.println(Arrays.toString(arrayTask1));
        System.out.println("============================");


         ArrayTurn arrayTurn = new ArrayTurn();
         int [] arrayResult = arrayTurn.turn(arrayTask1);
         System.out.println(Arrays.toString(arrayResult));
    }
}


