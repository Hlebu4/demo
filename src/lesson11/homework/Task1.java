package lesson11.homework;
//  написать код для бинарного поиска

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {

        Task1Service task1Service = new Task1Service();

        int [] array = task1Service.arrayRandom(99);
        System.out.println(Arrays.toString(array));

        array = task1Service.arraySort(array);
        System.out.println(Arrays.toString(array));

        int searchNumber = task1Service.binarySearch(array , 70);
           System.out.println(" search element is " + searchNumber);


    }
}
