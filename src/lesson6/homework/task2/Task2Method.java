package lesson6.homework.task2;
/*
Задание №2
Представим, что у нас есть устройство, в котором две колбы.
Прибор работает корректно, если температура первой колбы выше 100 градусов,
а температура второй колбы меньше 100 градусов.
Вы должны написать метод, который проверяет это устройство.
Ваша программа должна иметь переменные Temperature1 и Temperature2.
В результате он выводит сообщение true или false.
 */
public class Task2Method {


    boolean check;

    public boolean checkMethod(){

        UserInput temperature = new UserInput();
        System.out.println("Enter temperature first retort");
        double temperature1 = temperature.userInputDouble();
        System.out.println("Enter temperature first retort");
        double temperature2 = temperature.userInputDouble();

        if (temperature1 > 100 && temperature2 < 100){
            check = true;
        }
        else {
            check = false;
        }
        return check;
    }


}
