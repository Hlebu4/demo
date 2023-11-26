package lesson5.homework.task2;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {

        Scanner scan1 = new Scanner(System.in);
        System.out.println("Введите первое слово");
        String scan1String = scan1.next();

        Scanner scan2 = new Scanner(System.in);
        System.out.println("Введите второе слово");
        String scan2String = scan2.next();

        int scanLength1 = scan1String.length()/2;
        int scanLength2 = (int) Math.ceil(scan2String.length()/2);

        String scan1Half = scan1String.substring(0,scanLength1);
        String scan2Half = scan2String.substring(scanLength2);
        String scan1scan2 = scan1Half + scan2Half;

        System.out.println("Первая половина первого слова и вторая половина второго слова - " + scan1scan2);














    }
}
