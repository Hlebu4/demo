package lesson7;
/*
 Используйте цикл, чтобы просуммировать все числа,
 которые ввел пользователь, до первого отрицательного.
 */
public class Task3 {
    public static void main(String[] args) {


        UserInput ui = new UserInput();

        boolean n = true;
        int x = 0;


        while (n) {
            System.out.println("Please enter number");
            int number = ui.userInputInt();
            if ( number>= 0){
                x = x + number;
            }
            else {
                n = false;
            }

            }
        System.out.println("sum = " + x);

    }
}
