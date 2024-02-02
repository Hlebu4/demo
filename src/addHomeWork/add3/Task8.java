package addHomeWork.add3;
/*
Write a Java program that accepts three numbers and prints:
 -"All numbers are equal" if all three numbers are equal,
 - "All numbers are different" if all three numbers are different
 - "Neither all are equal or different" otherwise.
 */
public class Task8 {

    public void number (){
        int number1 = new UserInput().userInputInt(" enter first number");
        int number2 = new UserInput().userInputInt(" enter second number");
        int number3 = new UserInput().userInputInt(" enter third number");
        if (number1 == number2 && number1 == number3){
            System.out.println( " All numbers are equal " );
        } else if (number1 != number2 && number2 != number3 && number1 != number3) {
            System.out.println(" All numbers are different " );
        }else System.out.println( " Neither all are equal or different ");
    }

    public static void main(String[] args) {

        Task8 task8 = new Task8();

        task8.number();
    }
}
