package lesson7.homework;

import java.util.Random;

public class Task2Service {

        Random random = new Random();


    public int bankService() {
        int balance = 21;
        System.out.println(" sum in account " + balance);
        int days = 0;
            for (int i = balance /2 ; balance > 0; i--) {
                if (balance % i == 0) {
                    balance = balance - i;
                    days ++;
                    System.out.println (" days " + days + " snyatie " + i );
                    System.out.println(" ostatok " + balance);
                }
            }
        return days;
    }

}
