package addHomeWork.add3;

public class Task4Demo {
    public static void main(String[] args) {

        Task4 bankAccount = new Task4("Vasiliy" , 1000);

        System.out.println("Owner = " + bankAccount.getOwner());
        System.out.println("Money = " + bankAccount.getMoney());
    }
}
