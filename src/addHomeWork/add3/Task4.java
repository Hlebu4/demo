package addHomeWork.add3;
/*
Найти логическую ошибку в коде.
Исправить и запустить программу так, что бы она выводила
на консоль владельца банковского счёта и количество денег.

class BankAccount {

    String owner;
    int money;

    BankAccount(int moneyAmount) {
        this.owner = owner;
    }

    String getOwner() {
        return this.owner;
    }

    void getMoney() {
        return this.money;
    }

}

class BankAccountDemo {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Viktor", 100000);
        String ownerFirstName = bankAccount.getOwner();
        String moneyAmount = bankAccount.getMoney();
        System.out.println("Owner = " + owner);
        System.out.println("Money = " + money);
    }

}

 */
public class Task4 {

    private String owner;
    private int money;

    public Task4(String owner, int money) {
        this.owner = owner;
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getOwner() {
        return owner;
    }
}


