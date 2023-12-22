package lesson8.homework.task2;

public class Task2Service {

    boolean unique = true;

    int n = 0;
    public boolean isUnique (int [] arrayTask2){
        for (int i = 0; i < arrayTask2.length - 1 ; i++) {
            n++;
            for (int j = n; j < arrayTask2.length ; j++) {

                if(arrayTask2[i] == arrayTask2[j]){
                    System.out.println("element number " + i + " equal element number " + j );
                    unique = false;
                }
            }
        }
        return unique;
    }
}
