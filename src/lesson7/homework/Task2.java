package homework;


import lesson7.homework.Task2Service;

/*
Снять деньги
У вас на банковском счету N долларов. ВЫ хотите снять все,
но банк разрешает снять только сумму,
которая является делителем текущей суммы на счету и меньше текущей суммы.
Если вы снимаете максимально возможную сумму каждый день,
сколько дней вам понадобится, чтобы забрать все свои деньги из банка?
Примечание: если оставшаяся сумма равна 1, вы можете снять ее.

Пример
Ввод:  N = 21
Выход:  7
Объяснение:  N = 21
Снято 7, осталось = 14
Снято 7, осталось = 7
Снято 1, осталось = 6
Снято 3, осталось = 3
Снято 1, осталось = 2
Снято 1, Осталось = 1
Снято 1, осталось = 0
 */
public class Task2 {
    public static void main(String[] args) {

        Task2Service task2Service = new Task2Service();
        int days = 0;
        int accountMoney = task2Service.accountMoneyRandom();
        System.out.println( " sum in account " + accountMoney);

        while ( accountMoney > 0) {
            int withDraw = task2Service.bankService(accountMoney);
            accountMoney = accountMoney - withDraw;
            days ++;
            System.out.println(" day " + days + " withdraw " + withDraw + " remainder  " + accountMoney);
        }
        System.out.println("need  - " + days + " days ");

    }

}
