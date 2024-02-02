package addHomeWork.add3;
/*
Написать программу, которая запрашивает у пользователя
два целых числа и выводит на консоль:
- "Numbers are equals" - если числа равны
- "Numbers are different" - если числа не равны
 */
public class Task7 {
    public static void main(String[] args) {
        Task7 number = new Task7();
        number.printMaxNumber();

    }

    UserInput ui = new UserInput();

    public void printMaxNumber(){
        int number1 = ui.userInputInt("enter first number ");
        int number2 = ui.userInputInt("enter second number ");
        if (number1 == number2)
            System.out.println(" Numbers are equals ");
        else  {
            System.out.println( " Numbers are different");
    }
}
}
