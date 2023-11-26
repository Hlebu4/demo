package homework.task3;

import java.util.Random;

public class Task3Service {

    public int[] arrayTask3random() {
        Random random = new Random();
        int[] arrayRandom = new int[100];
        for (int i = 0; i < arrayRandom.length; i++) {
            arrayRandom[i] = random.nextInt(100);
        }
        return arrayRandom;
    }

    int elementMeets = 1;
    int elementMeetsSum =1;
    int n = 0;
    int elementMaxMeets = 0;
    int elementNumber = 0;

    public void elementMeetsMax (int [] arrayTask3){
        for (int i = 0; i < arrayTask3.length -1; i++) {
            n++;
            for (int j = n; j < arrayTask3.length ;j++) {

                if (arrayTask3[i] == arrayTask3 [j]){
                    elementMeets ++;
                    if (elementMeets > elementMeetsSum){
                        elementMeetsSum = elementMeets;
                        elementMaxMeets = arrayTask3[i];
                        elementNumber = i;
                    }
                }
            }
            elementMeets = 1;
        }
        System.out.println( "element - " + elementMaxMeets + " number - " + elementNumber+ " meets " + elementMeetsSum );
    }
}
