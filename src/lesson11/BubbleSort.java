package lesson11;

import java.util.Arrays;

public class BubbleSort {
    public void bubbleSort(int[] workingArray){
        boolean notSorted = true;
        int temp;
        int lengthSearch = 0;
        int sumIteration = 0;
        while (notSorted) {
            lengthSearch++;
            notSorted = false;
            for (int i = 0; i < workingArray.length - lengthSearch; i++) {
                sumIteration++;
                System.out.println(Arrays.toString(workingArray));
                System.out.println("sum iteration " + sumIteration + "  n =" + lengthSearch );
                if (workingArray[i] > workingArray[i + 1]) {
                    temp = workingArray[i];
                    workingArray[i] = workingArray[i + 1];
                    workingArray[i + 1] = temp;
                    notSorted = true;
                }
            }
        }

    }
}
