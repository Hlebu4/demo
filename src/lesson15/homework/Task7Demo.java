package lesson15.homework;

import java.util.Arrays;

public class Task7Demo {
    public static void main(String[] args) {

        Task7Service task7Service = new Task7Service();

        int [] array1 = task7Service.arrayRandom(5);
        int sumArray1 = task7Service.sumArray(array1);
        double mienArithmetic1 = task7Service.arithmeticMeanArray(sumArray1);


        int [] array2 = task7Service.arrayRandom(5);
        int sumArray2 = task7Service.sumArray(array2);
        double mienArithmetic2 = task7Service.arithmeticMeanArray(sumArray2);


        task7Service.result(mienArithmetic1 , mienArithmetic2);
    }
}
