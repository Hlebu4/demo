package addHomeWork.add1;

import java.util.Arrays;

public class Task3Demo {
    public static void main(String[] args) {

    Task3Service task3Service = new Task3Service();
    int enterNumber = task3Service.scanner();
    int [] multiplicationTable = task3Service.multiplication(enterNumber);
        System.out.println(Arrays.toString(multiplicationTable));
    }
}
