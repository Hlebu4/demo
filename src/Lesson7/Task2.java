package Lesson7;
/*
2. проверить является ли число которое ввел пользователь - простым
(делится без остатка только на 1 и на себя)

 */
public class Task2 {
    public static void main(String[] args) {

        UserInput ui = new UserInput();
        System.out.println("Enter number ");
        int x = ui.userInputInt();
        boolean y = true;

        for (int i = 2; i < x ; i++) {
            if ( x % i != 0 ){
            }
            else {
                y = false;
            }
        }
        System.out.println(y);

    }
}
