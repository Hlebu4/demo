package addHomeWork.add3;
/*
Написать программу, которая запрашивает у пользователя
два целых числа и выводит на консоль наибольшее из них.
Нельзя пользоваться классом Math, можно использовать только if else.
 */
public class Task5_2 {
    public static void main(String[] args) {
        Task5_2 number = new Task5_2();
        number.printMaxNumber();

    }

    UserInput ui = new UserInput();

    public void printMaxNumber(){
        int number1 = ui.userInputInt("enter first number ");
        int number2 = ui.userInputInt("enter second number ");
        if (number1 > number2)
            System.out.println(" number 1 = " + number1);
        else if (number2 > number1) {
            System.out.println( " number 2 = " + number2);
        }
        else System.out.println( " number 1 = number 2 and = " + number2);
    }


}
