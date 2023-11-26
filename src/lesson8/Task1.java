package lesson8;

import java.util.Arrays;
import java.util.Random;

public class Task1 {

    public static void main(String[] args) {
        UserInput ui = new UserInput();
        System.out.println("Enter array size -");
        int arraySize = ui.userInputInt();

        Random random = new Random();


        int[] intArray = new int[arraySize];

        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = random.nextInt(100);
        }

        System.out.println(Arrays.toString(intArray));

        int max = intArray[0];
        int indexMax = 0;
        int sumArray = 0;

        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] > max) {
                max = intArray[i];
            }
        }

        for (int i = 0; i < intArray.length; i++) {
            sumArray = sumArray + intArray[i];
        }

        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] > max) {
                indexMax = i;
            }
        }

        System.out.println(" max = " + max + " Index max - " + indexMax + " Sum arraz = " + sumArray);


    }
}