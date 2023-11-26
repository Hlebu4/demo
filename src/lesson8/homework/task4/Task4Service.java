package homework.task4;

import java.util.Random;

public class Task4Service {
    public int [] arrayRandom(){
        Random random = new Random();
        int [] arrayTask4 = new int[20];
        for (int i = 0; i < arrayTask4.length; i++) {
            arrayTask4[i] = random.nextInt(100);
        }
        return arrayTask4;
    }

    int numberMax = 0;
    int numberMin = 0;
    int difference = 0;
    public int differenceMaxMin (int [] arrayTask4){
        for (int i = 0; i < arrayTask4.length - 1; i++) {
                if (arrayTask4[i] > numberMax){
                    numberMax = arrayTask4[i];
                    numberMin = numberMax;
                }
        }
        for (int i = 0; i < arrayRandom().length; i++) {
            if (arrayTask4[i] < numberMin){
                numberMin = arrayTask4[i];
            }
        }
        difference = numberMax - numberMin ;
        System.out.println(" max number is - " + numberMax + "; min number is - " + numberMin);
        return difference;
    }
 }
