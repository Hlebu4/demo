package lesson11.homework;

import java.util.Random;

public class Task1Service {

    public int [] arrayRandom (int arrayLength){
        Random random = new Random();
        int [] arrayTask1 = new int[arrayLength];
        for (int i = 0; i < arrayTask1.length; i++) {
            arrayTask1[i] = random.nextInt(99);
        }
        return arrayTask1;
    }


    public int [] arraySort(int[] arrayTask1){
        for (int i = 1; i < arrayTask1.length; i++) {

            int currentElement = arrayTask1[i];
            int j = i - 1;
            while ((j >= 0) && (currentElement < arrayTask1[j])) {
                arrayTask1[j+1] = arrayTask1[j];
                j--;
            }
            arrayTask1[j+1] = currentElement;
        }
        return arrayTask1;
    }


    public int binarySearch (int [] arrayTask1, int searchNumber){
        int min = 0;
        int max = arrayTask1.length - 1;

    while (min <= max){
        int i = min + (max - min)/2;
        System.out.println( " search " + i);

        if (arrayTask1[i] == searchNumber){
            return i;
        }
        else if (arrayTask1[i] < searchNumber) {
            min = i + 1;
        }
        else if (arrayTask1[i] > searchNumber){
            max = i - 1;
        }
    }
    return -1;
    }
}



