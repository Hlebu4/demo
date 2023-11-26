package lesson6;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter first number: ");
        int x = scan.nextInt();
        Scanner scan2 = new Scanner(System.in);
        System.out.println("Please enter first number: ");
        int y = scan2.nextInt();
        Scanner scan3 = new Scanner(System.in);
        System.out.println("Please enter first number: ");
        int z = scan3.nextInt();



        if (z > x && z > y) {
            if (x > y) {
                System.out.println("Сортировка по убыванию: "+z +" - "+ x +" - "+ y);
                System.out.println("Сортировка по возрастанию: " +y +" - "+ x +" - "+ z);
            } else {
                System.out.println("Сортировка по убыванию: "+z +" - "+ y +" - "+ x);
                System.out.println("Сортировка по возрастанию: " + x +" - "+ y +" - "+z);
            }
        } else if (x > z && x > y) {
            if (z > y) {
                System.out.println("Сортировка по убыванию: "+x +" - "+ z +" - "+ y);
                System.out.println("Сортировка по возрастанию: " + y +" - "+ z +" - "+ x);
            } else {
                System.out.println("Сортировка по убыванию: "+x +" - "+ y +" - "+ z);
                System.out.println("Сортировка по возрастанию" + z+" - "+ y +" - "+x);
            }
        } else if (y > z && y > x) {
            if (z > x) {
                System.out.println("Сортировка по убыванию: "+y +" - "+ z +" - "+ x);
                System.out.println("Сортировка по возрастанию" + x +" - "+ z +" - "+y);
            } else {
                System.out.println("Сортировка по убыванию: "+ y +" - "+ x +" - "+ z);
                System.out.println("Сортировка по возрастанию" + z +" - "+ x +" - "+ y);
            }

        }
    }
}