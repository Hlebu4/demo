package lesson7.homework;

import java.util.Random;

public class Task2Service {

        public int sumDay (int balance){
            int day = 0;
            System.out.println(" было на счету " + balance);
            while (balance > 0){
                day ++;
                System.out.println( " сняли со счета " + bankService(balance));
                balance -= bankService(balance);
                System.out.println(" осталось на счете " + balance);
            }
            return day;
        }

         public int bankService(int balance) {
            for (int i = balance /2 ; i > 0; i--) {
                if (balance % i == 0) {
                    return i;
                }
            }
        return 1;
         }

}
