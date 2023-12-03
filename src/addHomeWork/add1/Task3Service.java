package addHomeWork.add1;

import java.util.Scanner;

public class Task3Service {
    public int scanner (){
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Plies enter number ");
        int number = scanner.nextInt();
        return number;
    }

    public int[] multiplication (int number){
        int [] multiplicationTable = new int[10];
        for (int i = 0; i <= 9; i++) {
            multiplicationTable[i] = number * (i + 1);
            System.out.println( number + " * " + (i + 1) + " = " + multiplicationTable[i]);
        }
        return multiplicationTable;
    }
}
