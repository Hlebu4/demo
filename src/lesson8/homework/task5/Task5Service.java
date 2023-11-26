package homework.task5;

import java.util.Random;

public class Task5Service {

    public int [] arrayRandom (){
        Random random = new Random();
        int [] arrayTask5 = new int[10];
        for (int i = 0; i < arrayTask5.length; i++) {
            arrayTask5[i]= random.nextInt(10);
        }
        return arrayTask5;
    }

    int sumArray = 0;
    int sumElement = 0;
    double middleValueArray = 0;
    public double middleValue (int [] arrayTask5){
        for (int i = 0; i < arrayTask5.length; i++) {
            sumArray = sumArray + arrayTask5[i];
            sumElement++;
            System.out.println( " summ " + sumArray + " summ element " + sumElement);
        }
        middleValueArray = (double) sumArray / sumElement ;
        return middleValueArray;
    }
}
