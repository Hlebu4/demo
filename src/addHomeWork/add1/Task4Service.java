package addHomeWork.add1;

import java.util.Scanner;

public class Task4Service {


    public double scan (){
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter your number ");
        double number = scanner.nextDouble();
        return number;
    }
    public void perimeter (double number){
        double perimeter = 2 * Math.PI * number;
        System.out.println("Perimeter = " + perimeter);
    }
    public void area (double number){
        double area = Math.PI * number * number;
        System.out.println(" Area = " + area);
    }


}
