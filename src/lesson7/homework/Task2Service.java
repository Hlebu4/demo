package lesson7.homework;

import java.util.Random;

public class Task2Service {

    public int accountMoneyRandom() {
        Random random = new Random();
        return random.nextInt(10000);
    }


    public int bankService(int balance) {
        for (int i = balance / 2; i > 0; i--) {
            if (balance % i == 0) {
                return i;
            }
        }
        return 1;
    }

}
