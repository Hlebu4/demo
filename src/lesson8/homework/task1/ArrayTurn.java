package lesson8.homework.task1;

import java.util.Arrays;

public class ArrayTurn {


    int [] arrayTaskTurn = new int[20];
    int j = 0;
    public int[] turn (int [] arrayTask1) {
        for (int i = arrayTask1.length - 1; i >= 0; i--) {
            arrayTaskTurn[j] = arrayTask1[i];
            System.out.println(Arrays.toString(arrayTaskTurn));
            j++;
        }
        return arrayTaskTurn;
    }
}
