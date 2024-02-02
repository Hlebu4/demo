package addHomeWork.add3;
/*
Write a program that accepts three numbers from the user and prints:
- "increasing" if the numbers are in increasing order,
- "decreasing" if the numbers are in decreasing order,
- "Neither increasing or decreasing order" otherwise.
 */
public class Task9 {
    public void number (){
        int number1 = new UserInput().userInputInt(" enter first number");
        int number2 = new UserInput().userInputInt(" enter second number");
        int number3 = new UserInput().userInputInt(" enter third number");
        if (number1 < number2 && number2 < number3){
            System.out.println( " increasing" );
        } else if (number1 > number2 && number2 > number3) {
            System.out.println(" decreasing " );
        }else System.out.println( " Neither increasing or decreasing order");
    }

    public static void main(String[] args) {

        Task9 task9 = new Task9();

        task9.number();
    }

}
