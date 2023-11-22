package Lesson7;
/*
5. Пользователь ввел число N.
 Подсчитайте количество четных и не четных чисел в диапазоне от 0 до N

 */
public class Task5 {
    public static void main(String[] args) {

        UserInput ui = new UserInput();
        System.out.println(" Enter number ");
        int n = ui.userInputInt();

        int y = 0;
        int z = 0;

        for (int number = 0; number <= n; number++) {
            if (number % 2== 0){
            y = y + number;
        } else z = z+ number;

            }
        System.out.println( " сумма нечет = " + z + " сумма четных = " + y);

        }

    }

