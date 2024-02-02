package addHomeWork.add3;
/*
Написать программу, которая запрашивает у пользователя
три целых числа и выводит на консоль наибольшее из них.

PS: перед решением этой задачи распишите на бумаге
или в коментарии все возможные варианты (комбинации).
Это поможет вам правильно написать программу!
Нельзя пользоваться классом Math.
 */
public class Task10 {
    public void maxNumber (){
        int number1 = new UserInput().userInputInt(" enter first number");
        int number2 = new UserInput().userInputInt(" enter second number");
        int number3 = new UserInput().userInputInt(" enter third number");
        int [] numbers = new int[] {number1,number2,number3};
        int maxNumber = number1;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > maxNumber){
                maxNumber = numbers[i];
            }
        }
        System.out.println( " max number is " + maxNumber);
    }

    public static void main(String[] args) {
        Task10 task10 = new Task10();

        task10.maxNumber();
    }
}
