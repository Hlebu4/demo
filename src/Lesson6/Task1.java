package Lesson6;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        int x;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 'x' value -> ");
        x = scanner.nextInt();

        int y = 10;
        int z = 100;
        int i = 1000;

        double y1 = y / 2 + z / 2;
        double z1 = z / 2 + i / 2;

        if (x > 0 && x <= 1000) {
            if (x < y1) {
                System.out.println("x ближе к 10");
            } else if (x < z1) {
                System.out.println("х ближе к 100");
            } else {
                System.out.println(" x ближе к 1000");
            }


        }
    }
}